
package com.yx.cdss.extract.provider.controller;

import com.alibaba.fastjson.JSON;
import com.yx.cdss.extract.provider.bo.StudentRequBo;
import com.yx.cdss.extract.provider.common.WResult;
import com.yx.cdss.extract.provider.serice.cure.ResponseBo;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: DemoController
 * @version 2.0
 * @Desc: 模擬死鎖現象
 * @author Jack
 * @date 2019年1月25日上午11:02:10
 * @history v2.0
 *
 */
@RestController
public class DeadLockController {
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	@Autowired
	private RestTemplate restTemplate;
	//@Value("${spring.application.name}")
	//private String appName;

	@ApiOperation(value = "演示动态获取Nacos节点Ip")
	@GetMapping("/echo/app-name")
	public WResult echoAppName(){
		WResult result = WResult.newInstance();
		//Access through the combination of LoadBalanceClient and RestTemplate
		String projId = "file-provider";
		ServiceInstance serviceInstance = loadBalancerClient.choose(projId);
		String url = String.format("http://%s:%s/queryInfo",serviceInstance.getHost(),serviceInstance.getPort());
		System.out.println(">>> request url:" +url);
		StudentRequBo studentRequBo = new StudentRequBo();
		studentRequBo.setAddr("深圳");
		studentRequBo.setIdCard("90010000001");
		studentRequBo.setName("谷海江");
		result = restTemplate.postForObject(url,studentRequBo,WResult.class);
		//result = restTemplate.getForObject(path,WResult.class,studentRequBo);
		System.out.println(" 请求结果数据："+ JSON.toJSON(result));
		return result;
	}
	//Instantiate RestTemplate Instance
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	@ApiOperation(value = "模拟线程死锁", notes = "模拟线程死锁")
	@RequestMapping(value = "/simulateDeadLock", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public ResponseBo simulateDeadLock(@RequestBody JSONObject requestBo) {
		System.out.println("====>接收到信息："+requestBo);
		ResponseBo resp = new ResponseBo();
		MyResource r1 = new MyResource(888);
		MyResource r2 = new MyResource(999);
		Thread t1 = new Thread(new LockThread1(r1, r2));
		t1.setName("ThreadLock1");
		Thread t2 = new Thread(new LockThread2(r1, r2));
		t2.setName("ThreadLock2");
		t1.start();
		t2.start();
		resp.setMsg("You are Success!");
		return resp;
	}

	class LockThread1 implements Runnable {

		private MyResource r1;
		private MyResource r2;

		public LockThread1(MyResource r1, MyResource r2) {
			super();
			this.r1 = r1;
			this.r2 = r2;
		}

		@Override
		public void run() {

			while (true) {
				synchronized (r1) {
					System.out.println("=== 线程[" + Thread.currentThread().getName() + "-"
							+ Thread.currentThread().getId() + "]获得了 R1 锁");
					synchronized (r2) {
						System.out.println("=== 线程[" + Thread.currentThread().getName() + "-"
								+ Thread.currentThread().getId() + "]获得了  R2 锁");
					}
				}
			}
		}
	}

	class LockThread2 implements Runnable {

		private MyResource r1;
		private MyResource r2;

		public LockThread2(MyResource r1, MyResource r2) {
			super();
			this.r1 = r1;
			this.r2 = r2;
		}

		@Override
		public void run() {
			while (true) {
				synchronized (r2) {
					System.out.println("=== 线程[" + Thread.currentThread().getName() + "-"
							+ Thread.currentThread().getId() + "获得了 R2 锁");
					synchronized (r1) {
						System.out.println("=== 线程[" + Thread.currentThread().getName() + "-"
								+ Thread.currentThread().getId() + "]获得了 R1 锁");
					}
				}
			}
		}
	}

	class MyResource {

		// ��Դ�����
		private Integer no;

		public MyResource(Integer no) {
			super();
			this.no = no;
		}

		public Integer getNo() {
			return no;
		}

		public void setNo(Integer no) {
			this.no = no;
		}
	}

}
