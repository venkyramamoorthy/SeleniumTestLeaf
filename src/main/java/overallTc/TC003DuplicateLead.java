package overallTc;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePages;
import wdMethods.Annotations;

public class TC003DuplicateLead extends Annotations {
	@BeforeTest
	public void beforeTest()
	{
		excelname ="DuplicateLead";
		testname ="Duplicate Lead";
		testdesc ="Duplicate a lead method";
		author ="Venkatesh";
		category ="Regression";
		iteration= "Leads";
	}
	
	
	@Test(dataProvider ="data")
	public void editLeads(String phone) {
		new MyHomePages()
		.clickLead()
		.clickfindlead()
		.clickphone()
		.typephone(phone)
		.clickfindlead()
		.clickfirstlead()
		.clickDuplicateLeadButton()
		.clicksubmit();
	}
}
