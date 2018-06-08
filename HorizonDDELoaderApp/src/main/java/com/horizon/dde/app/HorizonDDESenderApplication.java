package com.horizon.dde.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.horizon.dde.app.helper.HorizonDDEFeedReadSenderHelper;
import com.horizon.dde.app.sender.HorizonDDESenderService;

@SpringBootApplication
public class HorizonDDESenderApplication  implements CommandLineRunner{
 
	public static void main(String[] args) {
		SpringApplication.run(HorizonDDESenderApplication.class, args);
	}
	
	@Autowired
	HorizonDDESenderService producer;
	
	@Autowired
	HorizonDDEFeedReadSenderHelper fileLoader;
	
	@Value("${message.threshold}")
	private int messageThreshold; 
 
	@Override
	public void run(String... args) throws Exception {
		/*System.out.println("Config : Threshold - " + messageThreshold);
		System.out.println("Initial list contains " + fileLoader.getTable());
		int recordsCount = fileLoader.readTSVFile(messageThreshold);
		System.out.println("Total number of records processed from the file is " + recordsCount +".");*/
		
		fileLoader.readJSONFile(messageThreshold);
	}
}
