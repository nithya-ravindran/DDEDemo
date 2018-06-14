package com.horizon.dde.app.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.horizon.dde.app.model.AbstractDDEDemoModel;
import com.horizon.dde.app.model.HorizonDDEPersonModel;
import com.horizon.dde.app.model.Provider;
import com.horizon.dde.app.model.ProviderModel;
import com.horizon.dde.app.sender.HorizonDDESenderService;


@Component
public class HorizonDDEFeedReadSenderHelper {
	
	@Value("${file.path}")
	private String propFeedFilePath;
	
	@Value("${file.name}")
	private String feedFileName;
	
	@Value("${json.file.path}")
	private String propFeedJsonFilePath;
	
	@Value("${json.file.name}")
	private String feedJsonFileName;
	
	private FileReader fileFeed; 

	private BufferedReader fileReader;
	
	private File jsonFile;
	
	private FileInputStream fileIPS;
	
	private ProviderModel proModel;
	
	@Autowired
	private HorizonDDESenderService sender;
	
	private ArrayList<AbstractDDEDemoModel> table;
	private ArrayList<Provider> jsonData;
	
	public HorizonDDEFeedReadSenderHelper()   {
		table = new ArrayList<>();
		jsonData =new ArrayList<>();
	}
	
	public ArrayList<AbstractDDEDemoModel> getTable() {
		return table;
	}

	public void setTable(ArrayList<AbstractDDEDemoModel> table) {
		this.table = table;
	}
	
	
	
	public ArrayList<Provider> getJsonData() {
		return jsonData;
	}

	public void setJsonData(ArrayList<Provider> jsonData) {
		this.jsonData = jsonData;
	}

	public int readTSVFile(int threshold) {
		System.out.println("Reading the TSV File");
		System.out.println("Message threshold set to : " +threshold);
		System.out.println("Reading the file feed... ");
		String filePath = propFeedFilePath+"/"+feedFileName;
		String strLine;
		int i = 0;
		System.out.println(filePath);
		try {
			
			fileFeed = new FileReader(filePath);
			fileReader = new BufferedReader(fileFeed);
			
			strLine = fileReader.readLine(); // omitting the headers in the data file
			if(strLine == null) {
				System.out.println(i+" record(s) found in the file feed!!!\nPlease point to the appropriate file in the configuration and then restart the application.");
				return 0;
			}
			while (strLine  != null) {
	    		if(table.size()<threshold) {
	    			strLine = fileReader.readLine();
	    			if(strLine == null) {sender.produce(getTable());continue;}
	    			String[] stringLines = (strLine != null) ? (String[])Arrays.stream(strLine.split("\\t")).toArray(x -> new String[x]) : null;
	    			
	    			if(strLine != null) {
	    				i++;
	    				table.add(new HorizonDDEPersonModel((new Integer(i)).toString(), stringLines[0], stringLines[2], Integer.parseInt(stringLines[1])));
	    			}
	    			
	    		}else {
	    			sender.produce(getTable());
	    			setTable(new ArrayList<AbstractDDEDemoModel>() );
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
		return i;
	}
	
	public void readJSONFile(int threshold) {
		System.out.println("Reading the JSON File");
		System.out.println("Message threshold set to : " +threshold);
		System.out.println("Reading the JSON file feed... ");
		String filePath = propFeedJsonFilePath+"/"+feedJsonFileName;
		System.out.println(filePath);
		JsonFactory jsonFactory = null;
		JsonParser parser = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			
			fileIPS = new FileInputStream(filePath);
			
			jsonFactory = new JsonFactory();
			parser = jsonFactory.createParser(fileIPS);
			parser.setCodec(mapper);
			parser.nextToken();
			
				
			//while(parser.hasCurrentToken()) {
			//	Iterator<ProviderModel> jsonIterator = parser.readValuesAs(ProviderModel.class);
				
				try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
				     Iterator<ProviderModel> value = mapper.readValues( jsonFactory.createParser(br), ProviderModel.class);
				     value.forEachRemaining((modelObject)->{
				    	 proModel= modelObject;
				    	 
				     });
				     
				     
				 }
				
				for(Provider proM : proModel.getProviders()) {
					 if(jsonData.size()<threshold) {
							jsonData.add(proM);
			    	}else {
			    		System.out.println("To send : " + getJsonData());
			    			sender.produceJsonMessage(getJsonData());
			    			setJsonData(new ArrayList<Provider>());
			    	}
			    	 sender.produceJsonMessage(getJsonData());
		    			setJsonData(new ArrayList<Provider>());
				}
				
			/*	for(Iterator<ProviderModel> modelObject : jsonToken) {
				
			//	jsonToken.forEachRemaining((modelObject)->{
					if(jsonData.size()<threshold) {
						jsonData.add(modelObject);
		    		}else {
		    			sender.produceJsonMessage(getJsonData());
		    			setJsonData(new ArrayList<ProviderModel>());
		    		}
					System.out.println(modelObject);
				//});
				}*/
		//	}
			
		} catch (NullPointerException | IOException e ) {
			e.printStackTrace();
		} finally {
			try {
				parser.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
