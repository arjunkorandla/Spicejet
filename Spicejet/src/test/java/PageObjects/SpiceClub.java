package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class SpiceClub extends BaseClass {
	
	@Test
	public void spiceclub()
	{
		
		driver.findElement(By.xpath("//div[@id='smoothmenu1']//li[@id='SpecialAssistanceToPLink']")).click();
		
		driver.findElement(By.partialLinkText("Earn Points")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Use Points")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Tiers")).click();
		driver.findElement(By.partialLinkText("Gold")).click();
		String gold =driver.findElement(By.xpath("//*[@id='gold']/div[1]/div[2]/h2")).getText();
		
		Assert.assertEquals("The Golden Deal",gold);
		
		
		
		
	}

}
