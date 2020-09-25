package pageObjects;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo5 {
	
public WebDriver driver;
	
	@Test
	public void Table() throws InterruptedException, AWTException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		Table t = new Table(driver);
		
		t.getWebTale();
		
		
		
		
		
		
		

}
}