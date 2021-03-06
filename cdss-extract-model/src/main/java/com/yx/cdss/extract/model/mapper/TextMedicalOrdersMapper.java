package com.yx.cdss.extract.model.mapper;

import com.yx.cdss.extract.model.entity.TextMedicalOrders;
import com.yx.cdss.extract.model.entity.TextMedicalOrdersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TextMedicalOrdersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_medical_orders
     *
     * @mbg.generated
     */
    long countByExample(TextMedicalOrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_medical_orders
     *
     * @mbg.generated
     */
    int deleteByExample(TextMedicalOrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_medical_orders
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long nmoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_medical_orders
     *
     * @mbg.generated
     */
    int insert(TextMedicalOrders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_medical_orders
     *
     * @mbg.generated
     */
    int insertSelective(TextMedicalOrders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_medical_orders
     *
     * @mbg.generated
     */
    List<TextMedicalOrders> selectByExample(TextMedicalOrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_medical_orders
     *
     * @mbg.generated
     */
    TextMedicalOrders selectByPrimaryKey(Long nmoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_medical_orders
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TextMedicalOrders record, @Param("example") TextMedicalOrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_medical_orders
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TextMedicalOrders record, @Param("example") TextMedicalOrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_medical_orders
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TextMedicalOrders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table text_medical_orders
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TextMedicalOrders record);
}