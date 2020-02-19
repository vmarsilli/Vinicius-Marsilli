package settings;

import org.testng.annotations.Test;

import scripts.BaseClass;

public class SetDefaultLanguage extends BaseClass {
	
	@Test
	public void test() throws InterruptedException{
		Thread.sleep(500);
		driver.findElementByAccessibilityId("Settings").click();
		Thread.sleep(800);
		driver.findElementById("com.monefy.app.lite:id/settings_button").click();
		driver.findElementById("com.monefy.app.lite:id/language_selection_button").clear();
		Thread.sleep(500);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.e0/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]");
		driver.findElementById("android:id/button1");
	}
}