package com.yx.cdss.extract.provider.controller;

import com.yx.cdss.extract.provider.bo.CalcRequestBo;
import com.yx.cdss.extract.provider.bo.ReadRequestBo;
import com.yx.cdss.extract.provider.common.WResult;
import com.yx.cdss.extract.provider.serice.calcu.CalculateService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculateController {

    @Autowired
    private CalculateService calculateService;



    @ApiOperation(value = "计算服务模块1" )
    @RequestMapping(value = "/calculate1", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public WResult calculate1(@RequestBody CalcRequestBo requestBo) {
        System.out.println("接收到参数===>"+requestBo);
        String batchT = "第1批次";
        Integer result = calculateService.calculate(requestBo.getDataStr(),batchT);
        System.out.println("线程ID:"+Thread.currentThread().getId()+" ,"+batchT+" 计算结果："+result);
        return new WResult();
    }


    @ApiOperation(value = "模拟分布式锁查询服务" )
    @RequestMapping(value = "/read", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public WResult read(@RequestBody ReadRequestBo requestBo) {
        System.out.println("接收到参数===>"+requestBo.toString());
        String batchT = "第1批次";
        calculateService.read(requestBo.getParaStr(),batchT);
        return new WResult();
    }

    @ApiOperation(value = "模拟Jmeter接收http Post参数" )
    @RequestMapping(value = "/queryInfo", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public WResult queryInfo(@RequestBody ReadRequestBo requestBo) {
        System.out.println("接收到参数===>"+requestBo.toString());
        WResult result = new WResult();
        return result;
    }

    @ApiOperation(value = "模拟Jmeter接收http Get参数" )
    @RequestMapping(value = "/simpleHttp", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public WResult simpleHttp(@RequestParam String describe) {
        System.out.println("接收到参数===>"+describe.toString());
        WResult result = new WResult();
        return result;
    }


}
