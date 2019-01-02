package testClasses;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;

import org.apache.commons.collections4.functors.SwitchTransformer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.java.swing.plaf.windows.resources.windows;
import com.sun.org.apache.bcel.internal.generic.SWITCH;

import baseClass.DriverClass;
import pageObjectClasses.Home_POMs;
import pageObjectClasses.Login_POMs;
import pageObjectClasses.Registration_POMs;

public class Registration_Test 
{
	String s1 = "am37@yopmail.com";
	String s2 = "am38@yopmail.com";
	String p1 = "Jaimaa26$";
	public WebDriver driver;
	Home_POMs ob;
	Login_POMs ob1;
	Registration_POMs ob2;
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		driver = DriverClass.set();
		ob =  new Home_POMs(driver);
		ob1 = new Login_POMs(driver);
		ob2 = new Registration_POMs(driver);
		driver.get("https://uat.dealvestors.com/");
	}
	
	@Test(enabled=true)
	public void a_elementscheck() throws InterruptedException
	{
		Thread.sleep(3000);ob.signIn.click();Thread.sleep(3000);
		ob1.register.click();Thread.sleep(3000);
		Assert.assertEquals(ob2.logo.isDisplayed() && ob2.logo.isEnabled() && ob2.logo.getSize().getWidth()!=0 && ob2.logo.getSize().getHeight()!=0, true);
		Assert.assertEquals(ob2.firstname.isDisplayed(), true);
		Assert.assertEquals(ob2.lastname.isDisplayed(), true);
		Assert.assertEquals(ob2.email.isDisplayed(), true);
		Assert.assertEquals(ob2.password.isDisplayed(), true);
		Assert.assertEquals(ob2.cpassword.isDisplayed(), true);
		Assert.assertEquals(ob2.phone.isDisplayed(), true);
		Assert.assertEquals(ob2.location.isDisplayed(), true);
		Assert.assertEquals(ob2.zip.isDisplayed(), true);
		Assert.assertEquals(ob2.check1.isDisplayed(), true);
		Assert.assertEquals(ob2.check.isSelected() && ob2.check.isEnabled(), false);
		Assert.assertEquals(ob2.checktext.isDisplayed(), true);
		Assert.assertEquals(ob2.back.isDisplayed(), true);
    	Assert.assertEquals(ob2.register.isDisplayed(), true);Thread.sleep(3000);
	}
	
	@Test(enabled=true)
	public void b_register() throws InterruptedException
	{
		Thread.sleep(3000);ob.signIn.click();Thread.sleep(2000);
		ob1.register.click();Thread.sleep(2000);
		ob2.logo.click();
		Assert.assertEquals(ob.PIME.isDisplayed(), true);Thread.sleep(2000);
		ob.signIn.click();Thread.sleep(2000);
		ob1.register.click();Thread.sleep(2000);
		ob2.back.click();Thread.sleep(2000);
		Assert.assertEquals(ob1.NAMY.isDisplayed(), true);Thread.sleep(2000);
		ob1.register.click();Thread.sleep(2000);
		ob2.firstname.sendKeys("Navneet");
		ob2.lastname.sendKeys("Kumar");
		ob2.email.sendKeys(s1);
		ob2.password.sendKeys(p1);
		ob2.cpassword.sendKeys(p1);
		ob2.phone.sendKeys("9898789878");
		ob2.location.sendKeys("Noida");
		ob2.zip.sendKeys("12345");
		ob2.check.click();Thread.sleep(2000);
		ob2.register.click();Thread.sleep(3000);
		ob2.logo.click();Thread.sleep(2000);
		Assert.assertEquals(ob.PIME.isDisplayed(), true);Thread.sleep(2000);
		ob.signIn.click();Thread.sleep(2000);
		ob1.register.click();
		ob2.firstname.sendKeys("Navneet");
		ob2.lastname.sendKeys("Kumar");
		ob2.email.sendKeys(s2);
		ob2.password.sendKeys(p1);
		ob2.cpassword.sendKeys(p1);
		ob2.phone.sendKeys("9898789878");
		ob2.location.sendKeys("Noida");
		ob2.zip.sendKeys("12345");
		ob2.check.click();Thread.sleep(3000);
		String s3 = ob2.email1.getAttribute("value");
		ob2.register.click();Thread.sleep(3000);
		Assert.assertEquals(ob2.logo.isDisplayed() && ob2.logo.isEnabled() && ob2.logo.getSize().getWidth()!=0 && ob2.logo.getSize().getHeight()!=0, true);
		Assert.assertEquals(ob2.verify.isDisplayed(), true);
//		Assert.assertEquals(ob2.verify1.isDisplayed(), true);
//		Assert.assertEquals(ob2.verify2.isDisplayed(), true);
		Assert.assertEquals(ob2.verify3.isDisplayed(), true);
		Assert.assertEquals(ob2.backtologin.isDisplayed(), true);
//		Assert.assertEquals(ob2.resend.isDisplayed(), true);
		Thread.sleep(5000);
		Assert.assertEquals(s3, ob2.mail.getText());
		ob2.resend.click();
		ob2.backtologin.click();Thread.sleep(2000);
		Assert.assertEquals(ob1.NAMY.isDisplayed(), true);
		Thread.sleep(2000);
		ob1.email.sendKeys(s1);
		ob1.password.sendKeys(p1);
		ob1.signin_button.click();Thread.sleep(3000);
		Assert.assertEquals(ob1.NAMY.isDisplayed(), true);Thread.sleep(2000);
		ob1.cancel.click();Thread.sleep(2000);
	}
	
	@Test(enabled = true)
	public void c_verify() throws InterruptedException
	{
		    driver.get("http://www.yopmail.com/en/");Thread.sleep(5000);
		    driver.navigate().refresh();Thread.sleep(5000);
			ob2.yopmail.sendKeys(s1);
			ob2.yopmail1.click();
			Thread.sleep(5000);
			driver.switchTo().frame("ifmail");
		    ob2.emailverify.click();
		    Thread.sleep(5000);
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("Testing Closed.");
		driver.quit();
		System.out.println("Browser Closed");
	}

}
