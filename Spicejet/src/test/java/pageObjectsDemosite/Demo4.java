package pageObjectsDemosite;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo4 {
	
public WebDriver driver;
	
	@Test
	public void SwitchTo() throws InterruptedException, AWTException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		SwitchToPageobjects st = new SwitchToPageobjects(driver);
		
		st.getSwitchTo();
		st.getSwitchToAlertOK();
		st.getSwitchToAlertOKandCancel();
		st.getSwitchToAlertText();
		st.getSwitchToSingleWindow();
		st.getSwitchToMultipkeWindow();
		st.getSwitchToFrame("arjunreddy");
		st.getSwitchToMultipleFrame("arjunreddyyyyyyyyyyyyyyyyyyyyyy");
		
		
		
		
		

}}
