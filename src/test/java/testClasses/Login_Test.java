package testClasses;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.DriverClass;
import pageObjectClasses.Home_POMs;
import pageObjectClasses.Login_POMs;
import pageObjectClasses.Registration_POMs;

public class Login_Test 
{
	public WebDriver driver;
	Home_POMs ob;
	Login_POMs ob1;
	Registration_Test ob3;
	Registration_POMs ob4;
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		driver = DriverClass.set();
		ob =  new Home_POMs(driver);
		ob1 = new Login_POMs(driver);
		ob3 = new Registration_Test();
		ob4 = new Registration_POMs(driver);
		driver.get("https://uat.dealvestors.com/");Thread.sleep(2000);
	}
	
	@Test(enabled=true)
	public void a_elementsCheck() throws InterruptedException
	{
		ob.signIn.click();Thread.sleep(3000);
		Assert.assertEquals(ob1.signin_text.isDisplayed(), true);
		Assert.assertEquals(ob1.cancel.isDisplayed() && ob1.cancel.isEnabled(), true);
		Assert.assertEquals(ob1.email.isDisplayed() && ob1.email.isEnabled(), true);
		Assert.assertEquals(ob1.password.isDisplayed() && ob1.password.isEnabled(), true);
		Assert.assertEquals(ob1.forgot.isDisplayed() && ob1.forgot.isEnabled(), true);
		Assert.assertEquals(ob1.signin_button.isDisplayed(), true);
		Assert.assertEquals(ob1.signin_button.isEnabled(), false);
		Assert.assertEquals(ob1.fb.isDisplayed() && ob1.fb.isEnabled(), true);
		Assert.assertEquals(ob1.google.isDisplayed() && ob1.google.isEnabled(), true);
		Assert.assertEquals(ob1.NAMY.isDisplayed(), true);
		Assert.assertEquals(ob1.register.isDisplayed() && ob1.register.isEnabled(), true);Thread.sleep(3000);
	}
	
	@Test(enabled=true)
	public void b_buttonCheck() throws InterruptedException
	{
		ob.signIn.click();	
		ob1.email.sendKeys(ob3.s1);
		ob1.password.sendKeys(ob3.p1);
		Thread.sleep(2000);
		Assert.assertEquals(ob1.signin_button.isDisplayed() && ob1.signin_button.isEnabled(), true);
		ob1.signin_button.click();Thread.sleep(5000);
        Assert.assertEquals(ob.signOut.getText(), "SIGN OUT");Thread.sleep(3000);
        ob.signOut.click();
        Assert.assertEquals(ob.signIn.isDisplayed() && ob.signIn.isEnabled(), true);
        ob.signIn.click();
        Assert.assertEquals(ob1.NAMY.isDisplayed(), true);Thread.sleep(3000);
        ob1.cancel.click();
        Assert.assertEquals(ob.PIME.isDisplayed(), true);Thread.sleep(2000);
	}
	
	@Test(enabled=true)
	public void c_cancel() throws InterruptedException
	{
		ob.signIn.click();
		Thread.sleep(2000);
		try
		{
		Assert.assertEquals(ob1.NAMY.isDisplayed(), true);
		ob1.cancel.click();
		Thread.sleep(2000);
		Assert.assertEquals(ob1.NAMY.isDisplayed(), false);
		}
		catch(Exception e)
		{
			Assert.assertEquals(false, false);
		}
	}
	
	@Test(enabled=true)
	public void d_invalid() throws InterruptedException
	{
		ob.signIn.click();
		ob1.email.sendKeys("navneet");
		ob1.password.sendKeys("Jai");Thread.sleep(2000);
		ob1.signin_button.click();Thread.sleep(2000);
		Assert.assertEquals(ob1.invalid.isDisplayed(), true);
	}
	
	@Test(enabled=true)
	public void e_forgot() throws InterruptedException
	{
		ob.signIn.click();Thread.sleep(2000);
		ob1.forgot.click();Thread.sleep(2000);
		ob4.logo.click();Thread.sleep(2000);
		Assert.assertEquals(ob.PIME.isDisplayed(), true);
		ob.signIn.click();Thread.sleep(2000);
		ob1.forgot.click();Thread.sleep(2000);
		Assert.assertEquals(ob4.logo.isDisplayed() && ob4.logo.isEnabled() && ob4.logo.getSize().getHeight()!=0 && ob4.logo.getSize().getWidth()!=0, true);Thread.sleep(2000);
		Assert.assertEquals(ob1.backtologin.isDisplayed(), true);
		ob4.backtologin.click();Thread.sleep(2000);
		Assert.assertEquals(ob1.NAMY.isDisplayed(), true);Thread.sleep(2000);
		ob1.forgot.click();Thread.sleep(2000);
		Assert.assertEquals(ob1.forgottext.getText(), "Enter your registered email address and we'll send a link to reset your password.");
		Assert.assertEquals(ob1.forgotemail.isDisplayed() && ob1.forgotemail.isEnabled(), true);
		Assert.assertEquals(ob1.requestbutton.isEnabled() && ob1.requestbutton.isDisplayed(), true);
		ob1.forgotemail.sendKeys("nav");Thread.sleep(2000);
		ob1.requestbutton.click();Thread.sleep(2000);
		Assert.assertEquals(ob1.invalid1.isDisplayed(), true);
		ob1.forgotemail.clear();Thread.sleep(2000);
		ob1.forgotemail.sendKeys(ob3.s1);Thread.sleep(2000);
		ob1.requestbutton.click();Thread.sleep(2000);
		Assert.assertEquals(ob4.logo.isDisplayed() && ob4.logo.isEnabled() && ob4.logo.getSize().getHeight()!=0 && ob4.logo.getSize().getWidth()!=0, true);
		ob4.logo.click();
		Assert.assertEquals(ob.PIME.isDisplayed(), true);
		ob.signIn.click();
		ob1.forgot.click();
		ob1.forgotemail.sendKeys(ob3.s1);
		ob1.requestbutton.click();Thread.sleep(2000);
		Assert.assertEquals(ob1.cyem.isDisplayed(), true);
		Assert.assertEquals(ob1.cyem1.getText(), "We've sent an email to reset your password. Click the link in the email to reset your password.");
		Assert.assertEquals(ob1.cyem2.getText(), "If you don't see the email, check other places it might be, such as your junk, spam, or other folders");
		Assert.assertEquals(ob1.backtologin.isDisplayed() && ob1.backtologin.isEnabled(), true);
		ob1.backtologin.click();Thread.sleep(2000);
		Assert.assertEquals(ob1.NAMY.isDisplayed(), true);Thread.sleep(2000);
		ob1.cancel.click();Thread.sleep(2000);
	}
	
	@Test(enabled=true)
	public void f_reset() throws InterruptedException
	{
		driver.get("http://www.yopmail.com/en/");Thread.sleep(5000);
	    ob4.yopmail.sendKeys(ob3.s1);Thread.sleep(2000);
	    ob4.yopmail1.click();Thread.sleep(2000);
		driver.switchTo().frame("ifmail");
		ob4.reset.click();
        Thread.sleep(3000);
        ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());driver.switchTo().window(tab.get(0));Thread.sleep(5000);
        driver.switchTo().defaultContent();Thread.sleep(5000);
        driver.switchTo().window(tab.get(1));Thread.sleep(5000);
        String url = driver.getCurrentUrl();Thread.sleep(2000);
        ob4.logo.click();Thread.sleep(2000);
        Assert.assertEquals(ob.PIME.isDisplayed(), true);Thread.sleep(2000);
        driver.get(url);Thread.sleep(5000);
        Assert.assertEquals(ob1.reset.isDisplayed(), true);
        Assert.assertEquals(ob1.newpassword.isDisplayed() && ob1.newpassword.isEnabled(), true);
        Assert.assertEquals(ob1.confirmpassword.isDisplayed() && ob1.confirmpassword.isEnabled(), true);
        Assert.assertEquals(ob1.resetbutton.isDisplayed(), true);
        ob1.newpassword.sendKeys("Jaimaa26!");Thread.sleep(2000);
        ob1.confirmpassword.sendKeys("Jaimaa26$");Thread.sleep(2000);
        Assert.assertEquals(ob1.unmatch.getText(), "doesn't match");Thread.sleep(2000);
        ob1.newpassword.clear();Thread.sleep(2000);ob1.newpassword.sendKeys("Jaimaa26!");Thread.sleep(2000);
        ob1.confirmpassword.clear();Thread.sleep(2000);ob1.confirmpassword.sendKeys("Jaimaa26!");Thread.sleep(2000);
        ob1.resetbutton.click();Thread.sleep(2000);
        Assert.assertEquals(ob1.NAMY.isDisplayed(), true);Thread.sleep(2000);
        ob1.email.sendKeys(ob3.s1);Thread.sleep(2000);
        ob1.password.sendKeys(ob3.p1);Thread.sleep(2000);
        ob1.signin_button.click();Thread.sleep(2000);
        Assert.assertEquals(ob1.NAMY.isDisplayed(), true);Thread.sleep(2000);
        ob1.email.clear();ob1.password.clear();Thread.sleep(2000);
        ob1.email.sendKeys(ob3.s1);Thread.sleep(2000);
        ob1.password.sendKeys("Jaimaa26!");Thread.sleep(2000);
        ob1.signin_button.click();Thread.sleep(2000);
        Assert.assertEquals(ob.signOut.isDisplayed() && ob.signOut.isEnabled(), true);Thread.sleep(2000);
        ob.signOut.click();Thread.sleep(2000);
        Assert.assertEquals(ob.signIn.isDisplayed() && ob.signIn.isEnabled(), true);
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
