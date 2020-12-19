package com.yx.cdss.extract.provider.controller;

import com.alibaba.fastjson.JSON;
import com.yx.cdss.extract.model.entity.DictDrug;
import com.yx.cdss.extract.provider.bo.AuditContent;
import com.yx.cdss.extract.provider.bo.AuditDetailRecord;
import com.yx.cdss.extract.provider.common.WAuditWorkFlowTemplate;
import com.yx.cdss.extract.provider.common.WResult;
import com.yx.cdss.extract.provider.common.WorkflowSeqUtil;
import com.yx.cdss.extract.provider.serice.examine.AuditWorkflowService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
//@Api(value = "审核工作流",tags = "审核工作流")
public class AuditWorkflowController {
	


	@Resource
	private AuditWorkflowService auditWorkflowService;

	@Resource
	private WorkflowSeqUtil workflowSeqUtil;

	//@Resource
	private WAuditWorkFlowTemplate wAuditWorkFlowTemplate;

	@ApiOperation(value = "审核工作流——添加" )
	@RequestMapping(value = "/workflow/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public WResult<List<DictDrug>> addAuditContent(@RequestBody AuditContent auditContent) {
		System.out.println("访问线程："+Thread.currentThread().getId());
		WResult result = new WResult();
		System.out.println(">>>接收到参数："+ JSON.toJSON(auditContent));
		String contentId = auditWorkflowService.addAuditContent(auditContent);
		result.ok(contentId);
		return result;
	}

	@ApiOperation(value = "审核工作流——添加" )
	@RequestMapping(value = "/workflow/audit", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public WResult<String> audit(@RequestBody AuditDetailRecord auditDetailRecord) {
		WResult result = new WResult();
		System.out.println(">>>接收到参数："+ JSON.toJSON(auditDetailRecord));

		String id = wAuditWorkFlowTemplate.update(auditDetailRecord);
		result.ok(id);
		return result;
	}

	
}
