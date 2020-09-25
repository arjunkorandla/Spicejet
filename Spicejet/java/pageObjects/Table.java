package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Table {
	
	public WebDriver driver;

    public Table (WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    
    @FindBy(xpath = "//a[contains(text(),'WebTable')]")
    
    WebElement WebTable;
    
	//doubleclick
    @FindBy(xpath = "//div//div[4]//div[1]//div[6]//button[@class ='btn btn-xs btn-custom']//i[@class='fa fa-pencil']")
   
    WebElement Tableedit;
    
    @FindBy(xpath = "//div//div[4]//div[1]//div[1]//input[@type= 'text']")
    @CacheLookup
    WebElement editEmail;
    
    @FindBy(xpath = "//div//div[4]//div//div[2]//div[2]//input[@type= 'text']")
    @CacheLookup
    WebElement editfirstname;
    
    @FindBy(xpath = "//div//div[4]//div//div[3]//div[2]//input[@type= 'text']")
    @CacheLookup
    WebElement editgender;
    
    @FindBy(xpath = "//div//div[4]//div//div[5]//div[2]//input[@type= 'text']")
    @CacheLookup
    WebElement editphone;
    
    @FindBy(xpath = "//div//div[4]//div[6]//div[2]//button[contains(text(),'Save')]")
    WebElement savebutton;
    
    
    public void getWebTale() throws InterruptedException
    {
    	WebTable.click();
    	Thread.sleep(2000);
    	Actions act = new Actions(driver);
    	
    	act.moveToElement(Tableedit).doubleClick().build().perform();
    	editEmail.clear();
    	editEmail.sendKeys("kakakkakak@hmail.com");
    	editfirstname.clear();
    	editfirstname.sendKeys("kafka");
    	editphone.clear();
    	editphone.sendKeys("123456789");
    	savebutton.click();
    }
    
    
}
