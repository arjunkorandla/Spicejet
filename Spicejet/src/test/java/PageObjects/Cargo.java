package PageObjects;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cargo extends BaseClass{
	
	
	@Test
	public void cargo()
	{
	
	
	
	String windowhandle = driver.getWindowHandle();
	
	driver.findElement(By.xpath("//div[@id='smoothmenu1']//li[@id='cargoheader']")).click();
	
	Set<String> WindowHandles = driver.getWindowHandles();
	
	for(String handle:WindowHandles)
		
	{
		if(!handle.equals(windowhandle))
		{
			driver.switchTo().window(handle);
		}
	}
	driver.findElement(By.xpath("//*[@id=\"_getSingleAwbDetails\"]/div/div[2]/button")).click();
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div/div/div/div/div/div[4]/button")).click();
	driver.findElement(By.partialLinkText("Know more")).click();
	driver.findElement(By.partialLinkText("Business Associates")).click();
	
	WebElement office =driver.findElement(By.partialLinkText("Find cargo offices"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(office).click().build().perform();
	
}
}