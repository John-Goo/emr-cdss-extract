package com.yx.cdss.extract.provider.bo;

public class CalcRequestBo {

    Integer id;
    // 1 2 3
    String dataStr;

    @Override
    public String toString() {
        return "CalcRequestBo{" +
                "id=" + id +
                ", dataStr='" + dataStr + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataStr() {
        return dataStr;
    }

    public void setDataStr(String dataStr) {
        this.dataStr = dataStr;
    }
}
