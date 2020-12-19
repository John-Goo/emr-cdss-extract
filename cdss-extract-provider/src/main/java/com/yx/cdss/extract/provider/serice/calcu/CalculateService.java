package com.yx.cdss.extract.provider.serice.calcu;

/**
 * 计算服务,调用Mina-TCP
 */
public interface CalculateService {

    /**
     * 调用计算服务模块，远程服务为单线程计算
     * @param dataPacket
     * @return
     */
    public Integer calculate(String dataPacket,String batchT);

    /**
     * 查询数据
     *
     * @param dataPacket
     * @param userId
     */
    public void read(String dataPacket,String userId);

}
