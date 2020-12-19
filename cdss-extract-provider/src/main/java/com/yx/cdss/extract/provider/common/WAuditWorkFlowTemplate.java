package com.yx.cdss.extract.provider.common;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import com.alibaba.fastjson.JSON;
import com.mongodb.client.result.UpdateResult;
import com.yx.cdss.extract.model.mapper.DictDrugMapper;
import com.yx.cdss.extract.provider.bo.AuditContent;
import com.yx.cdss.extract.provider.bo.AuditDetailRecord;
import com.yx.cdss.extract.provider.bo.AuditStatusRequBo;
import com.yx.cdss.extract.provider.util.BeanCopyUtil;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: WAuditWorkFlowTemplate
 * @Desc: TODO
 * @history v1.0
 */
@Component
public  class WAuditWorkFlowTemplate {

    /**
     * 审核内容表
     */
    public static final String _C_AUDIT_CONTENT="audit_content";

    /**
     * 审核流水表
     */
    public static final String _C_AUDIT_DETAIL_RECORD="audit_detail_record";

    @Resource
    private DictDrugMapper dictDrugMapper;

    @Resource
    private MongoTemplate mongoTemplate;

    @Resource
    protected WorkflowSeqUtil workflowSeqUtil;



    public String insert(AuditContent auditContent){
        AuditContent ac = mongoTemplate.insert(auditContent);
        return ac.getContentId().toString();
    }

    public String insert(AuditDetailRecord auditDetailRecord){
        AuditDetailRecord adr = mongoTemplate.insert(auditDetailRecord);
        return adr.getId().toString();
    }

    public String update(AuditContent auditContent){
        // 创建条件对象
        Criteria criteria = Criteria.where("contentId").is(auditContent.getContentId());
        // 创建查询对象，然后将条件对象添加到其中
        Query query = new Query(criteria);
        // 创建更新对象,并设置更新的内容
        int auditRole = auditContent.getAuditRole();
        Update update = new Update()
                .set("auditStatus", auditContent.getAuditStatus())
                .set("auditBy", auditContent.getAuditBy())
                .set("auditByName", auditContent.getAuditByName())
                .set("auditRemark", auditContent.getAuditRemark())
                .set("upateTime", new Date())
                .set("auditRole", auditRole)
                .set("auditRoleName", AuditRoleEnum.getAuditRoleName(auditRole))
                .set("nodeStep",auditRole)
                .set("nodeName",AuditRoleEnum.getNodeName(auditRole));

        // 执行更新，如果没有找到匹配查询的文档，则创建并插入一个新文档
        UpdateResult result = mongoTemplate.upsert(query, update, AuditContent.class, _C_AUDIT_CONTENT);
        return null;
    }

    public String update(AuditDetailRecord auditDetailRecord){
        // 创建条件对象
        Criteria criteria = Criteria
                .where("contentId").is(auditDetailRecord.getContentId())
                .and("serialNumber").is(auditDetailRecord.getSerialNumber())
                .and("auditRole").is(auditDetailRecord.getAuditRole());
        // 创建查询对象，然后将条件对象添加到其中
        Query query = new Query(criteria);
        // 创建更新对象,并设置更新的内容
        int auditRole = auditDetailRecord.getAuditRole();
        Update update = new Update()
                .set("auditStatus", auditDetailRecord.getAuditStatus())
                .set("auditBy", auditDetailRecord.getAuditBy())
                .set("auditByName", auditDetailRecord.getAuditByName())
                .set("auditRemark", auditDetailRecord.getAuditRemark())
                .set("auditTime", new Date())
                .set("auditRole", auditDetailRecord.getAuditRole())
                .set("auditRoleName", AuditRoleEnum.getAuditRoleName(auditRole))
                // 审核角色值=节点审核步骤
                .set("nodeStep",auditRole)
                .set("nodeName",AuditRoleEnum.getNodeName(auditRole));

        // 执行更新，如果没有找到匹配查询的文档，则创建并插入一个新文档
        UpdateResult result = mongoTemplate.upsert(query, update, AuditContent.class, _C_AUDIT_CONTENT);
        System.out.println(JSON.toJSONString(result));
        return result.getUpsertedId().toString();
    }

    public String modifyAuditStatus(AuditStatusRequBo audit){
        // 反查sys_user信息，得到账号、姓名、审核角色、appUserId、登录APP手机号码
        AuditContent auditContent = BeanCopyUtil.copyBean(audit,AuditContent.class);
        ObjectId contentId = new ObjectId(audit.getContentId());
        auditContent.setContentId(contentId);
        // 查询审核内容
        AuditContent ac = mongoTemplate.findById(contentId,AuditContent.class,_C_AUDIT_CONTENT);
        String serialNumber = ac.getSerialNumber();
        // 校验检查
        if( ac.getAuditRole() >= audit.getAuditRole()){
            throw new RuntimeException("该步骤["+ac.getAuditRole()+"]与用户审核角色["+audit.getAuditRole()+"]不匹配！");
        }

        /**
         * 更新审核内容状态
         */
        update(auditContent);
        /**
         * 更新审核流水明细
         */
        AuditDetailRecord auditDetail = BeanCopyUtil.copyBean(audit,AuditDetailRecord.class);
        // 查询条件
        auditDetail.setSerialNumber(serialNumber);
        auditDetail.setContentId(audit.getContentId());
        auditDetail.setAuditRole(audit.getAuditRole());
        // 更新数据
        auditDetail.setAuditStatus(audit.getAuditStatus());
        update(auditDetail);
        return null;
    }

    public AuditContent query(){
        return null;
    }

    public String delete(){
        return null;
    }






}
