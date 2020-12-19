package com.yx.cdss.extract.model.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table examine_info_report_detail
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class ExamineInfoReportDetail implements Serializable {
    /**
     * Database Column Remarks:
     *   主键ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examine_info_report_detail.eird_id
     *
     * @mbg.generated
     */
    private Long eirdId;

    /**
     * Database Column Remarks:
     *   患ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examine_info_report_detail.patient_id
     *
     * @mbg.generated
     */
    private String patientId;

    /**
     * Database Column Remarks:
     *   住院
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examine_info_report_detail.adminission_number
     *
     * @mbg.generated
     */
    private String adminissionNumber;

    /**
     * Database Column Remarks:
     *   �?验报告单�?
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examine_info_report_detail.report_number
     *
     * @mbg.generated
     */
    private String reportNumber;

    /**
     * Database Column Remarks:
     *   指标名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examine_info_report_detail.index_name
     *
     * @mbg.generated
     */
    private String indexName;

    /**
     * Database Column Remarks:
     *   指标编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examine_info_report_detail.index_code
     *
     * @mbg.generated
     */
    private String indexCode;

    /**
     * Database Column Remarks:
     *   指标结果
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examine_info_report_detail.index_result
     *
     * @mbg.generated
     */
    private String indexResult;

    /**
     * Database Column Remarks:
     *   异常标记
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examine_info_report_detail.exception_mark
     *
     * @mbg.generated
     */
    private String exceptionMark;

    /**
     * Database Column Remarks:
     *   医院编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examine_info_report_detail.hospital_code
     *
     * @mbg.generated
     */
    private String hospitalCode;

    /**
     * Database Column Remarks:
     *   抽取时间,数据同步�?
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examine_info_report_detail.extract_time
     *
     * @mbg.generated
     */
    private Date extractTime;

    /**
     * Database Column Remarks:
     *   记录状�??:1-进行�?,2-完成
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examine_info_report_detail.record_status
     *
     * @mbg.generated
     */
    private Integer recordStatus;

    /**
     * Database Column Remarks:
     *   预留字段1
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examine_info_report_detail.attribute1
     *
     * @mbg.generated
     */
    private String attribute1;

    /**
     * Database Column Remarks:
     *   预留字段2
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examine_info_report_detail.attribute2
     *
     * @mbg.generated
     */
    private String attribute2;

    /**
     * Database Column Remarks:
     *   预留字段3
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examine_info_report_detail.attribute3
     *
     * @mbg.generated
     */
    private String attribute3;

    /**
     * Database Column Remarks:
     *   预留字段4
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examine_info_report_detail.attribute4
     *
     * @mbg.generated
     */
    private String attribute4;

    /**
     * Database Column Remarks:
     *   预留字段5
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examine_info_report_detail.attribute5
     *
     * @mbg.generated
     */
    private String attribute5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table examine_info_report_detail
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examine_info_report_detail.eird_id
     *
     * @return the value of examine_info_report_detail.eird_id
     *
     * @mbg.generated
     */
    public Long getEirdId() {
        return eirdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examine_info_report_detail.eird_id
     *
     * @param eirdId the value for examine_info_report_detail.eird_id
     *
     * @mbg.generated
     */
    public void setEirdId(Long eirdId) {
        this.eirdId = eirdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examine_info_report_detail.patient_id
     *
     * @return the value of examine_info_report_detail.patient_id
     *
     * @mbg.generated
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examine_info_report_detail.patient_id
     *
     * @param patientId the value for examine_info_report_detail.patient_id
     *
     * @mbg.generated
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examine_info_report_detail.adminission_number
     *
     * @return the value of examine_info_report_detail.adminission_number
     *
     * @mbg.generated
     */
    public String getAdminissionNumber() {
        return adminissionNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examine_info_report_detail.adminission_number
     *
     * @param adminissionNumber the value for examine_info_report_detail.adminission_number
     *
     * @mbg.generated
     */
    public void setAdminissionNumber(String adminissionNumber) {
        this.adminissionNumber = adminissionNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examine_info_report_detail.report_number
     *
     * @return the value of examine_info_report_detail.report_number
     *
     * @mbg.generated
     */
    public String getReportNumber() {
        return reportNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examine_info_report_detail.report_number
     *
     * @param reportNumber the value for examine_info_report_detail.report_number
     *
     * @mbg.generated
     */
    public void setReportNumber(String reportNumber) {
        this.reportNumber = reportNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examine_info_report_detail.index_name
     *
     * @return the value of examine_info_report_detail.index_name
     *
     * @mbg.generated
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examine_info_report_detail.index_name
     *
     * @param indexName the value for examine_info_report_detail.index_name
     *
     * @mbg.generated
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examine_info_report_detail.index_code
     *
     * @return the value of examine_info_report_detail.index_code
     *
     * @mbg.generated
     */
    public String getIndexCode() {
        return indexCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examine_info_report_detail.index_code
     *
     * @param indexCode the value for examine_info_report_detail.index_code
     *
     * @mbg.generated
     */
    public void setIndexCode(String indexCode) {
        this.indexCode = indexCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examine_info_report_detail.index_result
     *
     * @return the value of examine_info_report_detail.index_result
     *
     * @mbg.generated
     */
    public String getIndexResult() {
        return indexResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examine_info_report_detail.index_result
     *
     * @param indexResult the value for examine_info_report_detail.index_result
     *
     * @mbg.generated
     */
    public void setIndexResult(String indexResult) {
        this.indexResult = indexResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examine_info_report_detail.exception_mark
     *
     * @return the value of examine_info_report_detail.exception_mark
     *
     * @mbg.generated
     */
    public String getExceptionMark() {
        return exceptionMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examine_info_report_detail.exception_mark
     *
     * @param exceptionMark the value for examine_info_report_detail.exception_mark
     *
     * @mbg.generated
     */
    public void setExceptionMark(String exceptionMark) {
        this.exceptionMark = exceptionMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examine_info_report_detail.hospital_code
     *
     * @return the value of examine_info_report_detail.hospital_code
     *
     * @mbg.generated
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examine_info_report_detail.hospital_code
     *
     * @param hospitalCode the value for examine_info_report_detail.hospital_code
     *
     * @mbg.generated
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examine_info_report_detail.extract_time
     *
     * @return the value of examine_info_report_detail.extract_time
     *
     * @mbg.generated
     */
    public Date getExtractTime() {
        return extractTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examine_info_report_detail.extract_time
     *
     * @param extractTime the value for examine_info_report_detail.extract_time
     *
     * @mbg.generated
     */
    public void setExtractTime(Date extractTime) {
        this.extractTime = extractTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examine_info_report_detail.record_status
     *
     * @return the value of examine_info_report_detail.record_status
     *
     * @mbg.generated
     */
    public Integer getRecordStatus() {
        return recordStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examine_info_report_detail.record_status
     *
     * @param recordStatus the value for examine_info_report_detail.record_status
     *
     * @mbg.generated
     */
    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examine_info_report_detail.attribute1
     *
     * @return the value of examine_info_report_detail.attribute1
     *
     * @mbg.generated
     */
    public String getAttribute1() {
        return attribute1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examine_info_report_detail.attribute1
     *
     * @param attribute1 the value for examine_info_report_detail.attribute1
     *
     * @mbg.generated
     */
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examine_info_report_detail.attribute2
     *
     * @return the value of examine_info_report_detail.attribute2
     *
     * @mbg.generated
     */
    public String getAttribute2() {
        return attribute2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examine_info_report_detail.attribute2
     *
     * @param attribute2 the value for examine_info_report_detail.attribute2
     *
     * @mbg.generated
     */
    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examine_info_report_detail.attribute3
     *
     * @return the value of examine_info_report_detail.attribute3
     *
     * @mbg.generated
     */
    public String getAttribute3() {
        return attribute3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examine_info_report_detail.attribute3
     *
     * @param attribute3 the value for examine_info_report_detail.attribute3
     *
     * @mbg.generated
     */
    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examine_info_report_detail.attribute4
     *
     * @return the value of examine_info_report_detail.attribute4
     *
     * @mbg.generated
     */
    public String getAttribute4() {
        return attribute4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examine_info_report_detail.attribute4
     *
     * @param attribute4 the value for examine_info_report_detail.attribute4
     *
     * @mbg.generated
     */
    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examine_info_report_detail.attribute5
     *
     * @return the value of examine_info_report_detail.attribute5
     *
     * @mbg.generated
     */
    public String getAttribute5() {
        return attribute5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examine_info_report_detail.attribute5
     *
     * @param attribute5 the value for examine_info_report_detail.attribute5
     *
     * @mbg.generated
     */
    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }
}