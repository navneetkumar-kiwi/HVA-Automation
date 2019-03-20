package testClasses;

import java.util.Arrays;

import org.apache.commons.io.input.WindowsLineEndingInputStream;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.DriverClass;
import pageObjectClasses.Home_POMs;
import pageObjectClasses.Property_Detail_POMs;
import utlilty.WaitClass;

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
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
	}
	
	@Test(enabled=false)
	public void a_basicdetails() throws InterruptedException
	{
		Thread.sleep(3000);
		String price = ob6.tilegridprice.get(6).getText();
		String address = ob6.tilegridaddress.get(6).getText();
		String bd = ob6.tilegridbd.get(6).getText();
		String[] s1 = bd.split("•");
		String[] s2 = s1[0].split(" SQFT");			
		String[] s3 = s1[1].split(" BD");
        String[] s4 = s1[2].split(" BA");    
        ob6.tilegridprice.get(6).click();WaitClass.waitForWebElement(2000);
        Assert.assertEquals(price, ob5.detailprice.getText());
        Assert.assertEquals(s2[0], ob5.detailsqft.get(2).getText());
        Assert.assertEquals(s3[0], ob5.detailsqft.get(0).getText());        
        Assert.assertEquals(s4[0], ob5.detailsqft.get(1).getText());    
        if (ob5.detailaddress.getText().contains(address))
        {
	      Assert.assertEquals(true, true);
        }
        else
        {
	       Assert.assertEquals(false, true);
        }
        WaitClass.waitForWebElement(2000);
	}
	
	@Test(enabled=false)
	public void b_ElementsCheck() throws InterruptedException
	{
		ob6.tile.click();Thread.sleep(2000);
		Assert.assertEquals(ob5.detaillogo.get(0).isDisplayed() && ob5.detaillogo.get(0).getSize().getWidth() !=0 && ob5.detaillogo.get(0).getSize().getHeight() !=0, true);
        Assert.assertEquals(ob5.detailaddress.isDisplayed(), true);
        Assert.assertEquals(ob5.detailclose.isDisplayed() && ob5.detailclose.getSize().getHeight() !=0 && ob5.detailclose.getSize().getWidth() !=0, true);
        Assert.assertEquals(ob5.detailprice.isDisplayed(), true);
        Assert.assertEquals(ob5.detailbd.get(0).getText(), "Beds");
        Assert.assertEquals(ob5.detailbd.get(1).getText(), "Baths");
        Assert.assertEquals(ob5.detailbd.get(2).getText(), "SqFt");
        Assert.assertEquals(ob5.detailbd.get(3).getText(), "Year Built");
        Assert.assertEquals(ob5.detailsqft.get(0).isDisplayed() && ob5.detailsqft.get(1).isDisplayed() && ob5.detailsqft.get(2).isDisplayed() && ob5.detailsqft.get(3).isDisplayed(), true);
		Assert.assertEquals(ob5.reqinfoname.isDisplayed() && ob5.reqinfophone.isDisplayed() && ob5.reqinfoemail.isDisplayed() && ob5.reqinfomessage.isDisplayed() && ob5.reqinfosubmit.isDisplayed(), true);
        Assert.assertEquals(ob5.reqinfomessage.getText(), "I am interested in speaking with you about the property you have listed.");
		Assert.assertEquals(ob5.reqinfosubmit.getText(), "REQUEST INFO");
		Assert.assertEquals(ob5.similarlabel.getText(), "Similar Properties");
		Thread.sleep(2000);
	}
	
	@Test(enabled=false)
	public void c_imagestext() throws InterruptedException
	{
		Thread.sleep(3000);
		ob6.tile.click();
		Thread.sleep(3000);
		try
		{
			Thread.sleep(2000);
			Assert.assertEquals(ob5.images.isDisplayed() && ob5.images1.size() > 0, true);
			for(int i=0; i<ob5.images1.size(); i++)
			{
				Assert.assertEquals(ob5.images1.get(i).getSize().getHeight()!=0 && ob5.images1.get(i).getSize().getWidth()!=0, true);
				String s = ob5.images1.get(i).getText();
				ob5.images1.get(i).click();
				Assert.assertEquals(ob5.closelight.isDisplayed() && ob5.closelight.getSize().getHeight()!=0 && ob5.closelight.getSize().getWidth()!=0, true);
				Assert.assertEquals(s, ob5.lighttext.getText());
                ob5.closelight.click();
                Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			Assert.assertEquals(false, true);
		}
		ob5.detailclose.click();
        Thread.sleep(2000);
	}
	
	@Test(enabled = false)
	public void d_imageurl() throws InterruptedException
	{
		Thread.sleep(2000);
		ob6.tile.click();
		Thread.sleep(2000);		
		if(ob5.images1.size()>0)
		{
		for(int i = 0; i<ob5.imageurl.size(); i++)
		{
		Thread.sleep(2000);
		String s = ob5.imageurl.get(i).getAttribute("src");
		ob5.imageurl.get(i).click();
		Thread.sleep(2000);
		String s1 = ob5.lightimageurl.getAttribute("src");
		Assert.assertEquals(s, s1);
		ob5.closelight.click();
		Thread.sleep(2000);
		}
		}
		else
		{
			Assert.assertEquals(true, true);
			System.out.println("No Images");
		}
		ob5.detailclose.click();
	}	
	
	@Test(enabled = false)
	public void e_slider() throws InterruptedException
	{
		Thread.sleep(2000);
		ob6.tile.click();
		Thread.sleep(2000);
		int size = ob5.images1.size();
		ob5.images1.get(0).click();
		for(int i=0; i<size-1;i++)
		{
			// array list  - done
			Thread.sleep(2000);
			ob5.nextimage.click();
			Thread.sleep(2000);
		}
		for(int j=0; j<size-1;j++)
		{
			Thread.sleep(2000);
			ob5.previmage.click();
			Thread.sleep(2000);
		}
		ob5.closelight.click();Thread.sleep(2000);
		ob5.detailclose.click();
		Thread.sleep(2000);
	}
	
	@Test(enabled = true)
	public void f_similarfinal() throws InterruptedException
	{
		Thread.sleep(2000);ob6.tile.click();Thread.sleep(3000);
		System.out.println(ob5.similartiles.size());
		Assert.assertEquals(ob5.similartiles.size(), 3);Thread.sleep(2000);
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("Testing Closed.");
		driver.quit();
		System.out.println("Browser Closed");
	}
}
