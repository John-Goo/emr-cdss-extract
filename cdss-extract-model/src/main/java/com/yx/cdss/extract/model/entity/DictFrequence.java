package com.yx.cdss.extract.model.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table dict_frequence
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class DictFrequence implements Serializable {
    /**
     * Database Column Remarks:
     *   主键ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_frequence.df_id
     *
     * @mbg.generated
     */
    private Long dfId;

    /**
     * Database Column Remarks:
     *   频次名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_frequence.freq_name
     *
     * @mbg.generated
     */
    private String freqName;

    /**
     * Database Column Remarks:
     *   频次编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_frequence.freq_code
     *
     * @mbg.generated
     */
    private String freqCode;

    /**
     * Database Column Remarks:
     *   抽取时间,数据同步
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_frequence.extract_time
     *
     * @mbg.generated
     */
    private Date extractTime;

    /**
     * Database Column Remarks:
     *   预留字段1
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_frequence.attribute1
     *
     * @mbg.generated
     */
    private String attribute1;

    /**
     * Database Column Remarks:
     *   预留字段2
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_frequence.attribute2
     *
     * @mbg.generated
     */
    private String attribute2;

    /**
     * Database Column Remarks:
     *   预留字段3
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_frequence.attribute3
     *
     * @mbg.generated
     */
    private String attribute3;

    /**
     * Database Column Remarks:
     *   预留字段4
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_frequence.attribute4
     *
     * @mbg.generated
     */
    private String attribute4;

    /**
     * Database Column Remarks:
     *   预留字段5
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_frequence.attribute5
     *
     * @mbg.generated
     */
    private String attribute5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dict_frequence
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_frequence.df_id
     *
     * @return the value of dict_frequence.df_id
     *
     * @mbg.generated
     */
    public Long getDfId() {
        return dfId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_frequence.df_id
     *
     * @param dfId the value for dict_frequence.df_id
     *
     * @mbg.generated
     */
    public void setDfId(Long dfId) {
        this.dfId = dfId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_frequence.freq_name
     *
     * @return the value of dict_frequence.freq_name
     *
     * @mbg.generated
     */
    public String getFreqName() {
        return freqName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_frequence.freq_name
     *
     * @param freqName the value for dict_frequence.freq_name
     *
     * @mbg.generated
     */
    public void setFreqName(String freqName) {
        this.freqName = freqName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_frequence.freq_code
     *
     * @return the value of dict_frequence.freq_code
     *
     * @mbg.generated
     */
    public String getFreqCode() {
        return freqCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_frequence.freq_code
     *
     * @param freqCode the value for dict_frequence.freq_code
     *
     * @mbg.generated
     */
    public void setFreqCode(String freqCode) {
        this.freqCode = freqCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_frequence.extract_time
     *
     * @return the value of dict_frequence.extract_time
     *
     * @mbg.generated
     */
    public Date getExtractTime() {
        return extractTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_frequence.extract_time
     *
     * @param extractTime the value for dict_frequence.extract_time
     *
     * @mbg.generated
     */
    public void setExtractTime(Date extractTime) {
        this.extractTime = extractTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_frequence.attribute1
     *
     * @return the value of dict_frequence.attribute1
     *
     * @mbg.generated
     */
    public String getAttribute1() {
        return attribute1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_frequence.attribute1
     *
     * @param attribute1 the value for dict_frequence.attribute1
     *
     * @mbg.generated
     */
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_frequence.attribute2
     *
     * @return the value of dict_frequence.attribute2
     *
     * @mbg.generated
     */
    public String getAttribute2() {
        return attribute2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_frequence.attribute2
     *
     * @param attribute2 the value for dict_frequence.attribute2
     *
     * @mbg.generated
     */
    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_frequence.attribute3
     *
     * @return the value of dict_frequence.attribute3
     *
     * @mbg.generated
     */
    public String getAttribute3() {
        return attribute3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_frequence.attribute3
     *
     * @param attribute3 the value for dict_frequence.attribute3
     *
     * @mbg.generated
     */
    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_frequence.attribute4
     *
     * @return the value of dict_frequence.attribute4
     *
     * @mbg.generated
     */
    public String getAttribute4() {
        return attribute4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_frequence.attribute4
     *
     * @param attribute4 the value for dict_frequence.attribute4
     *
     * @mbg.generated
     */
    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_frequence.attribute5
     *
     * @return the value of dict_frequence.attribute5
     *
     * @mbg.generated
     */
    public String getAttribute5() {
        return attribute5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_frequence.attribute5
     *
     * @param attribute5 the value for dict_frequence.attribute5
     *
     * @mbg.generated
     */
    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }
}