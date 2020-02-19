package scripts;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class BaseClass {

	public AppiumDriver<MobileElement> driver;

	@Test
	public void test() throws InterruptedException{
	}

	@BeforeTest
	public void beforeTest() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		caps.setCapability("appPackage", "com.monefy.app.lite");
		caps.setCapability("appActivity", "com.monefy.activities.main.MainActivity_");

		driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
