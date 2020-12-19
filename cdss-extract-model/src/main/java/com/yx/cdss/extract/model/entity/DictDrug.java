package com.yx.cdss.extract.model.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table dict_drug
 *
 * @mbg.generated do_not_delete_during_merge
 */
@Document(collection = "dict_drug")
@Data
public class DictDrug implements Serializable {
    /**
     * Database Column Remarks:
     *   主键ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_drug.dd_id
     *
     * @mbg.generated
     */

    @Id
    private ObjectId contentId;

    private Long ddId;

    /**
     * Database Column Remarks:
     *   药品名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_drug.drug_name
     *
     * @mbg.generated
     */
    private String drugName;

    /**
     * Database Column Remarks:
     *   药品编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_drug.drug_code
     *
     * @mbg.generated
     */
    private String drugCode;

    /**
     * Database Column Remarks:
     *   批准文号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_drug.approval_number
     *
     * @mbg.generated
     */
    private String approvalNumber;

    /**
     * Database Column Remarks:
     *   国药准字
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_drug.national_drug_approval
     *
     * @mbg.generated
     */
    private String nationalDrugApproval;

    /**
     * Database Column Remarks:
     *   药品规格
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_drug.drug_specifications
     *
     * @mbg.generated
     */
    private String drugSpecifications;

    /**
     * Database Column Remarks:
     *   包装单位
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_drug.pack_unit
     *
     * @mbg.generated
     */
    private String packUnit;

    /**
     * Database Column Remarks:
     *   规格数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_drug.specifications_qty
     *
     * @mbg.generated
     */
    private Integer specificationsQty;

    /**
     * Database Column Remarks:
     *   规格单位
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_drug.specifications_unit
     *
     * @mbg.generated
     */
    private String specificationsUnit;

    /**
     * Database Column Remarks:
     *   药品类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_drug.drug_type
     *
     * @mbg.generated
     */
    private String drugType;

    /**
     * Database Column Remarks:
     *   抽取时间,数据同步
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_drug.extract_time
     *
     * @mbg.generated
     */
    private Date extractTime;

    /**
     * Database Column Remarks:
     *   预留字段1
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_drug.attribute1
     *
     * @mbg.generated
     */
    private String attribute1;

    /**
     * Database Column Remarks:
     *   预留字段2
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_drug.attribute2
     *
     * @mbg.generated
     */
    private String attribute2;

    /**
     * Database Column Remarks:
     *   预留字段3
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_drug.attribute3
     *
     * @mbg.generated
     */
    private String attribute3;


    /**
     * Database Column Remarks:
     *   预留字段4
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_drug.attribute4
     *
     * @mbg.generated
     */
    private String attribute4;

