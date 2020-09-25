package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class morePageObjects {

	public WebDriver driver;

    public morePageObjects (WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    
    @FindBy(xpath = "//a[contains(text(),'More')]")
    WebElement More;
    
    @FindBy(xpath = "//a[contains(text(),'Charts')]")
    WebElement MoreCharts;
    //dynamicdata
    @FindBy(xpath = "//a[contains(text(),'Dynamic Data')]")
    WebElement MoreDynamicdata;
    
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement MoreDynamicGetdata;
    //filedownload
    @FindBy(xpath = "//a[contains(text(),'File Download')]")
    WebElement MoreFileDownload;
    
    @FindBy(xpath = "//textarea[@id='textbox']")
    WebElement MoreFileDownloadTxt;
    
    @FindBy(xpath = "//button[@id='createTxt']")
    WebElement MoreFileDownloadTxtGenerate;
    
    @FindBy(xpath = "//a[@id='link-to-download']")
    WebElement MoreFileDownloadTxtGenerateDownload;
    
    //fileUpolad
    
    @FindBy(xpath = "//a[contains(text(),'File Upload')]")
    WebElement MoreFileUpload;
    
    @FindBy(xpath = "//input[@id='input-4']")
    WebElement MoreFileUploadBrowse;
    
    //loader
    @FindBy(xpath = "//a[contains(text(),'Loader')]")
    WebElement Moreloader;
    
    @FindBy(xpath = "//button[@id='loader']")
    WebElement MoreloaderRun;
    
    //models
    @FindBy(xpath = "//a[contains(text(),'Modals')]")
    WebElement MoreModels;
    
    @FindBy(xpath = "//div[@class='container']//div[2]//div[1]//div[2]//a[1][contains(text(),'Launch modal') and @xpath = '1']")
    WebElement MoreModelsMultiple;
    
    @FindBy(xpath = "//div[@class='container']//div[2]//div[1]//div[2]//a[1][@href = '#myModal2' and @xpath = '1']")
    WebElement MoreModelsMultiple2;
    
    //alert accept...up
    
    
    public void getMore()
    {
    	Actions act = new Actions(driver);
    	act.moveToElement(More).click().build().perform();
    	
    }
    public void getMorecharts()
    {
    	MoreCharts.click();
    	Assert.assertEquals("Charts demo", "Charts demo");
    }
    
    public void getMoreDynamicdata()
    {
    	Actions act = new Actions(driver);
    	//act.moveToElement(More).build().perform();
    	More.click();
    	act.moveToElement(MoreDynamicdata).click().release().build().perform();
    	
    }
    
    public void getMoreGETdynamicdata() throws InterruptedException
    {
    	Actions act = new Actions(driver);
    	act.moveToElement(More).build().perform();
    	MoreDynamicGetdata.click();
    	Thread.sleep(2000);
    	
    }
    
    public void getMoreFileDownload(String text) throws InterruptedException
    {
    	Actions act = new Actions(driver);
    	act.moveToElement(More).build().perform();
    	act.moveToElement(MoreFileDownload).click().release().build().perform();
    	MoreFileDownloadTxt.sendKeys(text);
    	MoreFileDownloadTxtGenerate.click();
    	Thread.sleep(2000);
    	MoreFileDownloadTxtGenerateDownload.click();
    	
    }
    
    public void getMoreLoader() throws InterruptedException
    {
    	Actions act = new Actions(driver);
    	act.moveToElement(More).build().perform();
    	act.moveToElement(Moreloader).click().build().perform();
    	MoreloaderRun.click();
    	Thread.sleep(20000);
    	
    	Alert alert = driver.switchTo().alert();
    	
    	alert.accept();
    	
    }
    
    public void getMoremodels()
    {
    	Actions act = new Actions(driver);
    	act.moveToElement(More).build().perform();
    	MoreModels.click();
    	MoreModelsMultiple.click();
    	act.moveToElement(MoreModelsMultiple2).click().build().perform();
    	
    	Alert a = driver.switchTo().alert();
    	a.accept();
    	
    }
    
    
    
}
