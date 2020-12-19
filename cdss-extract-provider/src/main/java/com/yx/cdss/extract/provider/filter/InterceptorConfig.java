package com.yx.cdss.extract.provider.filter;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @author John Goo
 * @version 1.0
 * @ClassName: InterceptorConfig
 * @Desc: TODO
 * @history v1.0
 */
//@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Value("${spring.profiles.active}")
    private String profileEnv;

    @Autowired
    private AuthenticationInterceptor authenticationInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        JwtUtil.setProfileEnv(profileEnv);
        registry.addInterceptor(this.authenticationInterceptor)
                .excludePathPatterns("//wauth/token/*")
                .addPathPatterns("/my/**");
        // 拦截所有请求
        System.out.println("======== > interceptors =====");
    }
}
