package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class TestSuite1 extends TestBase{
	HomePage calc;
	String LeftNumber= "10";
	String RightNumber = "15";


	@Test
	public void AdditionSuccessfulTC () 
	{

		calc = new HomePage(driver);
		calc.InsertInputLeft(LeftNumber);
		calc.InsertInputRight(RightNumber);
		calc.ClickOnAdditionBtn();
		
		Assert.assertEquals(calc.GetResultFieldValue().getText(),"10.00 + 15.00 = 25.00");

	}

	@Test
	public void SubtractSuccessfulTC () 
	{
		calc = new HomePage(driver);
		calc.InsertInputLeft(LeftNumber);
		calc.InsertInputRight(RightNumber);
		calc.ClickOnSubtractBtn();
		Assert.assertEquals(calc.GetResultFieldValue().getText(),"10.00 - 15.00 = 5.00");

	}

	@Test
	public void MultiplySuccessfulTC () 
	{
		calc = new HomePage(driver);
		calc.InsertInputLeft(LeftNumber);
		calc.InsertInputRight(RightNumber);
		calc.ClickOnMultiplyBtn();
		Assert.assertEquals(calc.GetResultFieldValue().getText(),"10.00 * 15.00 = 150.00");

	}


}
