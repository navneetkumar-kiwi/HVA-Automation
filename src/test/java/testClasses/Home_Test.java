package testClasses;
import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.DriverClass;
import pageObjectClasses.Home_POMs;
public class Home_Test 
{
	public WebDriver driver;
	Home_POMs ob;
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		driver = DriverClass.set();
		ob =  new Home_POMs(driver);
		driver.get("https://uat.dealvestors.com/");Thread.sleep(2000);
	}

	@Test(enabled=false)
	public void a_elements_check() throws InterruptedException
	{
		Assert.assertEquals("DealVestors", driver.getTitle());Thread.sleep(3000);
		boolean result14 = (ob.logo.isDisplayed() && ob.logo.isEnabled());Assert.assertEquals(result14, true );
		boolean result13 = (ob.profileImage.isDisplayed() && ob.profileImage.isEnabled() && ob.profileImage.getSize().getHeight()!=0 && ob.profileImage.getSize().getWidth()!=0);Assert.assertEquals(result13, true );
        Assert.assertEquals("SIGN IN", ob.signIn1.getText());
        boolean result16 = ob.banner.isDisplayed() && ob.banner.getSize().getWidth() !=0 && ob.banner.getSize().getHeight() !=0; Assert.assertEquals(result16, true);
		boolean result12 = ob.PIME.isDisplayed();Assert.assertEquals(result12, true );
		boolean result11 = (ob.searchGlass.isDisplayed() && ob.searchGlass.isEnabled());Assert.assertEquals(result11, true );
		boolean result10 = ob.searchText.isDisplayed();Assert.assertEquals(result10, true );
		boolean result15 = (ob.searchBtn.isDisplayed() && ob.searchBtn.isEnabled());Assert.assertEquals(result15, true );
		Assert.assertEquals(ob.searchBtn.getText(), "SEARCH");
		Assert.assertEquals(ob.searchBtn1.isDisplayed(), true);
		boolean result8 = ob.newList.isDisplayed();Assert.assertEquals(result8, true );
		boolean result0 = (ob.about.isDisplayed() && ob.about.isEnabled());Assert.assertEquals(result0, true );
		boolean result1 = (ob.faq.isDisplayed() && ob.faq.isEnabled());Assert.assertEquals(result1, true );
		boolean result2 = (ob.contact.isDisplayed() && ob.contact.isEnabled());Assert.assertEquals(result2, true );
		boolean result3 = (ob.insta.isDisplayed() && ob.insta.isEnabled());Assert.assertEquals(result3, true );
		boolean result4= (ob.twitter.isDisplayed() && ob.twitter.isEnabled());Assert.assertEquals(result4, true );
		boolean result5 = (ob.fb.isDisplayed() && ob.fb.isEnabled());Assert.assertEquals(result5, true );
		boolean result6 = (ob.f1.isDisplayed() && ob.f1.isEnabled());Assert.assertEquals(result6, true );
		boolean result7 = (ob.f2.isDisplayed() && ob.f2.isEnabled());Assert.assertEquals(result7, true );
	}
	
	@Test(enabled=false)
	public void b_scroll() throws InterruptedException
	{
		try
		{
		    boolean result16 = (ob.scroll.isDisplayed() && ob.scroll.isEnabled());	
			Assert.assertEquals(result16, false);
		}
		catch(Exception e)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,10000)");
			Thread.sleep(3000);
			boolean result16 = (ob.scroll.isDisplayed() && ob.scroll.isEnabled());	
			Assert.assertEquals(result16, true);
			ob.scroll.click();
			Thread.sleep(3000);
			try
			{
				boolean result17 = (ob.scroll.isDisplayed() && ob.scroll.isEnabled());	
				Assert.assertEquals(result17, false);
			}
			catch(Exception e1)
			{
				Assert.assertEquals(false, false);
			}
			Thread.sleep(3000);
		}
	}
	
	@Test(enabled=false)
	public void c_send() throws InterruptedException
	{
		ob.searchText.sendKeys("Delhi");
		Thread.sleep(3000);
		System.out.println(ob.sugg.size());
        if (ob.sugg.size() <=5)
        {
        	Assert.assertEquals(true, true );
        }
        else
        {
        	Assert.assertEquals(false, true);
        }
	}
	
	@Test(enabled = false)
	public void d_send1() throws InterruptedException
	{
		ob.searchText.sendKeys("Delhi");
		Thread.sleep(2000);
		ob.sugg.get(0).click();
		Thread.sleep(2000);
		ob.searchText.getText();
		boolean result9 = (ob.searchBtn2.isDisplayed() && ob.searchBtn2.isEnabled());Assert.assertEquals(result9, true );
		Assert.assertEquals(ob.searchBtn.isDisplayed() && ob.searchBtn.isEnabled(), true);
		ob.searchBtn.click();
		Thread.sleep(2000);
		ob.logo.click();Thread.sleep(2000);
		Assert.assertEquals(ob.PIME.isDisplayed(), true);
	}
	
	@Test(enabled=false)
	public void e_insta() throws InterruptedException
	{
		
		ob.insta.click();
		ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());driver.switchTo().window(tab.get(1));
		String s = driver.getCurrentUrl();Assert.assertEquals("https://www.instagram.com/", s );
	}
		
	@Test(enabled=false)
	public void f_twitter() throws InterruptedException
	{
		ob.twitter.click();
		ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());driver.switchTo().window(tab.get(1));
		String s = driver.getCurrentUrl();Assert.assertEquals("https://twitter.com/HomeVestorsNews", s );
	}
	
	@Test(enabled=false)
	public void g_fb() throws InterruptedException
	{
		ob.fb.click();
		ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());driver.switchTo().window(tab.get(1));
		String s = driver.getCurrentUrl();Assert.assertEquals("https://www.facebook.com/webuyuglyhouses", s );
	}
		
	@Test(enabled=false)
	public void h_about() throws InterruptedException
	{
		ob.about.click();
		ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());driver.switchTo().window(tab.get(1));
		String s = driver.getCurrentUrl();Assert.assertEquals("https://www.homevestors.com/", s );
	}
	
	@Test(enabled=false)
	public void i_faq() throws InterruptedException
	{
		ob.faq.click();
		ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());driver.switchTo().window(tab.get(1));
		String s = driver.getCurrentUrl();Assert.assertEquals("https://www.webuyuglyhouses.com/frequently-asked-questions/", s );
	}
	
	@Test(enabled=false)
	public void j_contact() throws InterruptedException
	{
		ob.contact.click();
		ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());driver.switchTo().window(tab.get(1));
		String s = driver.getCurrentUrl();Assert.assertEquals("https://www.webuyuglyhouses.com/contact-us/", s );
	}
	
	@Test(enabled=true)
	public void k_tile() throws InterruptedException
	{
		Thread.sleep(3000);
		 if (ob.tilegrid.size() ==8 && ob.tilegridprice.size() == 8 && ob.tilegridbd.size() == 8 && ob.tilegridaddress.size() == 8)
	        {
	        	Assert.assertEquals(true, true );
	        }
	        else
	        {
	        	Assert.assertEquals(true, false);
	        }
		}
		
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("Testing Closed.");
		driver.quit();
		System.out.println("Browser Closed");
	}
}