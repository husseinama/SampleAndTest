package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HomePage extends PageBase{

	public HomePage(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	
	//Create setter for the Mobile elements
	public void InsertInputLeft (String LeftFieldValue)
	{
	MobileElement leftField = driver.findElement(By.id("com.vbanthia.androidsampleapp:id/inputFieldLeft"));
	leftField.clear();
	InsertValue(leftField, LeftFieldValue);
	}
	
	public void InsertInputRight (String RightFieldValue)
	{
	MobileElement RightField = driver.findElement(By.id("com.vbanthia.androidsampleapp:id/inputFieldRight"));
	RightField.clear();
	InsertValue(RightField, RightFieldValue);
	}
	
	//Create functions to click on buttons
	public void ClickOnAdditionBtn ()
	{
	MobileElement AdditionBtn = driver.findElement(By.id("com.vbanthia.androidsampleapp:id/additionButton"));
	AdditionBtn.click();
	}
	
	public void ClickOnSubtractBtn ()
	{
	MobileElement SubtractButton = driver.findElement(By.id("com.vbanthia.androidsampleapp:id/subtractButton"));
	SubtractButton.click();
	}

	public void ClickOnMultiplyBtn ()
	{
	MobileElement MultiplyBtn = driver.findElement(By.id("com.vbanthia.androidsampleapp:id/multiplicationButton"));
	MultiplyBtn.click();
	}

	public void ClickOnRestBtn ()
	{
	MobileElement RestBtn = driver.findElement(By.id("com.vbanthia.androidsampleapp:id/resetButton"));
	RestBtn.click();
	}
	
	//Create Function to get result from results field
	public MobileElement GetResultFieldValue ()
	{
	MobileElement ResultField = driver.findElement(By.id("com.vbanthia.androidsampleapp:id/resultTextView"));
	return ResultField;
	}


	

}
