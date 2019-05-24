import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SimpleQaTest {
	AppiumDriver<MobileElement> driver;
	String LeftFieldValue = "10";
	String RightFieldValue = "5";

	@BeforeSuite
	public void setup() throws MalformedURLException 
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Galaxy S8");
		caps.setCapability("appPackage", "com.vbanthia.androidsampleapp");
		caps.setCapability("appActivity", "com.vbanthia.androidsampleapp.MainActivity");
		caps.setCapability("platformName", "Android");
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
	}

	@Test
	public void AdditionSuccessfulTC() 
	{
		MobileElement LeftField = driver.findElement(By.id("com.vbanthia.androidsampleapp:id/inputFieldLeft"));
		MobileElement RightField = driver.findElement(By.id("com.vbanthia.androidsampleapp:id/inputFieldRight"));
		LeftField.sendKeys(LeftFieldValue);
		RightField.sendKeys(RightFieldValue);
		MobileElement AdditionBtn = driver.findElement(By.id("com.vbanthia.androidsampleapp:id/additionButton"));
		AdditionBtn.click();
		Assert.assertEquals(GetResultFieldValue().getText(), "10.00 + 5.00 = 15.00");

	}

	@Test
	public void SubtractionSuccessfulTC()
	{
		MobileElement LeftField = driver.findElement(By.id("com.vbanthia.androidsampleapp:id/inputFieldLeft"));
		MobileElement RightField = driver.findElement(By.id("com.vbanthia.androidsampleapp:id/inputFieldRight"));
		LeftField.clear();
		RightField.clear();
		LeftField.sendKeys(LeftFieldValue);
		RightField.sendKeys(RightFieldValue);
		MobileElement SubtractionBtn = driver.findElement(By.id("com.vbanthia.androidsampleapp:id/subtractButton"));
		SubtractionBtn.click();
		Assert.assertEquals(GetResultFieldValue().getText(), "10.00 - 5.00 = 5.00");
	}

	@Test
	public void MultiplicationSuccessfulTC()
	{
		MobileElement LeftField = driver.findElement(By.id("com.vbanthia.androidsampleapp:id/inputFieldLeft"));
		MobileElement RightField = driver.findElement(By.id("com.vbanthia.androidsampleapp:id/inputFieldRight"));
		LeftField.clear();
		RightField.clear();
		LeftField.sendKeys(LeftFieldValue);
		RightField.sendKeys(RightFieldValue);
		MobileElement MultiplyBtn = driver.findElement(By.id("com.vbanthia.androidsampleapp:id/multiplicationButton"));
		MultiplyBtn.click();
		Assert.assertEquals(GetResultFieldValue().getText(), "10.00 * 5.00 = 50.00");
	}

	public MobileElement GetResultFieldValue ()
	{
		MobileElement ResultField = driver.findElement(By.id("com.vbanthia.androidsampleapp:id/resultTextView"));
		return ResultField;
	}

	@AfterTest
	public void ResetFields()
	{
		MobileElement RestBtn = driver.findElement(By.id("com.vbanthia.androidsampleapp:id/resetButton"));
		RestBtn.click();
	}



}
