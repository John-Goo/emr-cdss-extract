package com.yx.cdss.extract.provider.common;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import com.yx.cdss.extract.provider.util.WSyncDataHelper;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: WSyncDataConfigAbstract
 * @Desc: TODO
 * @history v1.0
 */
public abstract class WSyncDataConfigAbstract {

    public WSyncDataConfigAbstract(){
        WSyncDataHelper.setWConfig(this);
    }

    /**
     * 公域地址
     * @return String
     */
    public abstract String pdUrl();

    /**
     * 服务访问令牌
     * @return
     */
    public abstract  String token();

}
