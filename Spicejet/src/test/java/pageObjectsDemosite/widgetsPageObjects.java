package pageObjectsDemosite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class widgetsPageObjects {
	
	public WebDriver driver;

    public widgetsPageObjects (WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    
    @FindBy(xpath = "//a[contains(text(),'Widgets')]")
    @CacheLookup
    WebElement widgets;
    
    @FindBy(xpath = "//a[contains(text(),'Accordion')]")
    @CacheLookup
    WebElement widgetsAccordion;
    
    @FindBy(xpath = "//b[contains(text(),'Collapsible Group 1 - Readability')]")
    @CacheLookup
    WebElement clickGroupby;
    
    @FindBy(xpath = "//a[contains(text(),'AutoComplete')]")
    @CacheLookup
    WebElement widgetsAutoComplete;
    
    @FindBy(xpath = "//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget ui-state-active']")
    @CacheLookup
    WebElement widgetstxtfieldauto;
    
    //date
    @FindBy(xpath = "//a[contains(text(),'Datepicker')]")
    @CacheLookup
    WebElement datepicker;
    
    @FindBy(xpath = "//img[@class='imgdp']")
    @CacheLookup
    WebElement disableDatePicker;
    
    @FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-e']")
    @CacheLookup
    WebElement datePickerNextarrow;
    
    @FindBy(xpath = "//a[contains(text(),'20')]")
    @CacheLookup
    WebElement dateselect;
    
    @FindBy(xpath = "//input[@id='datepicker2']")
    WebElement datepicker2;
    
    @FindBy(xpath = "//a[@class='dp1596124800000']")
    WebElement dateselect2;
    
    
    //slider
    
    @FindBy(xpath = "//a[contains(text(),'Slider')]")
    WebElement slider;
    
    @FindBy(xpath = "//a[@class='ui-slider-handle ui-state-default ui-corner-all']")
    WebElement dragslider;
    
    
    
    public void widgets() throws InterruptedException
    {
Actions act = new Actions(driver);
    	
    	act.moveToElement(widgets).build().perform();
    	act.moveToElement(widgetsAccordion).click().release().build().perform();
    	clickGroupby.click();
    	Thread.sleep(2000);
    	clickGroupby.click();
    	
    	
    	
    
    }
    
    public void autocomplete(String text) throws InterruptedException
    {
    	
    	Actions act = new Actions(driver);
    	
    	Thread.sleep(2000);
    	widgets.click();
    	//act.moveToElement(widgets).build().perform();
    	act.moveToElement(widgetsAutoComplete).click().release().build().perform();
    	widgetstxtfieldauto.sendKeys(text);
    	
    }
    
    public void datepicker()
    {
    	
    	Actions act = new Actions(driver);
    	act.moveToElement(widgets).build().perform();
    	act.moveToElement(datepicker).click().release().build().perform();
    	
    	Select s = new Select(disableDatePicker);
    	s.selectByIndex(12);
    	
    }
    public void slider()
    {
    	
    	Actions act = new Actions(driver);
    	act.moveToElement(widgets).build().perform();
    	act.moveToElement(slider).click().release().build().perform();
    	
    	
    	act.moveToElement(dragslider, 0, 250);
    	
    }
    
    

}
