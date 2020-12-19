package com.yx.cdss.extract.provider.controller;

import com.yx.cdss.extract.model.entity.DictDrug;
import com.yx.cdss.extract.provider.bo.QueryDictDrugReq;
import com.yx.cdss.extract.provider.common.WResult;
import com.yx.cdss.extract.provider.common.lock.LockThread1;
import com.yx.cdss.extract.provider.common.lock.LockThread2;
import com.yx.cdss.extract.provider.common.lock.MyResource;
import com.yx.cdss.extract.provider.serice.dict.DictionaryService;
import com.yx.cdss.extract.provider.serice.examine.AuditWorkflowService;
import com.yx.cdss.extract.provider.util.BeanCopyUtil;
import com.yx.cdss.extract.provider.util.DemoUtil;
import com.yx.cdss.extract.provider.util.SpringUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
public class DictController {
	
	@Resource
	private DictionaryService dictionaryService;

	@Resource
	private AuditWorkflowService auditWorkflowService;

	@ApiOperation(value = "查询字典888-药物",position = 4 )
	@RequestMapping(value = "/queryDictDrug", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public WResult<List<DictDrug>> queryDictDrug(@RequestBody QueryDictDrugReq requestBo) {
		System.out.println("访问线程："+Thread.currentThread().getId());
		WResult result = new WResult();
		System.out.println(">>>接收到参数："+requestBo.getDrugCode());
		List<DictDrug> ddList = dictionaryService.queryDictDrug(requestBo.getDrugCode());
		result.ok(ddList);
		// Adapter Pattern适应于接口不兼容的问题，采用适配器模式来进行转换
		// 一个接口到另外一个接口，实现
		//auditWorkflowService.insert(null);
		return result;
	}


	@ApiOperation(value = "案例一：选择垃圾收集器")
	@RequestMapping(value = "/selectCollector", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public WResult selectCollector(@RequestParam String describe) {
		System.out.println("接收到参数===>"+describe);
		List<DictDrug> ddList = dictionaryService.queryDictDrug("800-1");
		final DictDrug dd = ddList.get(0);
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					DictDrug dest = new DictDrug();
					BeanCopyUtil.copyBean(dd, dest);
					System.out.println(dd.getDrugCode());
				}
				
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					DictDrug dest = new DictDrug();
					BeanCopyUtil.copyBean(dd, dest);
					System.out.println(dd.getDrugCode());
				}
				
			}
		});
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					DictDrug dest = new DictDrug();
					BeanCopyUtil.copyBean(dd, dest);
					System.out.println(dd.getDrugCode());
				}
				
			}
		});
		t1.start();
		t2.start();
		t3.start();
		WResult result  = new WResult();
		result.failer("案例一：选择垃圾收集器");
		return result;
	}
	
	
	

	
	@ApiOperation(value = "案例二：生成内存快照dump文件" )
	@RequestMapping(value = "/generateMemDump", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public WResult generateMemDump(@RequestParam String describe) {
		System.out.println("接收到参数===>"+describe);
		List newDictDrugList = new ArrayList();
		boolean exit = false;
		List<DictDrug> ddList = dictionaryService.queryDictDrug("800-1");
		int count =1 ;
		while(!exit) {
			
			DictDrug dd = ddList.get(0);
			DictDrug dest = new DictDrug();
			BeanCopyUtil.copyBean(dd, dest);
			//System.out.println("====> 加载数据："+ddList.size());
			newDictDrugList.add(dest);
		    //exit=true;
		}
		return new WResult();
	}
	
	
	
	@ApiOperation(value = "案例三：频繁full GC",position = 2 )
	@RequestMapping(value = "/simulateFrequentGC", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public WResult simulateFrequentGC(@RequestParam String describe) {
		System.out.println("接收到参数===>"+describe);
		final List<DictDrug> ddList = dictionaryService.queryDictDrug("800-1");
		final DictDrug dd = ddList.get(0);
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					DictDrug dest = new DictDrug();
					BeanCopyUtil.copyBean(dd, dest);
					ddList.add(dest);
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					DictDrug dest = new DictDrug();
					BeanCopyUtil.copyBean(dd, dest);
					ddList.add(dest);
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		t1.start();
		t2.start();
		return new WResult();
	}
	
	
	@ApiOperation(value = "案例四：线程死锁检测方法 ",position = 3 )
	@RequestMapping(value = "/simulateDeadLock", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public WResult simulateDeadLock(@RequestParam String describe) {
		System.out.println("接收到参数===>"+describe);
		MyResource r1 = new MyResource(888);
		MyResource r2 = new MyResource(999);
		Thread t1 = new Thread(new LockThread1(r1, r2));
		t1.setName("ThreadLock1");
		Thread t2 = new Thread(new LockThread2(r1, r2));
		t2.setName("ThreadLock2");
		t1.start();
		t2.start();
		return new WResult();
	}
	
	

	
	
	@ApiOperation(value = "插入字典-药物",position = 5 )
	@RequestMapping(value = "/insertDictDrug", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public WResult insertDictDrug(@RequestParam Integer count) {
		Long start = new Date().getTime();
		System.out.println("接收到参数："+count);
		int insertCnt = 100;
		if(count !=null ) {
			for(int i=1;i<count;i++) {
				DictDrug dd = DemoUtil.createDictDrug(i);
				dictionaryService.insert(dd);
				insertCnt++;
			}
		}
		Long end = new Date().getTime();
		Long total = (end - start)/1000;
		
		WResult result = new WResult();
		result.ok("插入数据库条数："+insertCnt+",消耗时间（秒）："+total);
		return result;
	}
	
	
	@ApiOperation(value = "==>演示数据库连接池")
	@RequestMapping(value = "/datasourcePool", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public WResult<List<DictDrug>> datasourcePool(@RequestParam String describe) {
		WResult<List<DictDrug>> result = new WResult<List<DictDrug>>();
		System.out.println("===>接收到参数:"+describe);
		for(int i=0;i<100;i++) {
			new Thread(()->{
				int j =new Random().nextInt(1000);
				String prefix="800-"+j;
				System.out.println(">>> 当前执行线程："+Thread.currentThread().getId()+",业务参数："+prefix);
				final List<DictDrug> ddList = dictionaryService.queryDictDrug(prefix);
				System.out.println("===>查询结果："+ddList.size());
				result.ok(ddList);
			}).start(); 
		}
		
		return result;
	}
	

}

class MyThread implements Runnable{
	
	private volatile  String drugCode;
	
    public MyThread(String drugCode) {
    	this.drugCode = drugCode;
    }

	@Override
	public void run() {
		DictionaryService dictionaryService = (DictionaryService) SpringUtil.getBean("dictionaryService");
		List<DictDrug> ddList = dictionaryService.queryDictDrug(drugCode);
		System.out.println("====> 加载数据："+ddList.size());
		for(DictDrug dd : ddList) {
			dd.setAttribute5("已处理");
		}
	}
	
}
