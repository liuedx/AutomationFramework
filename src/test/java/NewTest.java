package test.java;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import appModule.SignIn_Action;

public class NewTest {
	public WebDriver driver;
	 
	  @BeforeMethod
	  public void beforeMethod() throws Exception{
		  
		   DOMConfigurator.configure("log4j.xml");
			 
			Log.startTestCase("Selenium_Test_001");

		    ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		    
		    Log.info("Excel sheet opened");

		    driver = new FirefoxDriver();
		    
		    Log.info("New driver instantiated");

		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    Log.info("Implicit wait applied on the driver for 10 seconds");

		    driver.get(Constant.URL);
		    
		    Log.info("Web application launched");
		  
		  
	  }
	  
	  
	  @Test
	  public void f() throws Exception {
		  
		  SignIn_Action.Execute(driver);
		  
		  System.out.println("Login Successfully, now it is the time to Log Off buddy.");
		  
	  }

	  @AfterMethod
	  public void afterMethod() {
		  
		  driver.quit();
		  
		  
	  }
}
