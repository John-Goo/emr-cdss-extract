package com.yx.cdss.extract.model.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table dict_surgery
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class DictSurgery implements Serializable {
    /**
     * Database Column Remarks:
     *   主键ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_surgery.ds_id
     *
     * @mbg.generated
     */
    private Long dsId;

    /**
     * Database Column Remarks:
     *   手术名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_surgery.surg_name
     *
     * @mbg.generated
     */
    private String surgName;

    /**
     * Database Column Remarks:
     *   手术编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_surgery.surg_code
     *
     * @mbg.generated
     */
    private String surgCode;

    /**
     * Database Column Remarks:
     *   手术级别
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_surgery.surg_level
     *
     * @mbg.generated
     */
    private Integer surgLevel;

    /**
     * Database Column Remarks:
     *   抽取时间,数据同步
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_surgery.extract_time
     *
     * @mbg.generated
     */
    private Date extractTime;

    /**
     * Database Column Remarks:
     *   预留字段1
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_surgery.attribute1
     *
     * @mbg.generated
     */
    private String attribute1;

    /**
     * Database Column Remarks:
     *   预留字段2
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_surgery.attribute2
     *
     * @mbg.generated
     */
    private String attribute2;

    /**
     * Database Column Remarks:
     *   预留字段3
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_surgery.attribute3
     *
     * @mbg.generated
     */
    private String attribute3;

    /**
     * Database Column Remarks:
     *   预留字段4
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_surgery.attribute4
     *
     * @mbg.generated
     */
    private String attribute4;

    /**
     * Database Column Remarks:
     *   预留字段5
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_surgery.attribute5
     *
     * @mbg.generated
     */
    private String attribute5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dict_surgery
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_surgery.ds_id
     *
     * @return the value of dict_surgery.ds_id
     *
     * @mbg.generated
     */
    public Long getDsId() {
        return dsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_surgery.ds_id
     *
     * @param dsId the value for dict_surgery.ds_id
     *
     * @mbg.generated
     */
    public void setDsId(Long dsId) {
        this.dsId = dsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_surgery.surg_name
     *
     * @return the value of dict_surgery.surg_name
     *
     * @mbg.generated
     */
    public String getSurgName() {
        return surgName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_surgery.surg_name
     *
     * @param surgName the value for dict_surgery.surg_name
     *
     * @mbg.generated
     */
    public void setSurgName(String surgName) {
        this.surgName = surgName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_surgery.surg_code
     *
     * @return the value of dict_surgery.surg_code
     *
     * @mbg.generated
     */
    public String getSurgCode() {
        return surgCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_surgery.surg_code
     *
     * @param surgCode the value for dict_surgery.surg_code
     *
     * @mbg.generated
     */
    public void setSurgCode(String surgCode) {
        this.surgCode = surgCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_surgery.surg_level
     *
     * @return the value of dict_surgery.surg_level
     *
     * @mbg.generated
     */
    public Integer getSurgLevel() {
        return surgLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_surgery.surg_level
     *
     * @param surgLevel the value for dict_surgery.surg_level
     *
     * @mbg.generated
     */
    public void setSurgLevel(Integer surgLevel) {
        this.surgLevel = surgLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_surgery.extract_time
     *
     * @return the value of dict_surgery.extract_time
     *
     * @mbg.generated
     */
    public Date getExtractTime() {
        return extractTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_surgery.extract_time
     *
     * @param extractTime the value for dict_surgery.extract_time
     *
     * @mbg.generated
     */
    public void setExtractTime(Date extractTime) {
        this.extractTime = extractTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_surgery.attribute1
     *
     * @return the value of dict_surgery.attribute1
     *
     * @mbg.generated
     */
    public String getAttribute1() {
        return attribute1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_surgery.attribute1
     *
     * @param attribute1 the value for dict_surgery.attribute1
     *
     * @mbg.generated
     */
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_surgery.attribute2
     *
     * @return the value of dict_surgery.attribute2
     *
     * @mbg.generated
     */
    public String getAttribute2() {
        return attribute2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_surgery.attribute2
     *
     * @param attribute2 the value for dict_surgery.attribute2
     *
     * @mbg.generated
     */
    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_surgery.attribute3
     *
     * @return the value of dict_surgery.attribute3
     *
     * @mbg.generated
     */
    public String getAttribute3() {
        return attribute3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_surgery.attribute3
     *
     * @param attribute3 the value for dict_surgery.attribute3
     *
     * @mbg.generated
     */
    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_surgery.attribute4
     *
     * @return the value of dict_surgery.attribute4
     *
     * @mbg.generated
     */
    public String getAttribute4() {
        return attribute4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_surgery.attribute4
     *
     * @param attribute4 the value for dict_surgery.attribute4
     *
     * @mbg.generated
     */
    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_surgery.attribute5
     *
     * @return the value of dict_surgery.attribute5
     *
     * @mbg.generated
     */
    public String getAttribute5() {
        return attribute5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_surgery.attribute5
     *
     * @param attribute5 the value for dict_surgery.attribute5
     *
     * @mbg.generated
     */
    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }
}