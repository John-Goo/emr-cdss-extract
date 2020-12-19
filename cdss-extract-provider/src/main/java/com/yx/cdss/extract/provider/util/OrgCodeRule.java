package com.yx.cdss.extract.provider.util;

import lombok.Data;

import java.text.DecimalFormat;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/
public class OrgCodeRule {

    // 生成策略：自增
    public static final int _RULE_TYPE_ASC = 1;
    // 生成策略：自减
    public static final int _RULE_TYPE_DESC = 2 ;

    /**
     * 公域——企业编号规则（分段编码-前四位[16进制]）
     * @param currOrgCode
     * @param ruleType
     * @return
     */
    public static OrgCodeRuleBo generateWljiamOrgCode(String currOrgCode,int ruleType){
        // 前三位固定，公域使用；901-00001,
        String prefix = currOrgCode.substring(0,4);
        String after = currOrgCode.substring(4);
        OrgCodeRuleBo codeRuleBo = new OrgCodeRuleBo();
        if(ruleType == _RULE_TYPE_ASC){
            // 累加新的三位编号
            Integer prefixCode = Integer.valueOf(prefix,16)+1;
            codeRuleBo.setRuleType(ruleType);
            // 4位16进制最大值,65536-1
            if(prefixCode >= 65535){
                // 最小位开始
                prefixCode = 2304;
                // 开启自减模式
                codeRuleBo.setRuleType(_RULE_TYPE_DESC);
            }
            codeRuleBo.setOrgCode(Integer.toHexString(prefixCode)+after);
        }else if(ruleType == _RULE_TYPE_DESC){
            // 累加新的三位编号
            Integer prefixCode = Integer.valueOf(prefix,16)-1;
            // 4位16进制(100)最大值,对应10进制256
            if(prefixCode < 4096){
               throw new RuntimeException("******物连家美——公域企业编号[四位16进制]已经用完，请升级编码规则！");
            }
            codeRuleBo.setRuleType(ruleType);
            codeRuleBo.setOrgCode(Integer.toHexString(prefixCode)+after);
        }else{
            throw new RuntimeException("******物连家美——公域企业编码生成策略类型不正确！==>ruleType:"+ruleType);
        }
        return codeRuleBo;
    }

    /**
     * 私域——企业编号规则（分段编码-前六位[十进制]）
     * @param currOrgCode
     * @param ruleType
     * @return
     */
    public static OrgCodeRuleBo generateYZNOrgCode(String currOrgCode,int ruleType){
        if(currOrgCode == null){
            throw new RuntimeException("===> 企业编号不能为空！");
        }
        // 前四位固定（16进制），公域使用901-00001；初始化后六位（10进制）
        String prefix = currOrgCode.substring(0,4);
        String after = currOrgCode.substring(4);
        OrgCodeRuleBo codeRuleBo = new OrgCodeRuleBo();
        Integer orgCode = Integer.valueOf(after) + 1;
        // 最大值
        if(orgCode > 999999){
            throw new RuntimeException("******物连家美——私域企业编号[六位10进制]已经用完，请升级编码规则！");
        }
        OrgCodeRuleBo orgCodeRuleBo = new OrgCodeRuleBo();
        // 私域——企业编号,后六位固定
        String orgCodeStr = prefix + new DecimalFormat("000000").format(orgCode);
        orgCodeRuleBo.setOrgCode(orgCodeStr);
        // 私域编码规则只有一种策略（预留）
        orgCodeRuleBo.setRuleType(ruleType);
        return orgCodeRuleBo;
    }

    @Data
    static class OrgCodeRuleBo{
        // 企业编号
        private String orgCode;
        // 生成规则策略：1-自增；2-自减
        private Integer ruleType;

        @Override
        public String toString() {
            return "OrgCodeRuleBo{" +
                    "orgCode='" + orgCode + '\'' +
                    ", ruleType=" + ruleType +
                    '}';
        }
    }


    public static void main(String[] args) {
        // 分段，前三位，顶级企业；后5位，下属企业
        String currOrgCode = "9001999998";// 9000000001:数据库初始值，FFF-最大，100-最小
       // OrgCodeRuleBo orgCodeRuleBo = generateWljiamOrgCode(currOrgCode,2);
       // System.out.println(orgCodeRuleBo);
      //  System.out.println(Integer.valueOf("1000",16));

        OrgCodeRuleBo orgCodeRuleBo = generateYZNOrgCode(currOrgCode,1);
        System.out.println(orgCodeRuleBo);


    }


}
