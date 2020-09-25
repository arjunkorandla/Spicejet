package TestCases;

import org.testng.annotations.Test;

import pageObjects.morePageObjects;

public class TC_more03 extends base {

	@Test
	public void more() throws InterruptedException
	
	{
		morePageObjects m = new morePageObjects(driver);
		
		m.getMore();
		m.getMorecharts();
		m.getMoreDynamicdata();
		m.getMoreGETdynamicdata();
		m.getMoreFileDownload("vbsvvilfvbdfuvodfvodfvndfnvodfvodfuvbfduvbudfuvodfovbdfovbdfubvudfbvudfvuobdfovdfv");
		m.getMoreLoader();
		m.getMoremodels();
		
	}
	
}
