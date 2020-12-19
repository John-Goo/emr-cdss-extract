package com.yx.cdss.extract.provider.controller;

import com.yx.cdss.extract.provider.bo.CalcRequestBo;
import com.yx.cdss.extract.provider.bo.JStu;
import com.yx.cdss.extract.provider.bo.StudentRequBo;
import com.yx.cdss.extract.provider.common.WResult;
import com.yx.cdss.extract.provider.util.WSyncDataHelper;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TraceClassLoadingController {



   // @WAuth(value = WAuthEnum.ADMIN)
    @ApiOperation(value = "演示class 加载过程" )
    @RequestMapping(value = "/my/classloading", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public WResult classLoad(@RequestBody CalcRequestBo requestBo) {
        WResult wResult = WResult.newInstance();
        System.out.println("接收到参数===>"+requestBo);
        List<JStu> stuLsit = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            JStu jStu = new JStu(requestBo.getId(),requestBo.getDataStr());
            stuLsit.add(jStu);
        }
        wResult.ok(stuLsit);
        /**
         * 同步数据
         */
        //String url = "http://localhost:8082/queryInfo";
        String url = "http://192.168.0.104:8082/queryInfo";
        StudentRequBo requBo = new StudentRequBo();
        requBo.setName("John");
        requBo.setIdCard("66666666661");
        requBo.setAddr("深圳");
        WResult<StudentRequBo> wResult1 = WSyncDataHelper.builder()
                .setEntity(requBo)
                .post(url)
                .execute(StudentRequBo.class);
        System.out.println(" >>>"+wResult1.getData());

        return wResult;
    }





}
