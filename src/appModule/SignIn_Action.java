package appModule;

import org.openqa.selenium.WebDriver;

import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import PageObjects.LogIn_Page;

public class SignIn_Action {
	
	
	//now this method does not need any arguments
	
	public static void Execute(WebDriver driver) throws Exception{
		
		//This is to get the value from Excel sheet, passing parameters (Row num; col num) to getCellData method
		
		String username1 = ExcelUtils.getCellData(1, 1);
		
		Log.info("Username picked from Excel is " + username1);
		
		String password1 = ExcelUtils.getCellData(1,  2);
		
		Log.info("Password picked from Excel is " + password1);
		
		LogIn_Page.txtbx_UserName(driver).sendKeys(username1);
		
		Log.info("Username entered in the username text box");
		
		//enter sPassword variable in place of hardcoded value
	    LogIn_Page.txtbx_Password(driver).sendKeys(password1);
	    
	    Log.info("Password entered in the password text box");
	    
	    LogIn_Page.btn_LogIn(driver).click();
	    
	    Log.info("Click action performed on Submit button");
	}

}
