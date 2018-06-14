package com.horizon.dde.app.Formatter;

import java.util.LinkedHashMap;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.horizon.dde.app.model.AbstractDDEDemoModel;
import com.horizon.dde.app.model.AbstractDDEModel;

public class BaseFormatter {
	protected AbstractDDEModel dataObject;
	public BaseFormatter() {}
	
	/*public BaseFormatter(AbstractDDEModel dataObject) {
		try {
			this.dataObject = dataObject;
			ObjectMapper oMapper = new ObjectMapper();
			this.dataMap = (LinkedHashMap<String, AbstractDDEModel>) oMapper.convertValue(dataObject, LinkedHashMap.class);
			System.out.println("Pojo["+this.dataObject+"] To Map["+this.dataMap+"] conversion has been done!!!");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}*/
	
	public AbstractDDEModel getDataObject() {
		return dataObject;
	}

	public void setDataObject(AbstractDDEModel dataObject) {
		this.dataObject = dataObject;
	}
	
	public void formatClean() {
		System.out.println("formatClean method form the BaseFormatter class has been called!");
		System.out.println("The Model Data is : " + this.dataObject);
	}
	
	public void formatGender() {
		System.out.println("formatGender method form the BaseFormatter class has been called!");
	}
	
	



}
