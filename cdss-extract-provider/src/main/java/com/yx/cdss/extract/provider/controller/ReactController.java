/******************************************************************************
 * Copyright (C) 2017  ShenZhen INNOPRO Co.,Ltd
 * All Rights Reserved.
 * 本软件为精华隆智慧感知科技（深圳）股份有限公司开发研制。未经本公司正式书面同意，其他任何个人、团体
 * 不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.yx.cdss.extract.provider.controller;

import com.yx.cdss.extract.provider.bo.CureNurseMedicalOrderBo;
import com.yx.cdss.extract.provider.serice.cure.ResponseBo;
import com.yx.cdss.extract.provider.util.BeanCopyUtil;
import com.yx.cdss.extract.provider.util.SpringUtil;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName: CustomerController
 * @version 2.0
 * @Desc: 客户信息业务处理
 * @author Jack
 * @date 2019年1月25日上午11:02:10
 * @history v2.0
 *
 */
@RestController
public class ReactController {
	
	

	@ApiOperation(value = "json数据", notes = "json数据\"")
	@RequestMapping(value = "/dictDrug", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
	public ResponseBo testJson(@RequestBody JSONObject  requestBo) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 标识服务类型
		System.out.println(">>>> request parameters:"+requestBo.toString());
		String bizIdentify = requestBo.getString("bizIdentify");
		String[] metaArray = bizIdentify.split("/");
		String execMethod = metaArray[1];
		String servCls = metaArray[0];
		//获取接口实例对象
		Object servObj = SpringUtil.getBean(servCls);
		String name = servObj.getClass().getName();
		Class<?> cls = Class.forName(name);
		Method method = cls.getMethod(execMethod, JSONObject.class);
		Object ret = method.invoke(servObj, requestBo);
	    // 返回对象bo
		CureNurseMedicalOrderBo cnmoBo = new CureNurseMedicalOrderBo();
		BeanCopyUtil.copyBean(ret, cnmoBo);
		JSONObject json1 = JSONObject.fromObject(ret);
		System.out.println(json1.toString());
		return  null;
	}
	
	
	public String demoMethod() {
		try {
			File file  = new File("");
			FileInputStream fis = new FileInputStream(file);
			fis.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	

}
