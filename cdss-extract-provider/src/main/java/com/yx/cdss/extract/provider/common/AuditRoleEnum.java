package com.yx.cdss.extract.provider.common;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/
public enum AuditRoleEnum {
    PUBLISHER(1,"发布员"),//Publisher
    EDITOR(2,"编辑员"),
    AUDITOR(3,"审核员");

    private Integer auditRole;
    private String auditRoleName;



    AuditRoleEnum(Integer auditRole, String auditRoleName) {
        this.auditRole = auditRole;
        this.auditRoleName = auditRoleName;
    }
    public Integer getAuditRole(){
       return this.auditRole;
    }
    public String getAuditRoleName(){
        return this.auditRoleName;
    }

    public static String getAuditRoleName(Integer auditRole) {
        for (AuditRoleEnum c : AuditRoleEnum.values()) {
            if (c.getAuditRole() == auditRole) {
                return c.getAuditRoleName();
            }
        }
        return null;
    }

    public static String getNodeName(Integer auditRole) {
        for (AuditRoleEnum c : AuditRoleEnum.values()) {
            if (c.getAuditRole() == auditRole) {
                return c.getAuditRoleName();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(AuditRoleEnum.EDITOR.getAuditRole());;
        System.out.println( AuditRoleEnum.getAuditRoleName(2));
    }

}
