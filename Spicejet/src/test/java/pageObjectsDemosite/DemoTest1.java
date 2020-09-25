package pageObjectsDemosite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest1 {
	public WebDriver driver;
	
	@Test
	public void register()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		FormPageObject form = new FormPageObject(driver);
		form.getfirstname("cuya");
		
		form.getLaststname("christy");
		form.getAddress("333,jshhd,ca,us,25652");
		form.getEmail("kafka@hmail.com");
		form.getPhone("+1987456123");
		form.getRadiomale();
		form.gethobbies();
		
		form.getLanguage(6);
		form.getskills(3);
		form.getcountries(5);
		form.getSelectCountries(6);
		form.getyear(15);
		form.getmonth(7);
		form.getday(15);
		form.getpwd("12345aa");
		form.getConfrmPwd("12345aa");
		form.getClickbth();
	}

}
