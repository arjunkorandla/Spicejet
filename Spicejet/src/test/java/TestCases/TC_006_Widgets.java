package TestCases;

import org.testng.annotations.Test;

import pageObjectsDemosite.widgetsPageObjects;

public class TC_006_Widgets extends base {

	@Test
	public void widgets() throws InterruptedException
	{
	widgetsPageObjects wp = new widgetsPageObjects(driver);
	wp.widgets();
	wp.autocomplete("juddybidididii");
	wp.datepicker();
	wp.slider();
	
	
}
}