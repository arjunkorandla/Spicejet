package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pageObjectsDemosite.SwitchToPageobjects;

public class TC04_SwitchTo extends base {
	
	@Test
	public void switchto() throws AWTException, InterruptedException
	{
	SwitchToPageobjects st = new SwitchToPageobjects(driver);
	
	st.getSwitchTo();
	
	st.getSwitchToAlertOK();
	st.getSwitchToAlertOKandCancel();
	st.getSwitchToAlertText();
	st.getSwitchToSingleWindow();
	st.getSwitchToMultipkeWindow();
	st.getSwitchToFrame("arjunreddy");
	st.getSwitchToMultipleFrame("arjunreddyyyyyyyyyyyyyyyyyyyyyy");

}
}
