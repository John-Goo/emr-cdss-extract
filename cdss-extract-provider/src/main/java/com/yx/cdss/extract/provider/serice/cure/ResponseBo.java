package com.yx.cdss.extract.provider.serice.cure;

public class ResponseBo {
	
	private int msgCode;
	private String msg="success";
	
	private Object T;

	public ResponseBo(int msgCode, String msg, Object t) {
		super();
		msgCode = msgCode;
		this.msg = msg;
		T = t;
	}
	
	public ResponseBo() {
		
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getT() {
		return T;
	}

	public void setT(Object t) {
		T = t;
	}

	public int getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(int msgCode) {
		this.msgCode = msgCode;
	}
	
	
	
	
	
	
	

}
