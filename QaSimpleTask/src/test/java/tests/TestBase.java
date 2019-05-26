package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestBase {
	AppiumDriver<MobileElement> driver;

	@BeforeSuite
	public void sessionIntializing () throws MalformedURLException
	{
		//Set desired capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy S8");
		cap.setCapability("appPackage", "com.vbanthia.androidsampleapp");
		cap.setCapability("appActivity", "com.vbanthia.androidsampleapp.MainActivity");
		cap.setCapability("platformName", "Android");
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);


		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
}
