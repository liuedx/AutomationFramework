package Automation_TC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.Home_Page;
import PageObjects.LogIn_Page;

public class POM_TC {
	
	 private static WebDriver driver = null;
	 
	   public static void main(String[] args) {
	 
	     driver = new FirefoxDriver();
	     
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 
	     driver.get("http://www.bankofamerica.com");
	 
	     // Use page Object library now
	 
	     //Home_Page.lnk_SignIn(driver).click();
	 
	     LogIn_Page.txtbx_UserName(driver).sendKeys("liuedx");
	 
	     LogIn_Page.txtbx_Password(driver).sendKeys("work4you@flushing");
	 
	     LogIn_Page.btn_LogIn(driver).click();
	 
	     System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	 
	     //Home_Page.lnk_LogOut(driver).click(); 
	     
	     driver.close();
	     driver.quit();
	 
	     }
	 

}
