package com.yx.cdss.extract.provider.util;

import com.yx.cdss.extract.model.entity.DictDrug;

import java.util.Date;

public class DemoUtil {
	
	
	public static DictDrug createDictDrug(Integer i) {
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
		return dd;
	}

}
