package com.horizon.dde.app.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class HorizonDDEDemoModel extends AbstractDDEModel implements Serializable  {
	private int dataInstanceID = 0;
	private String name;
	private String gender;
	private int age;
	
	public HorizonDDEDemoModel(){};
	
	public HorizonDDEDemoModel(int dataInstanceID,String name, String gender, int age) {
		super();
		this.dataInstanceID = dataInstanceID;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
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
	@Override
	public String toString() {
		return String.format("{instanceId = %d, name = %s, gender = %s, age =%d}", dataInstanceID,name, gender,age);
	}	
}
