package com.yx.cdss.extract.provider.filter;

public class JwtUser {

    // 用户ID
    private String userId;
    // 用户角色,以英文半角逗号[,]分割
    private String roles;
    // 用户名称
    private String userName;
    // 客户端Id
    private String clientId;
    // 登录令牌
    private String token;
    // 平台类型：1-APP(andriod,iOS),2-PC
    private Integer platformType;
    // 创建时间
    private Long createTime;


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getUserName() {
        return userName;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Integer getPlatformType() {
        return platformType;
    }

    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    @Override
    public String toString() {
        return "JwtUser{" +
                "userId='" + userId + '\'' +
                ", roles='" + roles + '\'' +
                ", userName='" + userName + '\'' +
                ", clientId='" + clientId + '\'' +
                ", token='" + token + '\'' +
                ", platformType=" + platformType +
                ", createTime=" + createTime +
                '}';
    }
}