    /**
     * Database Column Remarks:
     *   预留字段5
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_drug.attribute5
     *
     * @mbg.generated
     */
    private String attribute5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dict_drug
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_drug.dd_id
     *
     * @return the value of dict_drug.dd_id
     *
     * @mbg.generated
     */
    public Long getDdId() {
        return ddId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_drug.dd_id
     *
     * @param ddId the value for dict_drug.dd_id
     *
     * @mbg.generated
     */
    public void setDdId(Long ddId) {
        this.ddId = ddId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_drug.drug_name
     *
     * @return the value of dict_drug.drug_name
     *
     * @mbg.generated
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_drug.drug_name
     *
     * @param drugName the value for dict_drug.drug_name
     *
     * @mbg.generated
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_drug.drug_code
     *
     * @return the value of dict_drug.drug_code
     *
     * @mbg.generated
     */
    public String getDrugCode() {
        return drugCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_drug.drug_code
     *
     * @param drugCode the value for dict_drug.drug_code
     *
     * @mbg.generated
     */
    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_drug.approval_number
     *
     * @return the value of dict_drug.approval_number
     *
     * @mbg.generated
     */
    public String getApprovalNumber() {
        return approvalNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_drug.approval_number
     *
     * @param approvalNumber the value for dict_drug.approval_number
     *
     * @mbg.generated
     */
    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_drug.national_drug_approval
     *
     * @return the value of dict_drug.national_drug_approval
     *
     * @mbg.generated
     */
    public String getNationalDrugApproval() {
        return nationalDrugApproval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_drug.national_drug_approval
     *
     * @param nationalDrugApproval the value for dict_drug.national_drug_approval
     *
     * @mbg.generated
     */
    public void setNationalDrugApproval(String nationalDrugApproval) {
        this.nationalDrugApproval = nationalDrugApproval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_drug.drug_specifications
     *
     * @return the value of dict_drug.drug_specifications
     *
     * @mbg.generated
     */
    public String getDrugSpecifications() {
        return drugSpecifications;
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_drug.drug_specifications
     *
     * @param drugSpecifications the value for dict_drug.drug_specifications
     *
     * @mbg.generated
     */
    public void setDrugSpecifications(String drugSpecifications) {
        this.drugSpecifications = drugSpecifications;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_drug.pack_unit
     *
     * @return the value of dict_drug.pack_unit
     *
     * @mbg.generated
     */
    public String getPackUnit() {
        return packUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_drug.pack_unit
     *
     * @param packUnit the value for dict_drug.pack_unit
     *
     * @mbg.generated
     */
    public void setPackUnit(String packUnit) {
        this.packUnit = packUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_drug.specifications_qty
     *
     * @return the value of dict_drug.specifications_qty
     *
     * @mbg.generated
     */
    public Integer getSpecificationsQty() {
        return specificationsQty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_drug.specifications_qty
     *
     * @param specificationsQty the value for dict_drug.specifications_qty
     *
     * @mbg.generated
     */
    public void setSpecificationsQty(Integer specificationsQty) {
        this.specificationsQty = specificationsQty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_drug.specifications_unit
     *
     * @return the value of dict_drug.specifications_unit
     *
     * @mbg.generated
     */
    public String getSpecificationsUnit() {
        return specificationsUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_drug.specifications_unit
     *
     * @param specificationsUnit the value for dict_drug.specifications_unit
     *
     * @mbg.generated
     */
    public void setSpecificationsUnit(String specificationsUnit) {
        this.specificationsUnit = specificationsUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_drug.drug_type
     *
     * @return the value of dict_drug.drug_type
     *
     * @mbg.generated
     */
    public String getDrugType() {
        return drugType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_drug.drug_type
     *
     * @param drugType the value for dict_drug.drug_type
     *
     * @mbg.generated
     */
    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_drug.extract_time
     *
     * @return the value of dict_drug.extract_time
     *
     * @mbg.generated
     */
    public Date getExtractTime() {
        return extractTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_drug.extract_time
     *
     * @param extractTime the value for dict_drug.extract_time
     *
     * @mbg.generated
     */
    public void setExtractTime(Date extractTime) {
        this.extractTime = extractTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_drug.attribute1
     *
     * @return the value of dict_drug.attribute1
     *
     * @mbg.generated
     */
    public String getAttribute1() {
        return attribute1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_drug.attribute1
     *
     * @param attribute1 the value for dict_drug.attribute1
     *
     * @mbg.generated
     */
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_drug.attribute2
     *
     * @return the value of dict_drug.attribute2
     *
     * @mbg.generated
     */
    public String getAttribute2() {
        return attribute2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_drug.attribute2
     *
     * @param attribute2 the value for dict_drug.attribute2
     *
     * @mbg.generated
     */
    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_drug.attribute3
     *
     * @return the value of dict_drug.attribute3
     *
     * @mbg.generated
     */
    public String getAttribute3() {
        return attribute3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_drug.attribute3
     *
     * @param attribute3 the value for dict_drug.attribute3
     *
     * @mbg.generated
     */
    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_drug.attribute4
     *
     * @return the value of dict_drug.attribute4
     *
     * @mbg.generated
     */
    public String getAttribute4() {
        return attribute4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_drug.attribute4
     *
     * @param attribute4 the value for dict_drug.attribute4
     *
     * @mbg.generated
     */
    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_drug.attribute5
     *
     * @return the value of dict_drug.attribute5
     *
     * @mbg.generated
     */
    public String getAttribute5() {
        return attribute5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_drug.attribute5
     *
     * @param attribute5 the value for dict_drug.attribute5
     *
     * @mbg.generated
     */
    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    public static void main(String[] args) {
        System.out.println("==========");
    }
}