package Automation_TC;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import appModule.SignIn_Action;

public class Log4j_Logging_TC {
	
	private static WebDriver driver = null;
	 
	public static void main(String[] args) throws Exception {

    //Provide Log4j configuration settings
		
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

    SignIn_Action.Execute(driver);

    System.out.println("Login Successfully, now it is the time to Log Off buddy.");

    driver.quit();
    
    Log.info("Browser closed");

    //This is to send the PASS value to the Excel sheet in the result column.

    ExcelUtils.setCellData("Pass", 1, 3);
    
    Log.endTestCase("Selenium_Test_001");

	}
}
