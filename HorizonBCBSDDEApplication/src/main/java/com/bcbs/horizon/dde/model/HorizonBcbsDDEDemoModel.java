package com.bcbs.horizon.dde.model;

import java.io.Serializable;

public class HorizonBcbsDDEDemoModel extends AbstractDDEModel implements Serializable  {
	
	
	private String name;
	private String gender;
	private int age;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
