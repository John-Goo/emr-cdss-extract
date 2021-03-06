package com.yx.cdss.extract.model.mapper;

import com.yx.cdss.extract.model.entity.InspectInfoReport;
import com.yx.cdss.extract.model.entity.InspectInfoReportExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InspectInfoReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspect_info_report
     *
     * @mbg.generated
     */
    long countByExample(InspectInfoReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspect_info_report
     *
     * @mbg.generated
     */
    int deleteByExample(InspectInfoReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspect_info_report
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long iirId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspect_info_report
     *
     * @mbg.generated
     */
    int insert(InspectInfoReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspect_info_report
     *
     * @mbg.generated
     */
    int insertSelective(InspectInfoReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspect_info_report
     *
     * @mbg.generated
     */
    List<InspectInfoReport> selectByExample(InspectInfoReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspect_info_report
     *
     * @mbg.generated
     */
    InspectInfoReport selectByPrimaryKey(Long iirId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspect_info_report
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") InspectInfoReport record, @Param("example") InspectInfoReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspect_info_report
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") InspectInfoReport record, @Param("example") InspectInfoReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspect_info_report
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(InspectInfoReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inspect_info_report
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(InspectInfoReport record);
}