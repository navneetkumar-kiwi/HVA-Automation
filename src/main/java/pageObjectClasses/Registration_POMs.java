package pageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_POMs 
{
	WebDriver driver;
	
	public Registration_POMs(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/***ELEMENTS***/
	
	@FindBy(xpath= "//img[@alt = 'dealvestor_logo']")
	public WebElement logo;
	
	@FindBy(xpath= "//input[@placeholder = 'First Name']")
	public WebElement firstname;
	
	@FindBy(xpath= "//input[@placeholder = 'Last Name']")
	public WebElement lastname;
	
	@FindBy(xpath= "//input[@placeholder = 'Email']")
	public WebElement email;
	
	@FindBy(id= "email")
	public WebElement email1;
	
	@FindBy(xpath= "//input[@placeholder = 'Password']")
	public WebElement password;
	
	@FindBy(xpath= "//input[@placeholder = 'Confirm Password']")
	public WebElement cpassword;
	
	@FindBy(xpath= "//input[@placeholder = 'Phone']")
	public WebElement phone;
	
	@FindBy(xpath= "//input[@placeholder = 'Investment Location']")
	public WebElement location;
	
	@FindBy(xpath= "//input[@placeholder = 'ZipCode']")
	public WebElement zip;
	
	@FindBy(id= "agreeTermsAndConditions")
	public WebElement check;
	
	@FindBy(xpath="//div[@class = 'sui-checkbox-content']")
	public WebElement check1;
	
	@FindBy(xpath="//label[text()='As an investor, I agree to the Terms and Conditions.']")
	public WebElement checktext;
	
	@FindBy(xpath="//button[text()='BACK TO SIGN IN']")
	public WebElement back;
	
	@FindBy(xpath="//button[text()='REGISTER']")
	public WebElement register;
	
	@FindBy(xpath="//h3[text()='Please verify your account']")
	public WebElement verify;
	
	@FindBy(xpath="//span[text()='In order to access the wholesale app, you must verify your account. An email has been sent to ']")
	public WebElement verify2;
	
	@FindBy(xpath="//span[text()=' with a link to verify your account.']")
	public WebElement verify3;
	
	@FindBy(xpath="//span[text()='If you have not received the email after a few minutes, please check your spam folder or re-send the verification email.']")
	public WebElement verify1;
	
	@FindBy(xpath="//button[text()='BACK TO LOGIN']")
	public WebElement backtologin;
	
	@FindBy(xpath="//button[text()='RE-SEND ACTIVATION EMAIL']")
	public WebElement resend;
	
	@FindBy(xpath= "//span[@class = 'sui-typo css-1l8wknn e1sssgrs0']")
	public WebElement mail;
	
	@FindBy(xpath= "//input[@id='login']")
	public WebElement yopmail;
	
	@FindBy(xpath= "//input[@type='submit']")
	public WebElement yopmail1;
	
	@FindBy(xpath= "//a[contains(text(),'http://wholesale-api-uat')]")
	public WebElement emailverify;
	
	@FindBy(xpath= "//a[contains(text(),'https://uat.dealvestors.com')]")
	public WebElement reset;
	
}
