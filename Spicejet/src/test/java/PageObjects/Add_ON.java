package PageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_ON extends BaseClass{
	
	@Test
	public void addon() throws InterruptedException
	{
	
	
	WebElement addon = driver.findElement(By.id("highlight-addons"));
	
	Actions act = new Actions(driver);
	act.moveToElement(addon).click().build().perform();
	
	WebElement addon1 = driver.findElement(By.xpath("//div[@class='middle2']//ul[@class='add-ons-tab']//li[5]"));
	
	WebElement addon2 = driver.findElement(By.xpath("//div[@class='middle2']//ul[@class='add-ons-tab']//li[9]"));

	WebElement addon3 = driver.findElement(By.xpath("//div[@class='middle2']//ul[@class='add-ons-tab']//li[6]"));

	
	
	act.moveToElement(addon1).build().perform();
	
	Thread.sleep(3000);
	
	act.moveToElement(addon3).build().perform();
	
	Thread.sleep(3000);
act.moveToElement(addon2).click().build().perform();
	
	Thread.sleep(3000);
	
	
	WebElement TC = driver.findElement(By.linkText("Click here for terms and condition"));
	act.moveToElement(TC).click().build().perform();
	WebElement TCclose = driver.findElement(By.xpath("//div[@id='SpiceAssurancePopup2']//a[@class='popup-close2']"));
	act.moveToElement(TCclose).click().perform();
	
	String title = driver.getTitle();
	Assert.assertEquals(title.contains("Air Tickets Online, International Flights to India, Cheap International Flight Deals | SpiceJet Airlines"), true);
	

}}
