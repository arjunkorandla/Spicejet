package pageObjects;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo6 {

public WebDriver driver;
	
	@Test
	public void widgets() throws InterruptedException, AWTException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		widgetsPageObjects wp = new widgetsPageObjects(driver);
		wp.widgets();
		wp.autocomplete("juddybidididii");
		wp.datepicker();
		wp.slider();
		
		
		
	}
		
	
}
