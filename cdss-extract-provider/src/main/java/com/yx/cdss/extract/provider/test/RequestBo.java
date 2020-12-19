package com.yx.cdss.extract.provider.test;

import com.yx.cdss.extract.provider.bo.SensorBo;

import java.util.Random;

public class RequestBo implements SensorBo{
	private String name;
	private Integer age;
	private String addr;

	public <T> T result(Class<?> cls)  {
		try {
			return (T)cls.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String getHandlerType() {
		return "cure";
	}
	@Override
	public void setResultBo(Object obj) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Object getResultBo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		int j =new Random().nextInt(1000);
		System.out.println(j);;
		RequestBo bo = new RequestBo();
		Student stu = bo.result(Student.class);
		System.out.println(stu);
	}
	
	
	

}
