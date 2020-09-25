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
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.commers.utilities.ReadConfig;

import UtilitiesConfig.Project1PropertiesConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
	
	ReadConfig config = new ReadConfig();
	public String url = config.getBaseURL2();
	
	
	public WebDriver driver;
	
	@Parameters
	@BeforeClass
	public void url(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get(url);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get(url);
		}
		
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
