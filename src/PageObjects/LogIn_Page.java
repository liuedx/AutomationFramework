package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class LogIn_Page {
	
	private static WebElement element = null;
	 
    public static WebElement txtbx_UserName(WebDriver driver){
 
         element = driver.findElement(By.id("onlineId1"));
         
         Log.info("Username text box found");
 
         return element;
 
         }
 
     public static WebElement txtbx_Password(WebDriver driver){
 
         element = driver.findElement(By.id("passcode1"));
         
         Log.info("Password tex box found");
 
         return element;
 
         }
 
     public static WebElement btn_LogIn(WebDriver driver){
 
         element = driver.findElement(By.id("hp-sign-in-btn"));
         
         Log.info("Submit button found");
 
         return element;
 
         }
 

}
