package com.yx.cdss.extract.provider.util;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: WFileReqBo
 * @Desc: TODO
 * @history v1.0
 */
public class WFileReqBo {
    // 企业类型
    private String orgType;
    // 企业编号
    private String orgCode;
    // 用户ID
    private String userId;
    // 模块目录
    private String moduleDir;

    public static  WFileReqBo builder(){
        return new WFileReqBo();
    }

    public WFileReqBo orgType(String orgType){
        this.orgType = orgType;
        return this;
    }
    public WFileReqBo orgCode(String orgCode){
        this.orgCode = orgCode;
        return this;
    }

    public WFileReqBo userId(String userId){
        this.userId = userId;
        return this;
    }

    public WFileReqBo moduleDir(String moduleDir){
        this.moduleDir = moduleDir;
        return this;
    }



}
