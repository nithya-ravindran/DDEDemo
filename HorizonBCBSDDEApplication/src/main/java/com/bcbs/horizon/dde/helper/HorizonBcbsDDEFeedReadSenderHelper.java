package com.bcbs.horizon.dde.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.bcbs.horizon.dde.model.AbstractDDEModel;
import com.bcbs.horizon.dde.model.HorizonBcbsDDEDemoModel;
import com.bcbs.horizon.dde.sender.HorizonBcbsDDESenderService;


@Component
public class HorizonBcbsDDEFeedReadSenderHelper {
	
	@Value("${file.path}")
	private String propFeedFilePath;
	
	@Value("${file.name}")
	private String feedFileName;
	
	private FileReader fileFeed; 

	private BufferedReader fileReader;
	
	private HorizonBcbsDDESenderService sender;
	
	private ArrayList<AbstractDDEModel> table;
	
	public HorizonBcbsDDEFeedReadSenderHelper()   {
		table = new ArrayList<>();
	}
	
	public ArrayList<AbstractDDEModel> getTable() {
		return table;
	}

	public void setTable(ArrayList<AbstractDDEModel> table) {
		this.table = table;
	}
	
	
	public void readFile(int threshold) {
		System.out.println("Reading the file feed... ");
		String filePath = propFeedFilePath+"/"+feedFileName;
		String strLine;
		
		System.out.println(filePath);
		try {
			
			fileFeed = new FileReader(filePath);
			fileReader = new BufferedReader(fileFeed);
			
			strLine = fileReader.readLine(); // omitting the headers in the data file
			//strLine = fileReader.readLine(); // reading first record of the file
			while (strLine  != null) {
	    		if(table.size()!=threshold) {
	    			strLine = fileReader.readLine();
	    			if(strLine == null) {sender.send(getTable()); continue;}
	    			String[] stringLines =  (String[])Arrays.stream(strLine.split("\\t")).toArray(x -> new String[x]);
	    			AbstractDDEModel newRow = new HorizonBcbsDDEDemoModel();
	    			newRow.setName(stringLines[0]);
	    			newRow.setAge(Integer.parseInt(stringLines[1]));
	    			newRow.setGender(stringLines[2]);
	    			table.add(newRow);
	    		}else {
	    			//call the send method from here 
	    			sender.send(getTable());
	    			setTable(new ArrayList<AbstractDDEModel>() );
	    		}
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
		
	}
	
	
}
