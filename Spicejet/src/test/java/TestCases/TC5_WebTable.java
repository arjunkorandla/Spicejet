package TestCases;

import org.testng.annotations.Test;

import pageObjectsDemosite.Table;

public class TC5_WebTable extends base {
	@Test
	public void webTable() throws InterruptedException
	{
	Table t = new Table(driver);
	
	
	t.getWebTale();

}}
