package pageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_POMs
{
	WebDriver driver;
	
	public Login_POMs(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/***ELEMENTS***/
	
	@FindBy(xpath= "//h2[text() = 'Sign In']")
	public WebElement signin_text;
	
	@FindBy(xpath= "//button[@class='sui-modal-close-button css-hfy3mu e1sssgrs0']")
	public WebElement cancel;
	
	@FindBy(xpath= "//input[@placeholder = 'Enter Email']")
	public WebElement email;
	
	@FindBy(xpath= "//input[@placeholder = 'Enter Password']")
	public WebElement password;
	
	@FindBy(xpath="//a[text()='Forgot?']")
	public WebElement forgot;
	
	@FindBy(xpath="//button[text() = 'SIGN IN']")
	public WebElement signin_button;
	@FindBy(xpath="//img[@alt='facebook']")
	public WebElement fb;
	
	@FindBy(xpath="//img[@alt='google']")
	public WebElement google;
	
	@FindBy(xpath="//span[text() = 'Not a member yet?']")
	public WebElement NAMY;
	
	@FindBy(xpath="//a[text()='Sign Up as an Investor']")
	public WebElement register;
	
	@FindBy(xpath="//div[text()='Invalid Email or Password']")
	public WebElement invalid;
	
	@FindBy(xpath="//h3[text()='Forgot Password']")
	public WebElement forgotheading;
	
	@FindBy(xpath="//span[contains(text(),'Enter your registered email address')]")
	public WebElement forgottext;
	
	@FindBy(xpath="//input[@placeholder='Your e-mail address']")
	public WebElement forgotemail;
	
	@FindBy(xpath="//button[text()='REQUEST RESET']")
	public WebElement requestbutton;
	
	@FindBy(xpath="//div[text()='is invalid']")
	public WebElement invalid1;
	
	@FindBy(xpath="//h3[text()='Check your email']")
	public WebElement cyem;
	
	@FindBy(xpath="//span[contains(text(),'We')]")
	public WebElement cyem1;
	
	@FindBy(xpath="//span[contains(text(),'If you')]")
	public WebElement cyem2;
	
	@FindBy(xpath="//button[text()='BACK TO LOGIN']")
	public WebElement backtologin;
	
	@FindBy(xpath="//h3[text()='Reset Password']")
	public WebElement reset;
	
	@FindBy(xpath="//input[@placeholder='New Password']")
	public WebElement newpassword;
	
	@FindBy(xpath="//input[@placeholder='Confirm Password']")
	public WebElement confirmpassword;
	
	@FindBy(xpath="//button[text()='RESET PASSWORD']")
	public WebElement resetbutton;
	
	@FindBy(xpath="//div[contains(text(),'doesn')]")
	public WebElement unmatch;
	
}
