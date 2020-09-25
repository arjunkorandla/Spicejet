package TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import UtilitiesConfig.Project1PropertiesConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
	Project1PropertiesConfig project1Config = new Project1PropertiesConfig();
	
	public String url = project1Config.getOminiURL();
	
	
	public WebDriver driver;
	@BeforeClass
	public void url()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get(url);
	}

	
	 public void captureScreen(WebDriver driver, String tname) throws IOException {
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
	        FileUtils.copyFile(source, target);
	        System.out.println("Screenshot taken");
	    }
	 
	 
	
	    
	    @AfterClass
	    public void closeBrowser()
	    {
	    	driver.close();
	    }
}
