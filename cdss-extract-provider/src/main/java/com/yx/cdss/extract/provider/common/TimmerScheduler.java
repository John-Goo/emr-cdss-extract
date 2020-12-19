package com.yx.cdss.extract.provider.common;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: JavaConfig
 * @Desc: TODO
 * @history v1.0
 */
@Component
public class TimmerScheduler {
    // java配置
    public TimmerScheduler(){
        System.out.println("============== JavaConfig ===========");
        timer4();
    }

    public static void timer4() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 21); // 控制时
        calendar.set(Calendar.MINUTE, 45);    // 控制分
        calendar.set(Calendar.SECOND, 0);    // 控制秒

        Date time = calendar.getTime();     // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println("-------设定要指定任务--------");
            }
        }, time, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行
    }

    public static void timer2() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println("-------设定要指定任务--------");
            }
        }, 1000, 5000);
    }

}
