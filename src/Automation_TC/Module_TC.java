package Automation_TC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Constant;
import appModule.SignIn_Action;

public class Module_TC {
	
	private static WebDriver driver = null;
	 
    public static void main(String[] args) {

       driver = new FirefoxDriver();

       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       driver.get("http://www.bankofamerica.com");

       // Pass the arguments (username and password) to this method

       //SignIn_Action.Execute(driver, Constant.username, Constant.password);

       System.out.println("Login Successfully, now it is the time to Log Off buddy.");

       driver.close();
       driver.quit();

   }
    
}
