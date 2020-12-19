package com.yx.cdss.extract.provider.common;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: XXXFactory
 * @Desc: TODO
 * @history v1.0
 */
public class XXXFactory {



    public static Builder builder(){
        return new Builder();
    }


    public static class Builder {

        private Form form ;


        public  Builder(){
            form = new Form();
        }

        public Builder userName(String userName) {
            form.setUserName(userName);
            return this;
        }

        public Builder pwd(String pwd) {
            form.setPwd(pwd);
            return this;
        }

        public Builder ip(String ip) {
            form.setIp(ip);
            return this;
        }

        public Builder port(String port) {
            form.setPort(port);
            return this;
        }

        public Builder driverName(String driverName) {
            form.setDriverName(driverName);
            return this;
        }

        public Builder timeout(int timeout) {
            form.setTimeout(timeout);
            return this;
        }

        public Form build() {
            return form;
        }
    }

}
