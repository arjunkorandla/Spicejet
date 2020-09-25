package pageObjectsDemosite;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo7 {
	public WebDriver driver;
	@Test
	public void wysiwyg() throws AWTException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
		WYSIWYGPageObjects wy = new WYSIWYGPageObjects(driver);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		wy.getwysiwuyng();
		
		
		
	}

}
