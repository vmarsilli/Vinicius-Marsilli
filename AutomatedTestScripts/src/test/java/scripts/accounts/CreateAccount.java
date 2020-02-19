package scripts.accounts;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import scripts.BaseClass;

public class CreateAccount extends BaseClass {
	
	@Test
	public void test() throws InterruptedException{
		Thread.sleep(500);
		driver.findElementByAccessibilityId("Settings").click();
		Thread.sleep(500);
		driver.findElementById("com.monefy.app.lite:id/accounts_button").click();
		Thread.sleep(500);
		driver.findElementById("com.monefy.app.lite:id/imageButtonAddCategory").click();
		Thread.sleep(800);
		MobileElement el5 = (MobileElement) driver.findElementById("com.monefy.app.lite:id/editTextCategoryName");
		el5.click();
		el5.sendKeys("NewAccount");
		MobileElement el6 = (MobileElement) driver.findElementById("com.monefy.app.lite:id/initialAmount");
		el6.click();
		el6.sendKeys("250");
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[2]").click();
		driver.findElementById("com.monefy.app.lite:id/save").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("Open navigation").click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.Spinner/android.widget.LinearLayout/android.widget.LinearLayout").click();
	}
}