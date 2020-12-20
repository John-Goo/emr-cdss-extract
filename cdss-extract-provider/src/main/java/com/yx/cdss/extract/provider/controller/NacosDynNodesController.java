
package com.yx.cdss.extract.provider.controller;

import com.alibaba.fastjson.JSON;
import com.yx.cdss.extract.provider.bo.StudentRequBo;
import com.yx.cdss.extract.provider.common.WResult;
import com.yx.cdss.extract.provider.serice.cure.ResponseBo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import sun.security.util.AuthResources_sv;

import javax.annotation.Resource;

/**
 * @ClassName: NacosDynNodesController
 * @version 2.0
 * @Desc: Nacos节点IP动态获取
 * @author Jack
 * @date 2019年1月25日上午11:02:10
 * @history v2.0
 *
 */
@Slf4j
@RestController
@Api(tags = "API调用Nacos接口")
public class NacosDynNodesController {

	public static final String _PROJ_ID = "file-provider";
	public static final String _SERVLET_PATH="/queryInfo";

	@Resource
	private LoadBalancerClient loadBalancerClient;
	@Resource
	private RestTemplate restTemplate;
	//@Bean
	//public RestTemplate restTemplate(){
		//return new RestTemplate();
	//}

	@ApiOperation(value = "演示动态获取Nacos节点Ip")
	@GetMapping("/get/nodeIp")
	public WResult echoAppName(){
		WResult result = WResult.newInstance();
		ServiceInstance serviceInstance = loadBalancerClient.choose(_PROJ_ID);
		String url = String.format("http://%s:%s"+ _SERVLET_PATH,serviceInstance.getHost(),serviceInstance.getPort());
		log.info(">>> 节点URL:" +url);
		StudentRequBo studentRequBo = new StudentRequBo();
		studentRequBo.setAddr("深圳");
		studentRequBo.setIdCard("90010000001");
		studentRequBo.setName("谷海江");
		log.info(" 请求post数据："+ JSON.toJSON(studentRequBo));
		result = restTemplate.postForObject(url,studentRequBo,WResult.class);
		//result = restTemplate.getForObject(path,WResult.class,studentRequBo);
		log.info(" 请求结果数据："+ JSON.toJSON(result));
		return result;
	}


}
