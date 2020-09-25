package PageObjects;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GiftCard extends BaseClass{
	
	@Test
	public void gift() throws InterruptedException
	{
		
	
		String parentWinHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id='highlight-gift-card']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
	
		for(String handle:windowHandles)
		{
			if(!handle.equals(parentWinHandle))
			{
				driver.switchTo().window(handle);
		
				
			}
		}
		
		String TitleGift = driver.getTitle().toString();
		System.out.println(TitleGift);
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='contentPages']/div/div[1]/div[1]/div[3]/a[1]")).click();
		driver.findElement(By.xpath("//input[@ng-model='denomination.currentDenomination.value']")).sendKeys("5689");
		driver.findElement(By.xpath("//textarea[@ng-model= 'Input.Message']")).sendKeys("bbsbflifbfvfkfvdfiluvdkfvkdbvkd fkkvkkfbilsbfibbsksk");
		
		WebElement Quality = driver.findElement(By.id("quantity"));
		driver.findElement(By.id("quantity")).click();
		
		Select drp = new Select(Quality);
		drp.selectByIndex(3);
		//later
		driver.findElement(By.id("dateLater")).click();
		//calander lick next
		driver.findElement(By.xpath("//a[@title= 'Next']")).click();
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr[4]/td[4]")).click();
		
		//sending details
		
		driver.findElement(By.xpath("//input[@ng-model='Input.senderName']")).sendKeys("napulka");
		driver.findElement(By.xpath("//input[@ng-model='Input.senderEmail']")).sendKeys("gagagagaga@gmail.com");
		

		driver.findElement(By.xpath("//input[@ng-model='Input.senderAddressline_1']")).sendKeys("boul.canendishbdhdbdhcbdhddhdb");
		driver.findElement(By.xpath("//input[@ng-model='Input.senderPincode']")).sendKeys("265897");

		driver.findElement(By.xpath("//input[@ng-model='Input.senderCity']")).sendKeys("karachi");
		driver.findElement(By.xpath("//input[@ng-model='Input.senderState']")).sendKeys("muskar");
		driver.findElement(By.xpath("//input[@ng-model='Input.senderMobileno']")).sendKeys("9874561230");
		driver.findElement(By.xpath("//*[@id='receiverForm']/div/div[1]/h5/span[1]/input")).click();
		driver.findElement(By.xpath("//input[@ng-model='Input.terms_checked']")).click();
		
		driver.findElement(By.xpath("//input[@value='PAY NOW']")).click();

		
		
		
		
	}
}
