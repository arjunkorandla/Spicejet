package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchToPageobjects {

	public WebDriver driver;

    public SwitchToPageobjects (WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    
    @FindBy (xpath = "//a[contains(text(),'SwitchTo')]")
    	WebElement switchto;
    
    @FindBy (xpath = "//a[contains(text(),'Alerts')]")
  	WebElement alert;
    
    @FindBy (xpath = "//button[@class='btn btn-danger']")
	WebElement alertWithOK;
    
    @FindBy (xpath = "//a[contains(text(),'Alert with OK & Cancel')]")
	WebElement buttonAlertOKCancel;
    
    @FindBy (xpath = "//button[@class='btn btn-primary']")
	WebElement alertWithOKandCancel;
    
    @FindBy (xpath = "//a[contains(text(),'Alert with Textbox')]")
	WebElement buttonWithText;
    
    @FindBy (xpath = "//button[@class='btn btn-info']")
	WebElement alertWithText;
    
    //windows
    @FindBy (xpath = "//a[contains(text(),'Windows')]")
	WebElement switctoWindows;
    
    @FindBy (xpath = "//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")
	WebElement singleWindow;
    
    @FindBy (xpath = "//a[contains(text(),'Open New Seperate Windows')]")
	WebElement buttonsaperatewindow;
    
    @FindBy (xpath = "//button[@class='btn btn-primary']")
	WebElement clicksaperatewindow;
    
    //frame
    
    @FindBy (xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Frames')]")
	WebElement clickframe;
    
    @FindBy (xpath = "//a[contains(text(),'Single Iframe')]")
	WebElement clickbtnSingleFrame;
    
    @FindBy (xpath = "//iframe[@id='singleframe']")
	WebElement clickSingleFrame;
    
    @FindBy (xpath = "//div[@class='col-xs-6 col-xs-offset-5']//input")
	WebElement txtInputIframe;
    
    @FindBy (linkText = "Iframe with in an Iframe")
	WebElement iframewithInIframe;
    
    @FindBy (xpath = "//div[@id='Multiple']//iframe[contains(text(),'<p>Your browser does not support iframes.<')]")
   	WebElement outerFrame;
    
    @FindBy (xpath = "//div[@id='Multiple']//iframe[contains(text(),'<p>Your browser does not support iframes.<')]")
   	WebElement innerframe;
    
    @FindBy (xpath = "//div[@class='col-xs-6 col-xs-offset-5']//input")
   	WebElement txtInput;
    
  
    public void getSwitchTo()
    {
    	Actions act = new Actions(driver);
    	act.moveToElement(switchto).build().perform();
    	driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
    	act.moveToElement(alert).click().build().perform();
    	
    }
    
    public void getSwitchToAlertOK()
    {
    	
    	alertWithOK.click();
    	driver.switchTo().alert().accept();
    	
    }
    
    public void getSwitchToAlertOKandCancel()
    {
    	
    	buttonAlertOKCancel.click();
    	alertWithOKandCancel.click();
    	driver.switchTo().alert().dismiss();
    	
    }
    
    public void getSwitchToAlertText() throws AWTException, InterruptedException
    {
    	
    	buttonWithText.click();
    	alertWithText.click();
    	
    	driver.switchTo().alert().sendKeys("This is text  with the alert box ");
    	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    	Robot r = new Robot();
    	r.keyPress(KeyEvent.VK_ENTER);
    	
    	Thread.sleep(3000);
    }
    
    public void getSwitchToSingleWindow()
    {
    	Actions act = new Actions(driver);
    	act.moveToElement(switchto).build().perform();
    	driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
    	
    	switctoWindows.click();
    	singleWindow.click();
    	String window = driver.getWindowHandle();
    	
    	System.out.println(window);
    	driver.switchTo().window(window);
    }
    
    public void getSwitchToMultipkeWindow()
    {
    	Actions act = new Actions(driver);
    	act.moveToElement(switchto).build().perform();
    	driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
    	
    	String window1 = driver.getWindowHandle();
    	switctoWindows.click();
    	
    	buttonsaperatewindow.click();
    	clicksaperatewindow.click();
    	
    	Set<String> window = driver.getWindowHandles();
    	
    	System.out.println(window);
    	driver.switchTo().window(window1);
    	
    	
    	
    	
    	
    }
    
    public void getSwitchToFrame(String text)
    {
    	Actions act = new Actions(driver);
    	act.moveToElement(switchto).build().perform();
    	driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
    	
    	clickframe.click();
    	
    	driver.switchTo().frame(clickSingleFrame);
    	txtInputIframe.sendKeys(text);
    	txtInputIframe.clear();
    }
    
    public void getSwitchToMultipleFrame(String text)
    {
    	Actions act = new Actions(driver);
    	//act.moveToElement(switchto).build().perform();
    	driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
    	
    	//clickframe.click();
    	iframewithInIframe.click();
    	
    	driver.switchTo().frame(outerFrame);
    	driver.switchTo().defaultContent();
    	driver.switchTo().frame(innerframe);
    	
    	txtInput.sendKeys(text);
    	
    	
    }
    
}
