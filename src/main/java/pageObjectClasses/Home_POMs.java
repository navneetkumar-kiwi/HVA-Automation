package pageObjectClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Home_POMs 
{
	WebDriver driver;

	public Home_POMs(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/***ELEMENTS***/
	
	@FindBy(xpath= "//img[@alt = 'logo']")
	public WebElement logo;
	
	@FindBy(xpath= "//img[@alt = 'profile']")
	public WebElement profileImage;
	
	@FindBy(id= "sign_in_btn")
	public WebElement signIn;
	
	@FindBy(xpath = "//span[contains(text(),'Sign in')]")
	public WebElement signIn1;
	
	@FindBy(id= "sign_out_btn")
	public WebElement signOut;
	
	@FindBy(xpath = "//div[@class = 'jss4 jss27 jss215']")
	public WebElement banner;
	
	@FindBy(xpath= "//h1[contains(text(),'Property Investment Made Easy')]")
	public WebElement PIME;
	
	@FindBy(xpath="//div[@style = 'color: rgb(169, 174, 186); margin: 0px 10px 0px 15px;']")
	public WebElement searchGlass;
	
	@FindBy(xpath="//input[@placeholder = 'Search by City, State or Zip Code']")
	public WebElement searchText;
	
	@FindBy(xpath = "//span[contains(text(),'Search')]")
	public WebElement searchBtn;
	
	@FindBy(xpath="//li[@role = 'option']/span[@class = 'jss245']")
	public List <WebElement> sugg;
	
	@FindBy(xpath = "//button[@tabindex = '-1']")
	public WebElement searchBtn1;
	
	@FindBy(xpath = "//button[@tabindex = '0']")
	public WebElement searchBtn2;
	
	@FindBy(xpath = "//p[contains(text(),'New Listings')]")
	public WebElement newList;
	
	@FindBy(xpath = "//a[@href='/listings/30']")
	public WebElement tile;
	
	@FindBy(xpath = "//div[@class='jss5 jss272 grid-card']")
	public List <WebElement> tilegrid;
	
	@FindBy(xpath = "//h1[@class='jss166 jss171 jss380 jss384']")
	public List <WebElement> tilegridprice;
	
	@FindBy(xpath = "//p[@class='jss166 jss175 jss380 jss385']")
	public List <WebElement> tilegridbd;
	
	@FindBy(xpath = "//span[@class='jss380']")
	public List <WebElement> tilegridaddress;
	
	@FindBy(xpath = "//img[@alt='back-to-top']")
	public WebElement scroll;
	
	@FindBy(xpath = "//p[contains(text(),'ABOUT')]")
	public WebElement about;
	
	@FindBy(xpath = "//p[contains(text(),'FAQ')]")
	public WebElement faq;
	
	@FindBy(xpath = "//p[contains(text(),'CONTACT')]")
	public WebElement contact;
	
	@FindBy(xpath = "//img[@alt='Instagram']")
	public WebElement insta;
	
	@FindBy(xpath = "//img[@alt='Twitter']")
	public WebElement twitter;
	
	@FindBy(xpath = "//img[@alt='Facebook']")
	public WebElement fb;
	
	@FindBy(xpath = "//p[contains(text(),'©2018 HomeVestors® of America, Inc. All Rights Reserved')]")
	public WebElement f1;
	
	@FindBy(xpath = "//p[contains(text(),'*Each franchise office is independently owned and operated.')]")
	public WebElement f2;
	
	
	/***ACTIONS***/

}