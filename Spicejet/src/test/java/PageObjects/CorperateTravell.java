package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class CorperateTravell extends BaseClass {
	
	
	
	@Test
	public void corp()
	{
		
		
		
		driver.findElement(By.xpath("//*[@id=\"traveller-home\"]/div[6]/div/div/a[3]/span[1]")).click();
		driver.findElement(By.id("ctl00_mainContent_txtCmpnyName")).sendKeys("ajexinc");
		driver.findElement(By.id("ctl00_mainContent_txtCity")).sendKeys("ararar");
		driver.findElement(By.id("ctl00_mainContent_txtCmpnyEmail")).sendKeys("ararar@gmail.com");
		driver.findElement(By.id("ctl00_mainContent_txtCmpnyPhone")).sendKeys("1234567895");
		driver.findElement(By.id("ctl00_mainContent_txtIndustry")).sendKeys("samsai");
		driver.findElement(By.id("ctl00_mainContent_txtCmpnyAddress")).sendKeys("uefuibwufiuifbib5jshsv");
		driver.findElement(By.id("ctl00_mainContent_txtState")).sendKeys("uraguay");
		driver.findElement(By.id("ctl00_mainContent_txtPinCode")).sendKeys("658974");
		driver.findElement(By.id("ctl00_mainContent_txtMgnrName")).sendKeys("kuyyaa");
		driver.findElement(By.id("ctl00_mainContent_txtMgnrPhone")).sendKeys("1134567895");
		driver.findElement(By.id("ctl00_mainContent_txtMgnrEmail")).sendKeys("ararar@gmail.com");
		driver.findElement(By.id("ctl00_mainContent_txtSectors")).sendKeys("gegegeg");
		driver.findElement(By.id("ctl00_mainContent_txtTravelAgentName1")).sendKeys("kekeke");
		driver.findElement(By.id("ctl00_mainContent_txtTravelAgentCity1")).sendKeys("guvaya");
		driver.findElement(By.id("ctl00_mainContent_txtTravelAgentName2")).sendKeys("kakaka");
		driver.findElement(By.id("ctl00_mainContent_txtTravelAgentCity2")).sendKeys("gayava");
		driver.findElement(By.id("ctl00_mainContent_chkMethodBookingDirect")).click();
		driver.findElement(By.id("ctl00_mainContent_ButtonSubmit")).click();
		
		String title = driver.getTitle();
		Assert.assertEquals("SpiceJet Corporate Benefit Program", title);
	}

}
