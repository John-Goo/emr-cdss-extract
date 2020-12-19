package com.yx.cdss.extract.provider.bo;

public class CureNurseMedicalOrderBo  {
	
    private Long nmoId;

    private String nurseCode;

    private String nurseName;

    private String patientId;

    private String medicalOrdersId;

    private String hospitalCode;

    private String admissionNumber;

    private String remark;

	public Long getNmoId() {
		return nmoId;
	}

	public void setNmoId(Long nmoId) {
		this.nmoId = nmoId;
	}

	public String getNurseCode() {
		return nurseCode;
	}

	public void setNurseCode(String nurseCode) {
		this.nurseCode = nurseCode;
	}

	public String getNurseName() {
		return nurseName;
	}

	public void setNurseName(String nurseName) {
		this.nurseName = nurseName;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getMedicalOrdersId() {
		return medicalOrdersId;
	}

	public void setMedicalOrdersId(String medicalOrdersId) {
		this.medicalOrdersId = medicalOrdersId;
	}

	public String getHospitalCode() {
		return hospitalCode;
	}

	public void setHospitalCode(String hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	public String getAdmissionNumber() {
		return admissionNumber;
	}

	public void setAdmissionNumber(String admissionNumber) {
		this.admissionNumber = admissionNumber;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
    
    

}
