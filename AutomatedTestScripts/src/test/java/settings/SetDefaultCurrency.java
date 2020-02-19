package settings;

import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import scripts.BaseClass;

public class SetDefaultCurrency extends BaseClass {
	
	@SuppressWarnings("rawtypes")
	@Test
	public void test() throws InterruptedException{
		Thread.sleep(500);
		driver.findElementByAccessibilityId("Settings").click();
		Thread.sleep(800);
		driver.findElementById("com.monefy.app.lite:id/settings_button").click();
		driver.findElementById("com.monefy.app.lite:id/currency_selection_button").click();
		TouchAction ta = new TouchAction(driver);
		int i = 4;
		do {
			ta
			.press(new PointOption().withCoordinates(668, 350))
			.moveTo(new PointOption().withCoordinates(668, 1720))
			.release().perform();
			i--;
		}while(i>0);
	
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.e0/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]").click();
		driver.findElementById("android:id/button1").click();
		driver.findElementByAccessibilityId("Close navigation").click();

	}
}