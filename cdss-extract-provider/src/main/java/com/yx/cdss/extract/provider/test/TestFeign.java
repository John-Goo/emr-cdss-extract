package com.yx.cdss.extract.provider.test;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: TestFeign
 * @Desc: TODO
 * @history v1.0
 */
public class TestFeign {
    public static void main(String[] args) {
       HelloClient client =  Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .target(HelloClient.class, "https://api.github.com");


    }
}
