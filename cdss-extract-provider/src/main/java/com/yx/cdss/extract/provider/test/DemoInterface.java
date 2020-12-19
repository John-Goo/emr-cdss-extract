package com.yx.cdss.extract.provider.test;

public class DemoInterface {
	
	
	public String hello(String args) {
		return "hello";
	}
	
	
	public void send(String msg) {
		System.out.println(msg);
	}
	
	public RequestBo execute(RequestBo bo) {
		
		return bo;
	}

}
