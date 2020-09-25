package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormPageObject {
	
	public WebDriver driver;

    public FormPageObject (WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    
    
    @FindBy(xpath = "//input[@placeholder='First Name']")
    @CacheLookup
    WebElement firstName;
    
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    @CacheLookup
    WebElement lastName;
    
    @FindBy(xpath = "//textarea[@ng-model='Adress']")
    WebElement Address;
    
    @FindBy(xpath = "//input[@type = 'email']")
    WebElement email;
    
    @FindBy(xpath = "//input[@ng-model='Phone']")
    WebElement phone;
    
    @FindBy(xpath = "//input[@value = 'Male']")
    WebElement radiomale;
    
    @FindBy(xpath = "//input[@id='checkbox1']")
    WebElement hobbles;
    
    @FindBy(id = "msdd")
    WebElement Language;
    
    @FindBy(id = "Skills")
    WebElement skills;
    
    @FindBy(id = "countries")
    WebElement countries;
    
    @FindBy (xpath = "//div//select[@id ='country']")
    WebElement selectCountries;
    
    @FindBy(id = "yearbox")
    WebElement year;
    
    @FindBy(xpath = "//select[@placeholder='Month']")
    WebElement month;
    
    @FindBy(id = "daybox")
    WebElement day;
    
    
    @FindBy(id = "firstpassword")
    WebElement txtpwd;
    
    @FindBy(id = "secondpassword")
    WebElement txtcnfrmpwd;
    
    @FindBy(id = "submitbtn")
    WebElement clicksubmit;
    
    
    
    public void getfirstname(String fname)
    {
    	
    	firstName.sendKeys(fname);
    }
   
    public void getLaststname(String lstname)
    {
    	lastName.sendKeys(lstname);
    }
    
    public void getAddress(String address )
    {
    	Address.sendKeys(address);
    }
    
    public void getEmail(String Email)
    {
    	email.sendKeys(Email);
    }
    
    public void getPhone(String Phone)
    {
    	phone.sendKeys(Phone);
    }
    
    public void getRadiomale()
    {
    	radiomale.click();
    }
    
    public void gethobbies()
    {
    	hobbles.click();;
    }
    
    public void getLanguage(int inte)
    {
    	Language.click();
    	driver.findElement(By.xpath("//ul[@class = 'ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li[6]"));
    	
    	//Select drpdwn = new Select(Language);
    			
    		//	drpdwn.selectByIndex(inte);
    	
    }
    
    public void getskills(int index)
    {
    	Select drpdwn = new Select(skills);
		
		drpdwn.selectByIndex(index);
    }
    
    public void getcountries(int country)
    {
    	Select drpdwn = new Select(countries);
		
		drpdwn.selectByIndex(country);
    }
    
    public void getSelectCountries(int country1)
    {
    	Select drpdwn = new Select(selectCountries);
		
		drpdwn.selectByIndex(country1);
    }
    
   
    
    public void getyear(int Year)
    {
    	Select drpdwn = new Select(year);
    	drpdwn.selectByIndex(Year);
    	
    }
    
    public void getmonth(int mnth)
    {
    	Select drpdwn = new Select(month);
		
		drpdwn.selectByIndex(mnth);
    }
    
    public void getday(int Day)
    {
    	Select drpdwn = new Select(day);
		
		drpdwn.selectByIndex(Day);
    }
    
    public void getpwd(String pwd)
    {
    	txtpwd.sendKeys(pwd);
    }
    
    public void getConfrmPwd(String pwd2)
    {
    	txtcnfrmpwd.sendKeys(pwd2);
    }
    
    public void getClickbth()
    {
    	clicksubmit.click();
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
