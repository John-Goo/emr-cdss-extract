package com.yx.cdss.extract.provider.bo;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import lombok.Data;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: AuditStatusRequBo
 * @Desc: TODO
 * @history v1.0
 */
@Data
public class AuditStatusRequBo {

    private String  contentId;
    private Integer auditStatus;
    // sys_user-->userId
    private Long    auditBy;
    private Integer auditRole;
    private String  auditRemark;

}
