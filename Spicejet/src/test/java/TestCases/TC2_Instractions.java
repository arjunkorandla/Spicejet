package TestCases;

import org.testng.annotations.Test;

import pageObjectsDemosite.intractionsPageObjects;

public class TC2_Instractions extends base {
	
	@Test
	public void instractions() throws InterruptedException
	{
		intractionsPageObjects intr = new intractionsPageObjects(driver);
		
		intr.getinstructions();
		intr.getDragandDrop();
		intr.getStaticDragandDrop();
		Thread.sleep(2000);
		intr.getdraganddropStaticangular();
		intr.getdraganddropStaticmango();
		
		Thread.sleep(2000);
		intr.getDragandDropDynamic();
		intr.getdraganddropDynamicAngular();
		intr.getdraganddropDynamicAngular2();
		
		intr.getSelectableClick();
		intr.getselectableSearilize();
		
		intr.getResizable();
		
	}

}
