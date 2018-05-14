package com.csscorp.taskgenerator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class FileDumpLoader {
	
	@Value("${file.path}")
	private String propFeedFilePath;
	
	@Value("${file.name}")
	private String feedFileName;
	
	private FileReader fileFeed; 

	private BufferedReader fileReader;
	
	@Autowired
	private Sender sender;
	
	private ArrayList<DataRow> table;
	
	public FileDumpLoader() throws FileNotFoundException   {
		table = new ArrayList<>();
		String path = propFeedFilePath+"/"+feedFileName;
		System.out.println(path);
	}
	
	public ArrayList<DataRow> getTable() {
		return table;
	}

	public void setTable(ArrayList<DataRow> table) {
		this.table = table;
	}
	
	
	public ArrayList<DataRow> readFile(int threshold) {
		System.out.println("Reading the file feed... ");
		String filePath = propFeedFilePath+"/"+feedFileName;
		String string;
		
		System.out.println(filePath);
		try {
			
			fileFeed = new FileReader(filePath);
			fileReader = new BufferedReader(fileFeed);
			
			string = fileReader.readLine();
			while ((string = fileReader.readLine()) != null) {
	    		String[] stringLine = (String[])Arrays.stream(string.split("\\t")).toArray(x -> new String[x]);
	    		if(table.size()<=threshold) {
	    			DataRow newRow = new DataRow();
	    			newRow.setName(stringLine[0]);
	    			newRow.setAge(Integer.parseInt(stringLine[1]));
	    			newRow.setGender(stringLine[2]);
	    			table.add(newRow);
	    		}else {
	    			//call the send method from here 
	    			sender.send();
	    		}
	    		sender.send();
	    	}  
		} catch (NullPointerException | IOException e ) {
			e.printStackTrace();
		} finally {
			try {
				fileFeed.close();
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		return null;
	}
	
	
}
