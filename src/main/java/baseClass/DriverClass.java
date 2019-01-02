package baseClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverClass {
	
  public static WebDriver driver;
  
  public DriverClass() {
	    System.setProperty("webdriver.chrome.driver", "/Users/kiwitech/Desktop/Others/Selenium/chromedriver");
		driver = new ChromeDriver(); 
}
 
  public static WebDriver set(){
	  new DriverClass();
	  return driver;
  }
  
  
}
