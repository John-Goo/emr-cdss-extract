package com.yx.cdss.extract.provider.common;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import com.alibaba.fastjson.JSONObject;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: WorkflowSeqUtil
 * @Desc: TODO
 * @history v1.0
 */
@Component
public class WorkflowSeqUtil {

    @Resource
    private  MongoTemplate mongoTemplate;

    // 今天最大的序号，暂时定义，@Todo
    public static Integer maxTodayWorkflowSeq = 0;

    public  String generate(){
        GregorianCalendar calendar = new GregorianCalendar();
        int amPm =calendar.get(GregorianCalendar.AM_PM);
        // 上午
        String seqPrefix = "F";
        //if(amPm == 1){
            // 下午
           // seqPrefix = "P" ;
       // }
        int seq = maxTodayWorkflowSeq;
        if(seq ==0){
           seq = queryMaxTodayWorkflowSeq();
        }
        //通过格式化输出日期
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String dateStr = format.format(Calendar.getInstance().getTime());
        //String seqLastQty="00001";
        maxTodayWorkflowSeq = seq + 1;
        int temp =  maxTodayWorkflowSeq;

        String seqLastQty = new DecimalFormat("00000").format(temp);
        return seqPrefix+dateStr+seqLastQty;
    }

    public    Integer parseWorkflowSeq(String currMaxWorkflowSeq) {
        if(currMaxWorkflowSeq == null){
            throw  new RuntimeException(" 解析工作流序号不能为空！");
        }
        String hisDateStr = currMaxWorkflowSeq.substring(1,9);
        String last = currMaxWorkflowSeq.substring(9,currMaxWorkflowSeq.length());
        //通过格式化输出日期
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String dateStr = format.format(Calendar.getInstance().getTime());
        if(!dateStr.equals(hisDateStr)){
            last = "0";
        }
        return Integer.valueOf(last);
    }

    private  Integer  queryMaxTodayWorkflowSeq(){
        AggregationOperation aggregationOperation = Aggregation.group("_id")
                .max("auditWorkflowSeq").as("auditWorkflowSeq");
        AggregationOperation limit = Aggregation.limit(1);
        // 将操作加入到聚合对象中
        Aggregation aggregation = Aggregation.newAggregation(aggregationOperation, limit);
        // 执行聚合查询
        AggregationResults<String> results = mongoTemplate.aggregate(aggregation, "audit_content", String.class);
        if(results ==null || results.getMappedResults().isEmpty()){
            // 没有最大记录
            return 0;
        }
        String rawJson = results.getMappedResults().get(0);
        String maxWorkflowSeq=null;
        int seq = 0;
        if(rawJson !=null){
            maxWorkflowSeq = JSONObject.parseObject(rawJson).getString("auditWorkflowSeq");
            seq = parseWorkflowSeq(maxWorkflowSeq);
        }
        System.out.println(" seql:"+maxWorkflowSeq);
        return  seq;

    }
    public static void main(String[] args) {
      // String workflowSeq =  generate();
        //System.out.println( generate());
        //Sem.ystem.out.println( generate());
        //Systout.println( generate());
        //System.out.println( generate());
        //System.out.println( generate());



    }
}
