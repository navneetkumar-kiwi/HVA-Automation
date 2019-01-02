package utlilty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WaitClass {

	public static void waitForElement(WebElement element, WebDriver driver, int time){
		try{
			long currentTime = System.currentTimeMillis();
			long end = currentTime+time;
			while(System.currentTimeMillis() < end){
				try{
					element.isDisplayed();
					break;
				}
				catch(Exception e){}
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - WaitClass, in method - waitForElement :"+e);
		}
	}
	
	public static void waitForWebElement(int time){
		try{
			long currentTime = System.currentTimeMillis();
			long end = currentTime+time;
			while(System.currentTimeMillis() < end){
				try{
					break;
				}
				catch(Exception e){}
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - WaitClass, in method - waitForElement :"+e);
		}
	}
}
