package pageObjectsDemosite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class intractionsPageObjects {

	
	public WebDriver driver;

    public intractionsPageObjects (WebDriver rdriver) {
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    
    @FindBy(xpath = "//a[contains(text(),'Interactions')]")
    WebElement intractions;
    
    //draganddrop
    @FindBy(xpath = "//a[contains(text(),'Drag and Drop')]")
    WebElement draganddrop;
    
    @FindBy(xpath = "//a[contains(text(),'Static')]")
    WebElement draganddropStatic;
    
  
    
    @FindBy(xpath = "//img[@id='angular']")
    WebElement draganddropStaticangular;
    
    @FindBy(xpath = "//div[@id='droparea']")
    WebElement draganddropStaticdroparea;
    
    @FindBy(xpath = "//img[@id='mongo']")
    WebElement draganddropStaticmango;
    
  //div[@id='droparea']//img[@id='angular']
  //div[@class='col-xs-10 col-xs-offset-2']//img[@id='angular']
    
    @FindBy(xpath = "//a[contains(text(),'Drag and Drop')]")
    WebElement draganddrop2;
    
    @FindBy(xpath = "//ul[contains(@class,'childmenu')]//a[contains(text(),'Dynamic')]")
    WebElement draganddropDynamic;
    
    @FindBy(xpath = "//img[@id='angular']")
    WebElement draganddropDynamicAngular;
    
    @FindBy(xpath = "//div[@id='droparea']")
    WebElement draganddropDynamicdroparea;
    
    //selectable
    
    @FindBy(xpath = "//a[contains(text(),'Selectable')]")
    WebElement selectable;
    
    @FindBy(xpath = "//ul[@class='deaultFunc']//b[contains(text(),'Sakinalium - Readability')]")
    WebElement selectable1;
    
    @FindBy(xpath = "//ul[@class='deaultFunc']//b[contains(text(),'Sakinalium - Method Chaining')]")
    WebElement selectable2;
    
    @FindBy(xpath = "//a[contains(text(),'Serialize')]")
    WebElement selectableSearilize;
    
    @FindBy(xpath = "//ul[@class='SerializeFunc']//b[contains(text(),'Sakinalium - Readability')]")
    WebElement selectableSearilize1;
    
    @FindBy(xpath = "//ul[@class='SerializeFunc']//b[contains(text(),'Sakinalium - Method Chaining')]")
    WebElement selectableSearilize2;
    
    //resizble
    
    @FindBy(xpath = "//a[contains(text(),'Resizable')]")
    WebElement resizable;
    
    @FindBy(xpath = "  //div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']")
    WebElement resizableDrag;
    
    
    public void getinstructions()
    {
    	intractions.click();
    }
    
    public void getDragandDrop()
    {
    	draganddrop.click();
    }
    
    public void getStaticDragandDrop()
    {
    	draganddropStatic.click();
    }
    
    public void getdraganddropStaticangular()
    {
    	Actions act = new Actions(driver);
    	
    	act.dragAndDrop(draganddropStaticangular, draganddropStaticdroparea).click().build().perform();
    	//draganddropStaticangular.click();
    }
    
    public void getdraganddropStaticmango()
    {
    	Actions act = new Actions(driver);
    	act.dragAndDrop(draganddropStaticmango, draganddropStaticdroparea).click().build().perform();
    }
    
    public void getDragandDropDynamic() throws InterruptedException
    {
    	Actions act = new Actions(driver);
    	intractions.click();
    	act.moveToElement(draganddrop2).click().build().perform();
    	Thread.sleep(3000);
    	
    	act.moveToElement(draganddropDynamic).click().build().perform();
    }
    
    public void getdraganddropDynamicAngular()
    {
    	Actions act = new Actions(driver);
    	act.dragAndDrop(draganddropDynamicAngular, draganddropDynamicdroparea).click().build().perform();
    }
    
    public void getdraganddropDynamicAngular2() throws InterruptedException
    {
    	Actions act = new Actions(driver);
    	act.dragAndDrop(draganddropDynamicAngular, draganddropDynamicdroparea).click().release().build().perform();
    	Thread.sleep(3000);
    	act.dragAndDrop(draganddropDynamicAngular, draganddropDynamicdroparea).click().release().build().perform();
    }
    
    public void getSelectableClick()
    {
    	intractions.click();
    	selectable.click();
    	selectable1.click();
    	selectable2.click();
    }
    
    public void getselectableSearilize() throws InterruptedException
    {
    	selectableSearilize.click();
    	Thread.sleep(2000);
    	selectableSearilize1.click();
    	selectableSearilize2.click();
    }
    
    public void getResizable()
    {
    	Actions act = new Actions(driver);
    	act.moveToElement(intractions).build().perform();
    	
    	act.moveToElement(resizable).click().build().perform();
    	act.moveToElement(resizableDrag, 90, 280).click().build().perform();
    	
    }
    
    
    
    
}
