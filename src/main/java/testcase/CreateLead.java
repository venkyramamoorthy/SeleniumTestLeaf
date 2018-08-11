package testcase;


import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class CreateLead extends Annotations{
	//@Test(dataProvider ="data",invocationCount=2,timeOut=120000)
	//@Test(dataProvider ="data",groups= {"smoke"})
	@BeforeTest
	public void beforeTest()
	{
		excelname ="CreateLead";
		testname ="create Lead";
		testdesc ="Create a new lead method";
		author ="venky";
		category ="smoke";
		iteration= "Leads";
	}
	
	
	@Test(dataProvider ="data")
	public void createLead(String cname,String fname,String lname)
	{
		/*startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");*/
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement link = locateElement("linktext","CRM/SFA");
		click(link);
		WebElement lead = locateElement("linktext","Create Lead");
		click(lead);
		WebElement companyName = locateElement("id","createLeadForm_companyName");
		type(companyName, cname);
		WebElement firstName = locateElement("id","createLeadForm_firstName");
		type(firstName, fname);
		WebElement lastname = locateElement("id", "createLeadForm_lastName");
		type(lastname, lname);
		WebElement industrydrop = locateElement("name", "industryEnumId");
		selectDropDownUsingvalue(industrydrop, "IND_HARDWARE");	
		WebElement submit = locateElement("class", "smallSubmit");
		click(submit);
	}
	
	/*@DataProvider(name="data")
	public Object[][] data()
	{
		Object obj[][] = new Object[1][3];
		obj[0][0]="TCS";
		obj[0][1]="Venky";
		obj[0][2]="Raja";
		
		obj[1][0]="TCS";
		obj[1][1]="Venky";
		obj[1][2]="Raja";
		
		return obj;
	}*/
	/*@DataProvider(name="data")
	public Object[][] data() throws IOException
	{
		ReadExcelAdvance excelcall = new ReadExcelAdvance();
		Object[][] outputvalue = excelcall.excelread("CreateLead");
		return outputvalue;
	}*/
}
