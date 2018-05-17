package com.horizon.dde.app.model;

public abstract class AbstractDDEModel {

	private int dataInstanceID = 0;
	private String name;
	private String gender;
	private int age;
	
		
	public int getDataInstanceID() {
		return dataInstanceID;
	}
	public void setDataInstanceID(int dataInstanceID) {
		this.dataInstanceID = dataInstanceID;
	}
	
	
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
