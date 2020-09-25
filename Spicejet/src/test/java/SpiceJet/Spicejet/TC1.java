package SpiceJet.Spicejet;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjects.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1 extends BaseClass{
	
	
	
	@Test
	public void mainapge() throws InterruptedException
	{
	
		
		//driver.findElement(By.xpath("//div//div[@class ='paxinfo']")).click();
		driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_rbtnl_Trip_0']")).isSelected();
		
		driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		WebElement Depature = driver.findElement(By.xpath("//div[@id = 'glsctl00_mainContent_ddl_originStation1_CTNR']//tbody"));
		//Depature.sendKeys("Bangkok (BKK)");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Hyderabad");
		
		
		//Select drpdwn = new Select(Depature);
		
	//	drpdwn.selectByIndex(6);
		
		WebElement arrivel = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Canada");
		driver.findElement(By.xpath("//input[@name = 'ctl00$mainContent$view_date1']")).click();
		//depture
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[6]")).click();
		WebElement nextclick = driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all'][contains(text(),Next)]"));
		//ariveldate
		driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
		WebElement datepick1 = driver.findElement(By.xpath("//div[@class = 'ui-datepicker-group ui-datepicker-group-first']//tr[4]"));
		
		
		WebElement nextclick2 = driver.findElement(By.xpath("//a//span[contains(text(),'Next')]"));
		nextclick2.click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[6]")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		String Adult = driver.findElement(By.xpath("//span[contains(text(),'Aged 12+ years')]")).getText();
		
		System.out.println(Adult);
		//inside adult
		WebElement adult = driver.findElement(By.name("ctl00$mainContent$ddl_Adult"));
		Select drpdwn = new Select(adult);
		drpdwn.selectByIndex(3);
		
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		WebElement child = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(child).build().perform();
		Select drpdwn2 = new Select(child);
		drpdwn.selectByIndex(4);
		
		/*WebElement infant = driver.findElement(By.name("ctl00$mainContent$ddl_Infant"));
		Select drpdwn3 = new Select(infant);
		drpdwn.selectByIndex(3);*/
		
		//currency under To
		
		/*WebElement currency = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		Select drpdwn4 = new Select(currency);
		drpdwn.selectByIndex(2);*/
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		//submit button
		driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_btn_FindFlights']")).click();
		
		driver.findElement(By.id("btnOKToBoardTnC")).click();
		
		//travellerPage
		
		driver.findElement(By.id("ControlGroupSelectView_AvailabilityInputSelectView_FamilyAndFriendsAgreement")).click();
		//currency calcullator
		driver.findElement(By.xpath("//div[@class = 'curency_convert_select']//a")).click();
		driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency")).click();
		WebElement convert = driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency"));
		
		Select obj = new Select(convert);
		obj.selectByIndex(6);
		
		driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency")).click();
		WebElement convertInTo = driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency"));
		
		Select obj2 = new Select(convert);
		obj.selectByIndex(1);
		
		//amount
		driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("2000");
		
		driver.findElement(By.xpath("//input[@name = 'CurrencyConverterCurrencyConverterView$ButtonConvert']")).click();
		String GetCalAmount = driver.findElement(By.xpath("//div[@id = 'divConvertedAmount']")).getText().toString();
		System.out.println(GetCalAmount);
		
		driver.findElement(By.id("ButtonCloseWindow")).click();
	}

}
