package scripts.entries;

import org.testng.annotations.Test;

import scripts.BaseClass;

public class Calculatorusage extends BaseClass {
	
	@Test
	public void test() throws InterruptedException{
		driver.findElementById("com.monefy.app.lite:id/income_button").click();
		Thread.sleep(500);
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard3").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard6").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboardPlus").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard2").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard4").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboardEquals").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboardMinus").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard3").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard5").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboardEquals").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboardMultiply").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard2").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboardEquals").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboardDivide").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboard5").click();
		driver.findElementById("com.monefy.app.lite:id/buttonKeyboardEquals").click();
	}
}