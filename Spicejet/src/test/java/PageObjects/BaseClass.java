
package PageObjects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.commers.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	ReadConfig config = new ReadConfig();
	public String spicejetURL = config.getBaseURL();
	public WebDriver driver;
	
	Logger logger;
	@Parameters("browser")
	@BeforeClass
	public void setup(String Browser)
	{
		if(Browser.equalsIgnoreCase("chrome"))
		{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
		}
		else if (Browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	logger= Logger.getLogger("PageObjects");
	PropertyConfigurator.configure("log4j.properties");
	
	logger.info("LOggers are Setup");
	driver.manage().window().maximize();
	logger.info("Window is maximized");
	driver.manage().timeouts().implicitlyWait(14000, TimeUnit.MILLISECONDS);
	driver.get(spicejetURL);
	logger.info("web  Spice jet site is launched");

	
	

}
	public void captureScreen (WebDriver driver, String tname) throws IOException {
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
