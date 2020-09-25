package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import oracle.net.aso.c;

public class WYSIWYGPageObjects {

	public WebDriver driver;

    public WYSIWYGPageObjects (WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    
    
    @FindBy(xpath = "//a[contains(text(),'WYSIWYG')]")
    WebElement WYSIWYG;
    
    @FindBy(xpath = "//a[contains(text(),'TinyMCE')]")
    WebElement WYSIWYGTinyMCE;
  
    @FindBy(xpath = "//span[contains(text(),'File')]")
    WebElement WYSIWYGTinyMCEFile;
    
    @FindBy(xpath = "//span[contains(text(),'New document')]")
    WebElement WYSIWYGTinyMCENewDocumnet;
    
    @FindBy(xpath = "//span[@class='mce-txt'][contains(text(),'Insert')]")
    WebElement WYSIWYGTinyMCEInsert;
  
    @FindBy(xpath = "//span[@class='mce-text'][contains(text(),'Insert/edit video')]")
    WebElement WYSIWYGTinyMCEInsertImage;
    
    //format
    @FindBy(xpath = "//button[@type='button' and @role = 'presentation']//span[contains(text(),'Format')]")
    WebElement WYSIWYGTinyMCEFormet;
    
    @FindBy(xpath = "//div[@role = 'menuitem']//span[contains(text(),'Bold')]")
    WebElement WYSIWYGTinyMCEFormetBold;
    
    //formats
    @FindBy(xpath = "//div[@role = 'menuitem']//span[contains(text(),'Formats')]")
    WebElement WYSIWYGTinyMCEFormetFormats;
    
    //headings
    
    @FindBy(xpath = "//div[@role = 'menuitem']//span[contains(text(),'Headings')]")
    WebElement WYSIWYGTinyMCEFormetFormatsHeading;
    
    @FindBy(xpath = "//div[@role = 'menuitem']//span[contains(text(),'Heading 2')]")
    WebElement WYSIWYGTinyMCEFormetFormatsHeadingH2;
    
    @FindBy(xpath = "//div[@role = 'menuitem']//span[contains(text(),'Inline')]")
    WebElement WYSIWYGTinyMCEFormetFormatsInline;
    @FindBy(xpath = "//div[@role = 'menuitem']//span[contains(text(),'Strikethrough')]")
    WebElement WYSIWYGTinyMCEFormetFormatsInlineStrike;
    
    @FindBy(xpath = "//*[@id=\'mce_0_ifr\']")
    WebElement WYSIWYGTinyTxtField;

    
    public void getwysiwuyng() throws AWTException, InterruptedException
    {
    	Actions a = new Actions(driver);
    	a.moveToElement(WYSIWYG).build().perform();
    	a.moveToElement(WYSIWYGTinyMCE).click().release().build().perform();
    	//a.moveToElement(WYSIWYGTinyMCEFile).click().moveToElement(WYSIWYGTinyMCENewDocumnet).click().build().perform();
    	
    	WYSIWYGTinyMCEFile.click();
    	Thread.sleep(2000);
    	a.moveToElement(WYSIWYGTinyMCENewDocumnet).click().release().build().perform();
    
    	WYSIWYGTinyMCEInsert.click();
    	WYSIWYGTinyMCEInsertImage.click();
    	Robot r = new Robot();
    	r.keyPress(KeyEvent.VK_ENTER);
    	WYSIWYGTinyMCEFormet.click();
    	WYSIWYGTinyMCEFormetBold.click();
    	WYSIWYGTinyMCEFormet.click();
    	WYSIWYGTinyMCEFormetFormats.click();
    	
    	WYSIWYGTinyMCEFormetFormatsHeading.click();
    	WYSIWYGTinyMCEFormetFormatsHeadingH2.click();
    	
    	WYSIWYGTinyMCEFormet.click();
    	WYSIWYGTinyMCEFormetFormats.click();
    	WYSIWYGTinyMCEFormetFormatsInline.click();
    	WYSIWYGTinyMCEFormetFormatsInlineStrike.click();
    	
    	WYSIWYGTinyTxtField.sendKeys("fsffgbkjdfjgbkjdbgjjjjjjjjjjjjjjjkkkkkkkkkkkffffffffffffllllldhrnffnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnbh");

    }
    
    
  
    
}
