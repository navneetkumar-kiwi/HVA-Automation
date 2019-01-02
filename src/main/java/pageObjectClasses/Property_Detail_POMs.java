package pageObjectClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Property_Detail_POMs 

{
	WebDriver driver;
	
	public Property_Detail_POMs(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/***ELEMENTS***/
	
	@FindBy(xpath= "//div[@class = 'jss284']/h2")
	public WebElement detailprice;
	
	@FindBy(xpath= "//div[@class = 'jss285']/div/h4")
	public List <WebElement> detailsqft;
	
	@FindBy(xpath= "//span[@class = 'jss297']")
	public WebElement detailaddress;
	
	/***ACTIONS***/

}
