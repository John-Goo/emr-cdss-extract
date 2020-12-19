package com.yx.cdss.extract.provider.filter;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import com.yx.cdss.extract.provider.common.WResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: AuthenticationInterceptor
 * @Desc: TODO
 * @history v1.0
 */
//@Component
public class AuthenticationInterceptor implements HandlerInterceptor {

    private Logger logger = Logger.getLogger("AuthenticationInterceptor");
    @Autowired
    private JwtValidator jwtValidator;
    @Value("${spring.profiles.active}")
    private String profileFlag;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("handler>>>"+handler);
        if (!(handler instanceof HandlerMethod)
                || "local".equals(profileFlag)) {
            return true;
        }
        String clientId = request.getHeader("clientId");
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        System.out.println(handlerMethod.getMethod().getName()+",");
        Method method = handlerMethod.getMethod();
        WAuth wAuth = handlerMethod.getMethod().getAnnotation(WAuth.class);
        // 没有加安全注解或ANNO标签，匿名访问
        if( wAuth == null || "ANNO".contains(wAuth.value().toString())){
            // 匿名访问
            return true;
        }
        String currToken = request.getHeader("token");
        System.out.println(">>>> 令牌字符："+currToken);

        if (!currToken.startsWith("wtoken-")) {
            showTips(202,"Token格式不正确！",response);
            return false;
        }

        /**
         * 解密令牌
         */
        JwtUser jwtUser = JwtUtil.validate(currToken);

        System.out.println(">>>> 令牌信息："+jwtUser);
        if (jwtUser == null ) {
            showTips(203,"非法Token！",response);
            return false;
        }
        String userId = jwtUser.getUserId();
        String redisJwtUserToken = RedisUtil.get(userId);
        if(redisJwtUserToken==null || !currToken.equals(redisJwtUserToken)){
            showTips(204,"访问Token不正确！",response);
            return false;
        }else if(!jwtUser.getClientId().equals(clientId)){
            showTips(205,"客户端Id发生变化,会话Token失效!",response);
            return false;
        }

        // 获取用户角色，一个用户可以有多种角色
        String role = jwtUser.getRoles();
        System.out.println(">>>> 用户角色："+role);
        String annotationVal = wAuth.value().toString().toUpperCase();
        if(role.indexOf(annotationVal) != -1){
            // 允许访问
            return true;
        }else{
            showTips(201,"没有权限访问！",response);
            return false;
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("=== postHandle ===");
    }

    public void showTips(Integer code,String msg,HttpServletResponse response){
        WResult wResult = WResult.newInstance();
        response.setHeader("Content-type", "application/json;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        wResult.failer(code,msg);
        try {
            response.getWriter().write(wResult.toString());
            response.flushBuffer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }


    /**
     * 获取真实ip地址，避免获取代理ip
     */
    public static String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
