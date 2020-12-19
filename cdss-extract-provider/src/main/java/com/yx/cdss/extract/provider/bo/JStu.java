package com.yx.cdss.extract.provider.bo;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: JStu
 * @Desc: TODO
 * @history v1.0
 */
public class JStu {

    Integer id;
    // 1 2 3
    String dataStr;


    public JStu(Integer id, String dataStr) {
        this.id = id;
        this.dataStr = dataStr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataStr() {
        return dataStr;
    }

    public void setDataStr(String dataStr) {
        this.dataStr = dataStr;
    }
}
