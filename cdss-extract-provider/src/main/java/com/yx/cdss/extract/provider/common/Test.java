package com.yx.cdss.extract.provider.common;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import com.yx.cdss.extract.model.entity.DictDrug;
import net.sf.json.JSONObject;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Test
 * @Desc: TODO
 * @history v1.0
 */
public class Test {
    public static void main(String[] args) {
        try {
            DictDrug dictDrug = new DictDrug();
            WResult<DictDrug> result = WResult.newInstance();
            result.ok(dictDrug);

            JSONObject jsonObj = JSONObject.fromObject(result);
            System.out.println(jsonObj);

            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
