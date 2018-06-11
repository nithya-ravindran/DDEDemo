package com.horizon.dde.app.Formatter;

import java.util.LinkedHashMap;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.horizon.dde.app.model.AbstractDDEDemoModel;
import com.horizon.dde.app.model.AbstractDDEModel;

public class BaseFormatter {
	private AbstractDDEModel dataObject;
	protected LinkedHashMap<String, AbstractDDEModel> dataMap;
	
	public BaseFormatter() {}
	
	public BaseFormatter(AbstractDDEModel dataObject) {
		try {
			this.dataObject = dataObject;
			ObjectMapper oMapper = new ObjectMapper();
			this.dataMap = (LinkedHashMap<String, AbstractDDEModel>) oMapper.convertValue(dataObject, LinkedHashMap.class);
			System.out.println("Pojo["+this.dataObject+"] To Map["+this.dataMap+"] conversion has been done!!!");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	public void formatClean() {
		System.out.println("formatClean method form the BaseFormatter class has been called!");
	}
	
	public void formatGender() {
		System.out.println("formatGender method form the BaseFormatter class has been called!");
	}

	public LinkedHashMap<String, AbstractDDEModel> getDataMap() {
		return dataMap;
	}

	public void setDataMap(LinkedHashMap<String, AbstractDDEModel> dataMap) {
		this.dataMap = dataMap;
	}
	
	
	
	

}
