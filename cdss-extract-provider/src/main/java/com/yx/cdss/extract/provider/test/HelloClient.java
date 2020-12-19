package com.yx.cdss.extract.provider.test;

import feign.RequestLine;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/
public interface HelloClient {
    @RequestLine("GET /call")
    public String sayHell(String msg);
}
