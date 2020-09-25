package UtilitiesConfig;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Project1PropertiesConfig {

	Properties prop;
	
	public Project1PropertiesConfig()
	{
		File src = new File("./configure/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
			
		}
		 catch (Exception e) {
	            System.out.println("Exception is " + e.getMessage());
	        }
		
		 
		
	}
	public String getOminiURL() {
        String url = prop.getProperty("baseurl");
        return url;

    }
	
}
