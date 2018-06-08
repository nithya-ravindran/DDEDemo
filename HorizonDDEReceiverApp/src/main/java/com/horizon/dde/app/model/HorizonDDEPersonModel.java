package com.horizon.dde.app.model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.stereotype.Component;
import com.fasterxml.jackson.annotation.JsonInclude;

@Component
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HorizonDDEPersonModel extends AbstractDDEModel implements Serializable  {
	private String dataInstanceID;
	private String name;
	private String gender;
	private int age;
	
	public HorizonDDEPersonModel(){};
	
	public HorizonDDEPersonModel(String dataInstanceID,String name, String gender, int age) {
		super();
		this.dataInstanceID = dataInstanceID;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
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
	@Override
	public String toString() {
		return String.format("{instanceId = %d, name = %s, gender = %s, age =%d}", dataInstanceID,name, gender,age);
	}	
}
