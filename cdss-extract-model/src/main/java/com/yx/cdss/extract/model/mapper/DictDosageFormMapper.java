package com.yx.cdss.extract.model.mapper;

import com.yx.cdss.extract.model.entity.DictDosageForm;
import com.yx.cdss.extract.model.entity.DictDosageFormExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DictDosageFormMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_dosage_form
     *
     * @mbg.generated
     */
    long countByExample(DictDosageFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_dosage_form
     *
     * @mbg.generated
     */
    int deleteByExample(DictDosageFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_dosage_form
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long ddfId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_dosage_form
     *
     * @mbg.generated
     */
    int insert(DictDosageForm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_dosage_form
     *
     * @mbg.generated
     */
    int insertSelective(DictDosageForm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_dosage_form
     *
     * @mbg.generated
     */
    List<DictDosageForm> selectByExample(DictDosageFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_dosage_form
     *
     * @mbg.generated
     */
    DictDosageForm selectByPrimaryKey(Long ddfId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_dosage_form
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DictDosageForm record, @Param("example") DictDosageFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_dosage_form
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DictDosageForm record, @Param("example") DictDosageFormExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_dosage_form
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DictDosageForm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_dosage_form
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DictDosageForm record);
}