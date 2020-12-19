package com.yx.cdss.extract.provider.common.sync;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import lombok.Data;


/**
 * @author John Goo
 * @version 1.0
 * @ClassName: OrgNodeTree
 * @Desc: TODO
 * @history v1.0
 */
@Data
public class OrgNodeAccessTree {

    /**
     * 企业编号（唯一）
     */
    private String orgCode;

    /**
     * 企业级别，最高级为0
     */
    private int level;

    /**
     * 访问域名
     */
    private String domain;

    /**
     * 对应上级组织企业编号
     */
    private String  parentOrgCode;


}
