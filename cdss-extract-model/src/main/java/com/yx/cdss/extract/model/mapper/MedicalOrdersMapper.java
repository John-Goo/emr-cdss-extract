package com.yx.cdss.extract.model.mapper;

import com.yx.cdss.extract.model.entity.MedicalOrders;
import com.yx.cdss.extract.model.entity.MedicalOrdersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicalOrdersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders
     *
     * @mbg.generated
     */
    long countByExample(MedicalOrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders
     *
     * @mbg.generated
     */
    int deleteByExample(MedicalOrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long moId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders
     *
     * @mbg.generated
     */
    int insert(MedicalOrders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders
     *
     * @mbg.generated
     */
    int insertSelective(MedicalOrders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders
     *
     * @mbg.generated
     */
    List<MedicalOrders> selectByExample(MedicalOrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders
     *
     * @mbg.generated
     */
    MedicalOrders selectByPrimaryKey(Long moId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MedicalOrders record, @Param("example") MedicalOrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MedicalOrders record, @Param("example") MedicalOrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MedicalOrders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medical_orders
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MedicalOrders record);
}