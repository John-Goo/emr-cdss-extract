package com.yx.cdss.extract.provider.bo;

public class DictDrugBo extends RequestBo {

	private Long ddId;

	private String drugName;

	private String drugCode;

	public Long getDdId() {
		return ddId;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getDrugCode() {
		return drugCode;
	}

	public void setDrugCode(String drugCode) {
		this.drugCode = drugCode;
	}

	public void setDdId(Long ddId) {
		this.ddId = ddId;
	}

	
	
	

}
