package com.yx.cdss.extract.provider.serice.examine;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import com.yx.cdss.extract.provider.bo.AuditContent;
import org.springframework.stereotype.Component;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: AuditWorkflowService
 * @Desc: TODO
 * @history v1.0
 */
@Component
public class AuditWorkflowService {

    public AuditWorkflowService(){
        System.out.println("============ 初始化 ==============");
    }

    public String addAuditContent(AuditContent auditContent){
      /*  String workflowSeq = workflowSeqUtil.generate();
        auditContent.setSerialNumber(workflowSeq);
        String contentId = insert(auditContent);
        // 发布员
        AuditDetailRecord deployer = new AuditDetailRecord();
        deployer.setContentId(contentId);
        deployer.setSerialNumber(workflowSeq);
        deployer.setAuditRoleName("发布员");
        insert(deployer);
        // 编辑员
        AuditDetailRecord editor = new AuditDetailRecord();
        editor.setContentId(contentId);
       // editor.setAuditWorkflowSeq(workflowSeq);
       // editor.setAuditFixedNodeStep(2);
        //editor.setAuditFixedNodeName("编辑员");
        insert(editor);
        // 审核员
        AuditDetailRecord auditor = new AuditDetailRecord();
        auditor.setContentId(contentId);
        //auditor.setAuditWorkflowSeq(workflowSeq);
       // auditor.setAuditFixedNodeName("审核员");
       // auditor.setAuditFixedNodeStep(3);
        insert(auditor);
        return contentId;*/
      return null;
    }

}
