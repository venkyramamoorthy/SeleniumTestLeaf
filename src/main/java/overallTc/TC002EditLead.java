package overallTc;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePages;
import wdMethods.Annotations;

public class TC002EditLead extends Annotations {
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
	
	
	@Test(dataProvider ="data")
	public void editLeads(String fname,String dropvalue) {
		new MyHomePages()
		.clickLead()
		.clickfindlead()
		.enterfirstnameedit(fname)
		.clickfindlead()
		.clickfirstlead()
		.clickeditbutton()
		.selectdrop(dropvalue)
		.submit();
	}
}
