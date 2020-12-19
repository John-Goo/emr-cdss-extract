package com.yx.cdss.extract.model.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table dict_examine_normalvalue
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class DictExamineNormalvalue implements Serializable {
    /**
     * Database Column Remarks:
     *   主键ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_normalvalue.den_id
     *
     * @mbg.generated
     */
    private Long denId;

    /**
     * Database Column Remarks:
     *   指标编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_normalvalue.index_code
     *
     * @mbg.generated
     */
    private String indexCode;

    /**
     * Database Column Remarks:
     *   正常
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_normalvalue.normal_min_val
     *
     * @mbg.generated
     */
    private String normalMinVal;

    /**
     * Database Column Remarks:
     *   正常�?大�??
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_normalvalue.normal_max_val
     *
     * @mbg.generated
     */
    private String normalMaxVal;

    /**
     * Database Column Remarks:
            *   性别限制(1-�?,2�?,0不限�?)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_normalvalue.sex_limit
     *
     * @mbg.generated
     */
    private Integer sexLimit;

    /**
     * Database Column Remarks:
     *   年龄�?小�??
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_normalvalue.age_min_val
     *
     * @mbg.generated
     */
    private Integer ageMinVal;

    /**
     * Database Column Remarks:
     *   年龄�?大�??
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_normalvalue.age_max_val
     *
     * @mbg.generated
     */
    private Integer ageMaxVal;

    /**
     * Database Column Remarks:
     *   抽取时间,数据同步�?
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_normalvalue.extract_time
     *
     * @mbg.generated
     */
    private Date extractTime;

    /**
     * Database Column Remarks:
     *   预留字段1
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_normalvalue.attribute1
     *
     * @mbg.generated
     */
    private String attribute1;

    /**
     * Database Column Remarks:
     *   预留字段2
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_normalvalue.attribute2
     *
     * @mbg.generated
     */
    private String attribute2;

    /**
     * Database Column Remarks:
     *   预留字段3
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_normalvalue.attribute3
     *
     * @mbg.generated
     */
    private String attribute3;

    /**
     * Database Column Remarks:
     *   预留字段4
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_normalvalue.attribute4
     *
     * @mbg.generated
     */
    private String attribute4;

    /**
     * Database Column Remarks:
     *   预留字段5
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_examine_normalvalue.attribute5
     *
     * @mbg.generated
     */
    private String attribute5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dict_examine_normalvalue
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_normalvalue.den_id
     *
     * @return the value of dict_examine_normalvalue.den_id
     *
     * @mbg.generated
     */
    public Long getDenId() {
        return denId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_normalvalue.den_id
     *
     * @param denId the value for dict_examine_normalvalue.den_id
     *
     * @mbg.generated
     */
    public void setDenId(Long denId) {
        this.denId = denId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_normalvalue.index_code
     *
     * @return the value of dict_examine_normalvalue.index_code
     *
     * @mbg.generated
     */
    public String getIndexCode() {
        return indexCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_normalvalue.index_code
     *
     * @param indexCode the value for dict_examine_normalvalue.index_code
     *
     * @mbg.generated
     */
    public void setIndexCode(String indexCode) {
        this.indexCode = indexCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_normalvalue.normal_min_val
     *
     * @return the value of dict_examine_normalvalue.normal_min_val
     *
     * @mbg.generated
     */
    public String getNormalMinVal() {
        return normalMinVal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_normalvalue.normal_min_val
     *
     * @param normalMinVal the value for dict_examine_normalvalue.normal_min_val
     *
     * @mbg.generated
     */
    public void setNormalMinVal(String normalMinVal) {
        this.normalMinVal = normalMinVal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_normalvalue.normal_max_val
     *
     * @return the value of dict_examine_normalvalue.normal_max_val
     *
     * @mbg.generated
     */
    public String getNormalMaxVal() {
        return normalMaxVal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_normalvalue.normal_max_val
     *
     * @param normalMaxVal the value for dict_examine_normalvalue.normal_max_val
     *
     * @mbg.generated
     */
    public void setNormalMaxVal(String normalMaxVal) {
        this.normalMaxVal = normalMaxVal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_normalvalue.sex_limit
     *
     * @return the value of dict_examine_normalvalue.sex_limit
     *
     * @mbg.generated
     */
    public Integer getSexLimit() {
        return sexLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_normalvalue.sex_limit
     *
     * @param sexLimit the value for dict_examine_normalvalue.sex_limit
     *
     * @mbg.generated
     */
    public void setSexLimit(Integer sexLimit) {
        this.sexLimit = sexLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_normalvalue.age_min_val
     *
     * @return the value of dict_examine_normalvalue.age_min_val
     *
     * @mbg.generated
     */
    public Integer getAgeMinVal() {
        return ageMinVal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_normalvalue.age_min_val
     *
     * @param ageMinVal the value for dict_examine_normalvalue.age_min_val
     *
     * @mbg.generated
     */
    public void setAgeMinVal(Integer ageMinVal) {
        this.ageMinVal = ageMinVal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_normalvalue.age_max_val
     *
     * @return the value of dict_examine_normalvalue.age_max_val
     *
     * @mbg.generated
     */
    public Integer getAgeMaxVal() {
        return ageMaxVal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_normalvalue.age_max_val
     *
     * @param ageMaxVal the value for dict_examine_normalvalue.age_max_val
     *
     * @mbg.generated
     */
    public void setAgeMaxVal(Integer ageMaxVal) {
        this.ageMaxVal = ageMaxVal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_normalvalue.extract_time
     *
     * @return the value of dict_examine_normalvalue.extract_time
     *
     * @mbg.generated
     */
    public Date getExtractTime() {
        return extractTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_normalvalue.extract_time
     *
     * @param extractTime the value for dict_examine_normalvalue.extract_time
     *
     * @mbg.generated
     */
    public void setExtractTime(Date extractTime) {
        this.extractTime = extractTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_normalvalue.attribute1
     *
     * @return the value of dict_examine_normalvalue.attribute1
     *
     * @mbg.generated
     */
    public String getAttribute1() {
        return attribute1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_normalvalue.attribute1
     *
     * @param attribute1 the value for dict_examine_normalvalue.attribute1
     *
     * @mbg.generated
     */
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_normalvalue.attribute2
     *
     * @return the value of dict_examine_normalvalue.attribute2
     *
     * @mbg.generated
     */
    public String getAttribute2() {
        return attribute2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_normalvalue.attribute2
     *
     * @param attribute2 the value for dict_examine_normalvalue.attribute2
     *
     * @mbg.generated
     */
    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_normalvalue.attribute3
     *
     * @return the value of dict_examine_normalvalue.attribute3
     *
     * @mbg.generated
     */
    public String getAttribute3() {
        return attribute3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_normalvalue.attribute3
     *
     * @param attribute3 the value for dict_examine_normalvalue.attribute3
     *
     * @mbg.generated
     */
    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_normalvalue.attribute4
     *
     * @return the value of dict_examine_normalvalue.attribute4
     *
     * @mbg.generated
     */
    public String getAttribute4() {
        return attribute4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_normalvalue.attribute4
     *
     * @param attribute4 the value for dict_examine_normalvalue.attribute4
     *
     * @mbg.generated
     */
    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_examine_normalvalue.attribute5
     *
     * @return the value of dict_examine_normalvalue.attribute5
     *
     * @mbg.generated
     */
    public String getAttribute5() {
        return attribute5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_examine_normalvalue.attribute5
     *
     * @param attribute5 the value for dict_examine_normalvalue.attribute5
     *
     * @mbg.generated
     */
    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }
}