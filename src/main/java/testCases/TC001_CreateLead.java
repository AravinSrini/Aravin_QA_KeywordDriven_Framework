package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

import wrappers.LeafTapsWrappers;

public class TC001_CreateLead extends LeafTapsWrappers{
	
	@BeforeClass
	public void setData(){
		browserName = "chrome";
		testCaseName = "Create Lead";
		testDescription = "Create a New Lead";
		category = "smoke";
		authors = "Babu";
		dataSheetName = "TC001";
		
	}
	
	
	
	@Test(dataProvider = "fetchData")
	public void createLead(String uName, String pwd){		
		new LoginPage(driver, test)
		.enterUsername(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA();
		
		
		
		
	}



	//Error message "Please Enter Valid PortIn ICCID" displayed while submit a portinrequest with out PICCID

}












