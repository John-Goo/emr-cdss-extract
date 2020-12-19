package com.yx.cdss.extract.provider.common;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Demo
 * @Desc: TODO
 * @history v1.0
 */
public class Demo {
    public static void main(String[] args) {
      Form form =  XXXFactory.builder()
                .userName("ccc")
                .pwd("123456")
                .ip("192.168.0.1")
                .port("8888")
                .driverName("mysql")
                .build();
        System.out.println(form);

    }
}
