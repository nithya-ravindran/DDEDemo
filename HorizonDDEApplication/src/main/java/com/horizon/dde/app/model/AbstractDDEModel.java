package com.horizon.dde.app.model;

import java.io.Serializable;
import java.util.UUID;

public abstract class AbstractDDEModel implements Serializable{

	private String dataInstanceID;
	private String name;
	private String gender;
	private int age;
	
	public AbstractDDEModel(){};
	
		
	public String getDataInstanceID() {
		return dataInstanceID.toString();
	}
	public void setDataInstanceID(UUID uuid) {
		this.dataInstanceID = uuid.toString();
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
