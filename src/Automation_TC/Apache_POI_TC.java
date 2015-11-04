package Automation_TC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModule.SignIn_Action;
import utility.Constant;
import utility.ExcelUtils;

public class Apache_POI_TC {
	
	private static WebDriver driver = null;
	 
	public static void main(String[] args) throws Exception {

    //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method

    ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");

    driver = new FirefoxDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get(Constant.URL);

    SignIn_Action.Execute(driver);

    System.out.println("Login Successfully, now it is the time to Log Off buddy.");

    driver.quit();

    //This is to send the PASS value to the Excel sheet in the result column.

    ExcelUtils.setCellData("Pass", 1, 3);

	}


}