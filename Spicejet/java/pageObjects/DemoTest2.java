package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest2 {

public WebDriver driver;
	
	@Test
	public void register() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		intractionsPageObjects intr = new intractionsPageObjects(driver);
		
		intr.getinstructions();
		intr.getDragandDrop();
		intr.getStaticDragandDrop();
		Thread.sleep(2000);
		intr.getdraganddropStaticangular();
		intr.getdraganddropStaticmango();
		
		Thread.sleep(2000);
		intr.getDragandDropDynamic();
		intr.getdraganddropDynamicAngular();
		intr.getdraganddropDynamicAngular2();
		
		intr.getSelectableClick();
		intr.getselectableSearilize();
		
		intr.getResizable();
		
		
}}
