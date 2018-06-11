package com.horizon.dde.app.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.horizon.dde.app.Formatter.BaseFormatter;
import com.horizon.dde.app.annotation.DDEFormat;
import com.horizon.dde.app.model.AbstractDDEDemoModel;
import com.horizon.dde.app.model.AbstractDDEModel;
import com.horizon.dde.app.model.HorizonDDEPersonModel;
import com.horizon.dde.app.model.MDMCommercialModel;
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
	
	@Autowired
	private HorizonDDESenderService sender;
	
	private ArrayList<AbstractDDEDemoModel> table;
	
	public HorizonDDEFeedReadSenderHelper()   {
		table = new ArrayList<>();
	}
	
	public ArrayList<AbstractDDEDemoModel> getTable() {
		return table;
	}

	public void setTable(ArrayList<AbstractDDEDemoModel> table) {
		this.table = table;
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
	
	public int readJSONFile(int threshold) {
		System.out.println("Reading the JSON File");
		System.out.println("Message threshold set to : " +threshold);
		System.out.println("Reading the JSON file feed... ");
		String filePath = propFeedJsonFilePath+"/"+feedJsonFileName;
		String strLine;
		
		//no paramater
		Class noparams[] = {};
			
		//String parameter
		Class[] paramString = new Class[1];	
		paramString[0] = String.class;
			
		//int parameter
		Class[] paramInt = new Class[1];	
		paramInt[0] = Integer.TYPE;
		
		int i = 0;
		System.out.println(filePath);
		try {
			ObjectMapper mapper = new ObjectMapper();
			jsonFile = new File(filePath);
			
			AbstractDDEModel mdmCommercialModelObject = mapper.readValue(jsonFile, MDMCommercialModel.class);
			
			Class<MDMCommercialModel> modelClass = (Class<MDMCommercialModel>) mdmCommercialModelObject.getClass();
			
	        try {

	          

	            for (Field field: modelClass.getDeclaredFields()) {
	                field.setAccessible(true);
	                if (field.isAnnotationPresent(DDEFormat.class)) {
	                    System.out.print("Field Name is : " + field.getName());
	                	System.out.println(" Annotated : " + field.isAnnotationPresent(DDEFormat.class));
	                	String formatterMethod = field.getAnnotation(DDEFormat.class).formatterMethod();
	                	System.out.println("Method Name is : " + formatterMethod);
	                	Class<BaseFormatter> formatterClass = field.getAnnotation(DDEFormat.class).formatterType();
	                	BaseFormatter formatterObject = formatterClass.newInstance();
	                	
	                	//call the formatterMethod method
	            		Method method = formatterClass.getDeclaredMethod(formatterMethod, noparams);
	            		method.invoke(formatterObject, null);
	                	

	                }
	            }
	        }

	        catch (Exception e) {

	           e.printStackTrace();

	        }
			
			//ProviderFormatter providerFormatter = new ProviderFormatter(mdmCommercialModelObject);
			
			/*System.out.println("JSON File has been converted to Object of the given model/entity:");
			System.out.println(mdmCommercialModelObject);
			System.out.println("Provider Type : " + mdmCommercialModelObject.getTYPE());
			System.out.println("BID : " + mdmCommercialModelObject.getBID());
			System.out.println("RWJB : " + mdmCommercialModelObject.getRWJB());*/
			
			
			
			
			/*fileFeed = new FileReader(filePath);
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
	    			setTable(new ArrayList<AbstractDDEModel>() );
	    		}
	    	}  */
			
		} catch (NullPointerException | IOException e ) {
			e.printStackTrace();
		} finally {
			/*try {
				fileFeed.close();
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}*/
		}
		return i;
	}
}
