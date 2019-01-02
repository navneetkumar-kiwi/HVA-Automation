package testClasses;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.DriverClass;
import pageObjectClasses.Home_POMs;
import pageObjectClasses.Property_Detail_POMs;

public class Property_Detail_Test 

{
	public WebDriver driver;
	Property_Detail_POMs ob5;
	Home_POMs ob6;
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		driver=DriverClass.set();
		ob5 = new Property_Detail_POMs(driver);
		ob6 = new Home_POMs(driver);
		driver.get("https://uat.dealvestors.com/");Thread.sleep(2000);
	}
	
	@Test(enabled=true)
	public void a_ElementsCheck() throws InterruptedException
	{
		Thread.sleep(3000);
		String price = ob6.tilegridprice.get(4).getText();
		System.out.println(price);
		String address = ob6.tilegridaddress.get(4).getText();
		System.out.println(address);
		String bd = ob6.tilegridbd.get(4).getText();
		System.out.println(bd);
		
		String[] s1 = bd.split("•");
		System.out.println(Arrays.toString(s1));
		System.out.println(s1[0]);
		String[] s2 = s1[0].split("SQFT");
		System.out.println(s2[0]);
			
	    System.out.println(s1[1]);
		String[] s3 = s2[0].split("BD");
        System.out.println(s3[0]);
		
		System.out.println(s1[2]);
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("Testing Closed.");
		driver.quit();
		System.out.println("Browser Closed");
	}
}
