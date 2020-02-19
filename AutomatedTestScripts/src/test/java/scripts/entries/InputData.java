package scripts.entries;

import org.testng.annotations.Test;

import scripts.BaseClass;

public class InputData extends BaseClass {
	
	@Test
	public void test() throws InterruptedException{
		driver.findElementById("com.monefy.app.lite:id/income_button").click();
		Thread.sleep(500);
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard1").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard2").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard5").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard0").click();
		driver.findElementById("com.monefy.app.lite:id/relativeLayoutChooseCategory").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[2]/android.widget.LinearLayout").click();
		Thread.sleep(1000);
		driver.findElementById("com.monefy.app.lite:id/expense_button").click();
		Thread.sleep(500);
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard5").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard8").click();
		driver.findElementById("com.monefy.app.lite:id/relativeLayoutChooseCategory").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[7]/android.widget.LinearLayout").click();
		Thread.sleep(500);
		driver.findElementById("com.monefy.app.lite:id/expense_button").click();
		Thread.sleep(500);
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard2").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard0").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard0").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard0").click();
		driver.findElementById("com.monefy.app.lite:id/relativeLayoutChooseCategory").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[10]/android.widget.LinearLayout").click();
	}

}
