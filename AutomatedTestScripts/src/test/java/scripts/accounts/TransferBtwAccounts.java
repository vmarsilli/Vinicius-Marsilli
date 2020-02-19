package scripts.accounts;

import org.testng.annotations.Test;

import scripts.BaseClass;

public class TransferBtwAccounts extends BaseClass {
	
	@Test
	public void test() throws InterruptedException{
		Thread.sleep(500);
		driver.findElementByAccessibilityId("Transfer");
		Thread.sleep(500);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.Spinner[2]/android.widget.LinearLayout/android.widget.LinearLayout");
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout");
		driver.findElementById("com.monefy.app.lite:id/amount_text");
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard1");
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard0");
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard0");
		driver.findElementById("com.monefy.app.lite:id/relativeLayoutChooseCategory");
	}
}