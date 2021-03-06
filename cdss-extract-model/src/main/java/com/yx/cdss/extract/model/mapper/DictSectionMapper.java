package com.yx.cdss.extract.model.mapper;

import com.yx.cdss.extract.model.entity.DictSection;
import com.yx.cdss.extract.model.entity.DictSectionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DictSectionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_section
     *
     * @mbg.generated
     */
    long countByExample(DictSectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_section
     *
     * @mbg.generated
     */
    int deleteByExample(DictSectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_section
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long dsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_section
     *
     * @mbg.generated
     */
    int insert(DictSection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_section
     *
     * @mbg.generated
     */
    int insertSelective(DictSection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_section
     *
     * @mbg.generated
     */
    List<DictSection> selectByExample(DictSectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_section
     *
     * @mbg.generated
     */
    DictSection selectByPrimaryKey(Long dsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_section
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DictSection record, @Param("example") DictSectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_section
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DictSection record, @Param("example") DictSectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_section
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DictSection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_section
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DictSection record);
}