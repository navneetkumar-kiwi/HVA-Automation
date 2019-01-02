package pageObjectClasses;

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
	
	@FindBy(xpath= "//h2[text() = 'Sign In']")
	public WebElement signin_text;
	
	
	/***ACTIONS***/

}
