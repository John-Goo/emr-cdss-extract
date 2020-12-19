package com.yx.cdss.extract.provider.controller;

import com.yx.cdss.extract.provider.bo.CalcRequestBo;
import com.yx.cdss.extract.provider.bo.JStu;
import com.yx.cdss.extract.provider.common.WResult;
import com.yx.cdss.extract.provider.filter.*;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class TokenDemoController {


    @WAuth(value = WAuthEnum.ADMIN)
    @ApiOperation(value = "账号显示-权限" )
    @RequestMapping(value = "/my/show", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public WResult classLoad(@RequestBody CalcRequestBo requestBo) {
        WResult wResult = WResult.newInstance();
        System.out.println("接收到参数===>"+requestBo);
        List<JStu> stuLsit = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            JStu jStu = new JStu(requestBo.getId(),requestBo.getDataStr());
            stuLsit.add(jStu);
        }
        wResult.ok(stuLsit);
        return wResult;
    }




    @WAuth(value = WAuthEnum.ADMIN)
    @ApiOperation(value = "jwt令牌生成" )
    @RequestMapping(value = "/wauth/token", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public WResult login(@RequestBody JwtUser jwtUser) {
        WResult wResult = WResult.newInstance();
        System.out.println("接收到参数===>"+jwtUser);
        String tokenStr = JwtUtil.generate(jwtUser);
        wResult.ok(tokenStr);
        jwtUser.setToken(tokenStr);
        // 存储缓存
        RedisUtil.put(jwtUser.getUserId(),tokenStr);
        return wResult;
    }




}
