package com.yx.cdss.extract.provider.util;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import java.util.UUID;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: test1
 * @Desc: TODO
 * @history v1.0
 */

public class test1 {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString().replace("-","");
        System.out.println(uuid.length());
        String fileName = "YY.FF-FF.test.mp4".replace(".","~~");
        String[] array1 = fileName.split("~~");
        int len = array1.length;
        String fileType = null;
        if(len <= 1){
            fileType = "";
        }else{
            fileType = "."+array1[len-1];
        }
        String name = uuid+fileType;

        System.out.println(name);
    }
}
