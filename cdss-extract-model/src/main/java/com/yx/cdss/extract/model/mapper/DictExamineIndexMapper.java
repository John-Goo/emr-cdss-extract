package com.yx.cdss.extract.model.mapper;

import com.yx.cdss.extract.model.entity.DictExamineIndex;
import com.yx.cdss.extract.model.entity.DictExamineIndexExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DictExamineIndexMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_examine_index
     *
     * @mbg.generated
     */
    long countByExample(DictExamineIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_examine_index
     *
     * @mbg.generated
     */
    int deleteByExample(DictExamineIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_examine_index
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long deiId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_examine_index
     *
     * @mbg.generated
     */
    int insert(DictExamineIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_examine_index
     *
     * @mbg.generated
     */
    int insertSelective(DictExamineIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_examine_index
     *
     * @mbg.generated
     */
    List<DictExamineIndex> selectByExample(DictExamineIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_examine_index
     *
     * @mbg.generated
     */
    DictExamineIndex selectByPrimaryKey(Long deiId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_examine_index
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DictExamineIndex record, @Param("example") DictExamineIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_examine_index
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DictExamineIndex record, @Param("example") DictExamineIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_examine_index
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DictExamineIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_examine_index
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DictExamineIndex record);
}