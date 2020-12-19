package com.yx.cdss.extract.provider.util;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Test
 * @Desc: TODO
 * @history v1.0
 */
public class Test {
    public static void main(String[] args) {
      String fileUrl=  WFile.builder()
                .orgType("C")
                .orgCode("1000")
                .userId("888")
                .moduleDir("activity/video")
                .post(null)
                .result()
        ;



    }
}
