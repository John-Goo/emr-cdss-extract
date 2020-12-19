package com.yx.cdss.extract.provider.common;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Form
 * @Desc: TODO
 * @history v1.0
 */
public class Form {

    private String userName;
    private String pwd;
    private String ip;
    private String port;
    private String driverName;
    private int timeout;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    @Override
    public String toString() {
            return "Form{" +
                "userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                ", driverName='" + driverName + '\'' +
                ", timeout=" + timeout +
                '}';
    }
}
