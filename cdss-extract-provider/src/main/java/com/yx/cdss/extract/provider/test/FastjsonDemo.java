package com.yx.cdss.extract.provider.test;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: FastjsonDemo
 * @Desc: TODO
 * @history v1.0
 */
public class FastjsonDemo {
    public static void main(String[] args) {
        ContactInfo contactInfo = new ContactInfo("13828725750",
                "广东省","深圳市","南山区");
        Student stu = new Student("999","John Goo",23,"深圳");
        System.out.println("&addr1:"+contactInfo);
        String str =  JSON.toJSONString(stu);
        Student stu1 = JSON.parseObject(str,Student.class);
        System.out.println(stu1.getAddr());
        String str2 = JSON.toJSONString(stu1);
        System.out.println("str1:"+str2);
        JSONObject jsonObject = JSON.parseObject(str2);
        JSONObject contactJson = jsonObject.getJSONObject("contactInfo");
        System.out.println(contactJson.get("city"));
        Gson gson = new Gson();
        Student stu3 = gson.fromJson(str2,Student.class);




    }
}

