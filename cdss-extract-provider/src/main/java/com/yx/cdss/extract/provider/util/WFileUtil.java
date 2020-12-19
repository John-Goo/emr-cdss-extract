package com.yx.cdss.extract.provider.util;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: WFileUtil
 * @Desc: TODO
 * @history v1.0
 */
public class WFileUtil {

    // 访问服务嚣变量
    public static final String _URL_FILE_SERVE="";

    public static String writeStream(WFileReqBo wFileReqBo,InputStream in) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(_URL_FILE_SERVE);// 创建httpPost
        httpPost.setHeader("Accept", "application/octet-stream");
        httpPost.setHeader("Content-Type", "application/octet-stream");
        String charSet = "UTF-8";
        CloseableHttpResponse response = null;
        httpPost.setEntity(new InputStreamEntity(in));
        try {
            response = httpclient.execute(httpPost);
            StatusLine status = response.getStatusLine();
            int state = status.getStatusCode();
            if (state == 200) {
                HttpEntity responseEntity = response.getEntity();
                String jsonString = EntityUtils.toString(responseEntity);
                return jsonString;
            }
            else{
                //logger.error("请求返回:"+state+"("+url+")");
            }
        }
        finally {
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public String[] writeStream(WMultiFileReqBo wMultiFileReqBo, List<InputStream> streamList){
        return null;
    }







}
