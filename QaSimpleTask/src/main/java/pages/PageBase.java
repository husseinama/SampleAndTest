package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PageBase {
	AppiumDriver<MobileElement> driver;

	//Create constructor
	public PageBase(AppiumDriver<MobileElement> driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Create insert value function to insert values in fields
	public void InsertValue (MobileElement TxtField,String Value)
	{
		TxtField.sendKeys(Value);
	}

}
