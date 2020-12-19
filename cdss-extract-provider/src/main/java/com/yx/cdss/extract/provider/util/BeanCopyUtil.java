
package com.yx.cdss.extract.provider.util;

import com.yx.cdss.extract.model.entity.DictDrug;
import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class BeanCopyUtil {

	

	
	/**
	 *     复制 列表对象
	 * @param <T>
	 * @param source
	 * @param destCls
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> List copyListBean(T source, Class destCls) {
		List<T> sourceList = (List<T>) source;
		List<T> objectiveList = new ArrayList<T>() ;
		try {
			T value = null;
			if (sourceList != null && sourceList.size() > 0) {
				for (T t : sourceList) {
					value = (T) Class.forName(destCls.getName()).newInstance();
					PropertyUtils.copyProperties(value, t);
					objectiveList.add((T) value);
				}
			}
		} catch (Exception e) {
		  e.printStackTrace();
		}
		return objectiveList;
	}
	
	
	
	public static void copyBean(Object source, Object dest){
		try {
			PropertyUtils.copyProperties(dest, source);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}


	public static <T> T copyBean(Object source, Class<T> destCls){
		Object dest = null;
		try {
			dest = destCls.newInstance();
			PropertyUtils.copyProperties(dest, source);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException | InstantiationException e) {
			e.printStackTrace();
		}
		return (T) dest;
	}

	public static void main(String[] args) {
		int i = 10;
		DictDrug dd  = new DictDrug();
		dd.setDrugName("阿莫本林-VZ-");
		dd.setDrugCode("800-"+i);
		dd.setApprovalNumber("88888888888888-"+i);
		dd.setNationalDrugApproval("FFFFFFFFFFFFF-"+i);
		dd.setDrugSpecifications("AMOBENGLING-"+i);
		dd.setPackUnit("克");
		dd.setSpecificationsQty(100);
		dd.setSpecificationsUnit("--");
		dd.setDrugType("中药");
		dd.setExtractTime(new Date());
		dd.setAttribute1("备注1");
		dd.setAttribute2("备注2");
		dd.setAttribute3("备注3");
		dd.setAttribute4("备注4");

		DictDrug dictDrug = (DictDrug) copyBean(dd,DictDrug.class);
		System.out.println(dd);
		System.out.println(dictDrug.getExtractTime());



	}








}
