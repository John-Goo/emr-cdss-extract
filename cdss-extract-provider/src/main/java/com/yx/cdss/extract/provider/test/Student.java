package com.yx.cdss.extract.provider.test;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import lombok.Data;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Student
 * @Desc: TODO
 * @history v1.0
 */
@Data
public class Student {
    private String idCard;
    private String name;
    private int age;
    private String addr;

    public Student(){
    }

    public Student(String id, String name, int age, String addr) {
        this.idCard = id;
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public Student(String id, String name) {
        this.idCard = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Student{" +
                "idCard='" + idCard + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }
}
