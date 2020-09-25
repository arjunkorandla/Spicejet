package TestCases;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjectsDemosite.WYSIWYGPageObjects;

public class TC_007_WYSIWYG extends base {

	@Test
	public void wysiwyg() throws AWTException, InterruptedException
	{
	WYSIWYGPageObjects wy = new WYSIWYGPageObjects(driver);
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	wy.getwysiwuyng();
	
}}
