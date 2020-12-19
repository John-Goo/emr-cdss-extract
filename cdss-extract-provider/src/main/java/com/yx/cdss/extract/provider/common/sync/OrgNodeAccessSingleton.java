package com.yx.cdss.extract.provider.common.sync;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import java.util.HashMap;
import java.util.Map;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: OrgNodeAccessSingleton
 * @Desc: TODO
 * @history v1.0
 */
public class OrgNodeAccessSingleton {

    // 直接实例化
    private static OrgNodeAccessSingleton instance = new OrgNodeAccessSingleton();

    // 企业组织树
    private Map<String,OrgNodeAccessTree> nodeTreeMap = new HashMap<>();

    private OrgNodeAccessSingleton(){
    }


    /**
     * 访问入口
     * @return
     */
    public static OrgNodeAccessSingleton getInstance(){
        return instance;
    }

    /**
     * 增加组织节点
     * @param orgNode
     */
    public void addOrgNode(OrgNodeAccessTree orgNode){
        nodeTreeMap.put(orgNode.getOrgCode(),orgNode);
    }

    public void init(){
        // 清除数据
        nodeTreeMap.clear();

    }





}
