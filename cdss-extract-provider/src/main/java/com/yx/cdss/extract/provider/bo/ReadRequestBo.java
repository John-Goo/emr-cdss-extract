package com.yx.cdss.extract.provider.bo;

public class ReadRequestBo {


    private String paraStr;
    private Integer id;

    public String getParaStr() {
        return paraStr;
    }

    public void setParaStr(String paraStr) {
        this.paraStr = paraStr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ReadRequestBo{" +
                "paraStr='" + paraStr + '\'' +
                ", id=" + id +
                '}';
    }
}
