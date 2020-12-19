package com.yx.cdss.extract.provider.test;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: ContactInfo
 * @Desc: TODO
 * @history v1.0
 */
public class ContactInfo {
    private String telephone;
    private String country;
    private String province;
    private String city;

    public ContactInfo(){
    }

    public ContactInfo(String telephone, String country, String province, String city) {
        this.telephone = telephone;
        this.country = country;
        this.province = province;
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
