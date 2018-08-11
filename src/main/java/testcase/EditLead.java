package testcase;


import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class EditLead extends Annotations {
	
	
	@BeforeTest
	public void beforeTest()
	{
		excelname ="EditLead";
		testname ="Edit Lead";
		testdesc ="Edit a lead method";
		author ="Raja";
		category ="Sanity";
		iteration= "Leads";
	}

	
    //@Test(dependsOnMethods= {"testcase.CreateLead.createLead"})
	//@Test(groups= {"sanity"},dependsOnGroups= {"smoke"})
	@Test(dataProvider ="data")
	public void editLeads(String fname,String dropvalue) {
	/*startApp("chrome","http://leaftaps.com/opentaps");
	WebElement eleUserName = locateElement("id", "username");
	type(eleUserName, "DemoSalesManager");
	WebElement elePassword = locateElement("id","password");
	type(elePassword, "crmsfa");
	WebElement eleLogin = locateElement("class","decorativeSubmit");
	click(eleLogin);
	WebElement crmsfa = locateElement("link","CRM/SFA");
    click(crmsfa);*/
    WebElement Leadslink = locateElement("link","Leads");
	click(Leadslink);
	WebElement FindLeads = locateElement("link","Find Leads");
	click(FindLeads);
	WebElement firstname = locateElement("xpath","(//input[@name='firstName'])[3]");
	type(firstname,fname);
	WebElement FindLeadsbutton = locateElement("xpath","//button[contains(text(),'Find Leads')]");
	click(FindLeadsbutton);
	waiting(3000);
	WebElement firstlead = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
	click(firstlead);
	verifyTitle("View Lead | opentaps CRM");
	WebElement editbutton = locateElement("xpath", "//a[contains(text(),'Edit')]");
	click(editbutton);
	WebElement drop = locateElement("id", "updateLeadForm_industryEnumId");
	selectDropDownUsingText(drop,dropvalue);
	WebElement submit = locateElement("xpath", "(//input[@class='smallSubmit'])[1]");
	click(submit);
	}
	/*@DataProvider(name="data")
	public Object[][] data()
	{
		Object obj[][] = new Object[2][1];
		obj[0][0]="gugapriya";
		obj[0][1]="Computer Software";
		
		obj[1][0]="venkat";
		obj[1][1]="Computer Software";
		
	    return obj;
	}	*/
}
