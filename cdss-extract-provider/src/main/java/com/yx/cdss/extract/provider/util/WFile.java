package com.yx.cdss.extract.provider.util;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: WFile
 * @Desc: TODO
 * @history v1.0
 */
public class WFile {

    public static final String _URL_FILE_SERVE="http://localhost:8080/upload2/file";

    private String fileUrl;

    public WFile(String fileUrl){
        this.fileUrl = fileUrl;
    }

    public String result(){
       return fileUrl;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        // 企业类型
        private String orgType;
        // 企业编号
        private String orgCode;
        // 用户ID
        private String userId;
        // 模块目录
        private String moduleDir;

        private String originFileName;
        // 令牌
        private String token;

        public Builder orgType(String orgType){
            this.orgType = orgType;
            return this;
        }
        public Builder orgCode(String orgCode){
            this.orgCode = orgCode;
            return this;
        }

        public Builder userId(String userId){
            this.userId = userId;
            return this;
        }

        public Builder moduleDir(String moduleDir){
            this.moduleDir = moduleDir;
            return this;
        }
        public Builder originFileName(String originFileName){
            this.originFileName = originFileName;
            return this;
        }

        public Builder token(String token){
            this.token = token;
            return this;
        }
        public WFile post(InputStream in){
            String fileUrl = writeStream1(this,in);
            return new WFile(fileUrl);
        }

        public static String writeStream(Builder p1, InputStream in) {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(_URL_FILE_SERVE);// 创建httpPost
            //httpPost.setHeader("Accept", "application/octet-stream");
           // httpPost.setHeader("Content-Type", "application/octet-stream");
            httpPost.setHeader("token",p1.token);
            httpPost.setHeader("userId", p1.userId);
            httpPost.setHeader("orgType",p1.orgType);
            httpPost.setHeader("originFileName", p1.originFileName);
            //企业编号/activity/
            String dir = p1.orgCode+"/"+p1.moduleDir+"/";
            httpPost.setHeader("moduleDir",dir);
            String charSet = "UTF-8";

            CloseableHttpResponse response = null;
            httpPost.setEntity(new InputStreamEntity(in));
            try {
                try {
                    response = httpclient.execute(httpPost);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                StatusLine status = response.getStatusLine();
                int state = status.getStatusCode();
                if (state == 200) {
                    HttpEntity responseEntity = response.getEntity();
                    String jsonString = EntityUtils.toString(responseEntity);
                    System.out.println("{emr-cdss-extract} 结果===>"+jsonString);
                    JSONObject json = JSON.parseObject(jsonString);
                    return json.getString("data");
                }
                else{
                    //logger.error("请求返回:"+state+"("+url+")");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(in !=null ){
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (response != null) {
                    try {
                        response.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if(httpclient !=null) {
                    try {
                        httpclient.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return null;
        }
        public static String writeStream1(Builder p1, InputStream in) {
            try {
                CloseableHttpClient httpClient = HttpClients.createDefault();
                HttpPost httpPost = new HttpPost(_URL_FILE_SERVE);
                httpPost.setHeader("token",p1.token);
                httpPost.setHeader("userId", p1.userId);
                httpPost.setHeader("orgType",p1.orgType);
                httpPost.setHeader("originFileName", p1.originFileName);
                //企业编号/activity/
                String dir = p1.orgCode+"/"+p1.moduleDir+"/";
                httpPost.setHeader("moduleDir",dir);
                MultipartEntityBuilder builder = MultipartEntityBuilder.create();
                builder.addBinaryBody("file", in);
                HttpEntity multipart = builder.build();
                httpPost.setEntity(multipart);
                CloseableHttpResponse response = httpClient.execute(httpPost);
                HttpEntity responseEntity = response.getEntity();
                String sResponse = EntityUtils.toString(responseEntity, "UTF-8");
                System.out.println("Post 返回结果" + sResponse);
                return sResponse;
            }catch (Exception e){
                e.printStackTrace();

            }finally {
                    if(in !=null){
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
            }

            return null;
        }


    }
}
