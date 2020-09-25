package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sikulix.devices.local.Keys;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {


public WebDriver driver;
	
	@Test
	public void register() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		morePageObjects m = new morePageObjects(driver);
		
		m.getMore();
		m.getMorecharts();
		m.getMoreDynamicdata();
		m.getMoreGETdynamicdata();
		m.getMoreFileDownload("vbsvvilfvbdfuvodfvodfvndfnvodfvodfuvbfduvbudfuvodfovbdfovbdfubvudfbvudfvuobdfovdfv");
		m.getMoreLoader();
		m.getMoremodels();
		
		
		
}}
