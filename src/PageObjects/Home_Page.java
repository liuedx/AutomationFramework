package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	
		 
	    private static WebElement element = null;
	 
	 public static WebElement lnk_SignIn(WebDriver driver){
	 
	    element = driver.findElement(By.xpath(".//*[@id='yucs-profile']/a/b"));
	 
	    return element;
	 
	    }
	 
	 public static WebElement lnk_LogOut(WebDriver driver){
	 
	    element = driver.findElement(By.id("account_logout"));
	 
	 return element;
	 
	    }

}
