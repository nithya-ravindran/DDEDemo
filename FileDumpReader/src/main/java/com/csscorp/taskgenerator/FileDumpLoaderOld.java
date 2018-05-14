package com.csscorp.taskgenerator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.springframework.stereotype.Component;

@Component
public class FileDumpLoaderOld implements Serializable {
	
	private String name = "Arif ";	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	ArrayList<LinkedHashMap<String,Object>> dataTable;
	
	public FileDumpLoaderOld() {
		dataTable = new ArrayList<>();
		
		LinkedHashMap<String, Object> row_one = new LinkedHashMap<String,Object>();
		row_one.put("Name", "Arif");
		row_one.put("age", "20");
		row_one.put("gender", "M");
		row_one.put("DOJ", "12-Jan-2015");
		row_one.put("Blood Group", "A+");
		dataTable.add(row_one);
		
		LinkedHashMap<String, Object> row_two = new LinkedHashMap<String,Object>();
		row_two.put("Name", "Nithya");
		row_two.put("age", "30");
		row_two.put("gender", "f");
		row_two.put("DOJ", "31-Jan-2016");
		row_two.put("Blood Group", "A-");
		dataTable.add(row_two);
		
		LinkedHashMap<String, Object> row_three = new LinkedHashMap<String,Object>();
		row_three.put("Name", "Anees");
		row_three.put("age", "25");
		row_three.put("gender", "F");
		row_three.put("DOJ", "12-Jan-2015");
		row_three.put("Blood Group", "B+");
		dataTable.add(row_three);
		
		LinkedHashMap<String, Object> row_four = new LinkedHashMap<String,Object>();
		row_four.put("Name", "Sam");
		row_four.put("age", "18");
		row_four.put("gender", "M");
		row_four.put("DOJ", "01-Mar-2017");
		row_four.put("Blood Group", "AB");
		dataTable.add(row_four);
		
		LinkedHashMap<String, Object> row_five = new LinkedHashMap<String,Object>();
		row_five.put("Name", "Raja");
		row_five.put("age", "29");
		row_five.put("gender", "M");
		row_five.put("DOJ", "15-May-2015");
		row_five.put("Blood Group", "O+");
		dataTable.add(row_five);
		
		

	}
	
	public ArrayList<LinkedHashMap<String,Object>> getDataTable() {
		return dataTable;
	}

}
