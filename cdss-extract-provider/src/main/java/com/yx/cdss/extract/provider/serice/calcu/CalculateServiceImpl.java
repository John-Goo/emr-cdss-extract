package com.yx.cdss.extract.provider.serice.calcu;

import com.yx.cdss.extract.provider.common.lock.DistributeSharedLock;
import com.yx.cdss.extract.provider.util.TCPClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service("calculateService")
public class CalculateServiceImpl implements CalculateService {

    //代表成功标志
    final static String _OK = "OK";

    @Override
    public   Integer calculate(String dataPacket,String batchT) {
        DistributeSharedLock lock = new DistributeSharedLock("/calculate-lock");
        int result = 0;
        try {
            // 创建目录，等待获取锁的过程
            if(lock.tryLock(60,TimeUnit.SECONDS)) {
                String[] data = dataPacket.split(" ");
                long threadId = Thread.currentThread().getId();
                // #start# 标志开始
                String ack = TCPClient.Builder.send("start#batchT#" + threadId);
                // OK,代表计算服务准备就绪，可以开始传输计算数据值
                if (_OK.equals(ack)) {
                    for (int i = 0; i < data.length; i++) {
                        String msg = (i + 1) + "," + data[i] + "," + threadId;
                        TCPClient.Builder.send(msg);
                    }
                }
                // #end#标记结束
                String calR = TCPClient.Builder.send("end#batchT#" + Thread.currentThread().getId());
                if (!StringUtils.isEmpty(calR)) {
                    result = Integer.valueOf(calR);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            TCPClient.Builder.close();
            // 释放锁，删除创建的子目录
            lock.release();
        }
        return result;
    }

    public void read(String dataPacket,String userId){
        long threadId = Thread.currentThread().getId();
        String[] data = dataPacket.split(",");
        for (int i = 0; i < data.length; i++) {
            String msg ="[" + threadId+"]==>"+ (i + 1) + "," + data[i];
            System.out.println("[发送查询参数]:"+msg);
            String retMsg = TCPClient.Builder.send(msg);
            System.out.println("[返回查询结果]:"+retMsg);
        }
        TCPClient.Builder.close();
    }
}
