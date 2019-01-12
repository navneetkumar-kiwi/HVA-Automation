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
	
	@FindBy(xpath = "//div[@class='jss295']/span")
	public List <WebElement> detaillogo;
	
	@FindBy(xpath = "//button[@aria-label='Close']")
	public WebElement detailclose;
	
	@FindBy(xpath = "//div[@class = 'jss285']/div/h5")
	public List <WebElement> detailbd;
	
	@FindBy(xpath= "//input[@placeholder = 'Name']")
	public WebElement reqinfoname;
	
	@FindBy(xpath= "//input[@placeholder = 'Phone Number']")
	public WebElement reqinfophone;
	
	@FindBy(xpath= "//input[@placeholder = 'Email']")
	public WebElement reqinfoemail;
	
	@FindBy(xpath= "//textarea[@name = 'message']")
	public WebElement reqinfomessage;
		
	@FindBy(xpath= "//span[contains(text(), 'Request Info')]")
	public WebElement reqinfosubmit;
	
	@FindBy(xpath= "//div[@class = 'jss5 jss44']/h5")
	public WebElement similarlabel;
	
	@FindBy(xpath= "//div[@class = 'slick-list']")
	public WebElement images;
	
	@FindBy(xpath= "//div[@class = 'slick-track']/div")
	public List <WebElement> images1;
	
	@FindBy(xpath= "//div[@class = 'jss4']")
	public List <WebElement> similar;
	
	@FindBy(xpath= "//button[@aria-label = 'Close lightbox']")
	public WebElement closelight;
	
	@FindBy(xpath= "//div[@class = 'ril-caption-content ril__captionContent']")
	public WebElement lighttext;
	
	
	
	
	/***ACTIONS***/

}
