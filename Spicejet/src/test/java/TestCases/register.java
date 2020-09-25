package TestCases;

import org.testng.annotations.Test;

import UtilitiesConfig.GeneratingRandomString;
import pageObjectsDemosite.FormPageObject;

public class register extends base {
	
	@Test
	public void registration()
	{
		GeneratingRandomString rand = new GeneratingRandomString();
		
		FormPageObject form = new FormPageObject(driver);
		form.getfirstname(rand.Fname());
		
		form.getLaststname(rand.Lname());
		form.getAddress(rand.Address());
		form.getEmail(rand.Email());
		form.getPhone(rand.Phonenum());
		form.getRadiomale();
		form.gethobbies();
		
		form.getLanguage(6);
		form.getskills(3);
		form.getcountries(5);
		form.getSelectCountries(6);
		form.getyear(15);
		form.getmonth(7);
		form.getday(15);
		form.getpwd(rand.password());
		form.getConfrmPwd(rand.password());
		form.getClickbth();
		
	}
	

}
