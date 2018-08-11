package overallTc;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePages;
import wdMethods.Annotations;

public class TC001CreateLead extends Annotations {
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
	public void createLead(String cname,String fname,String lname)//,String errormessage)
	{
		new MyHomePages()
		.clickLead()
		.clickCreatelead()
		.entercompanyname(cname)
		.enterfirstname(fname)
		.enterlastname(lname)
		.clicksubmit()
		.verifyCreatelead(fname);
		//.errormessage(errormessage);
	
		/*new MyHomePages()
		.clickLead()
		.clickCreatelead()
		.entercompanyname(cname)
		.enterfirstname(fname)
		.enterlastname(lname)
		.clicksubmit()
		.verifyCreatelead(fname);*/
	}
}
