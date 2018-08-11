package pageswithcucpomimplementation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

public class MyCreateLeadNegative extends SeMethods {

	public MyCreateLeadNegative()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_companyName")
	WebElement elementcname;
	
	@FindBy(id="createLeadForm_firstName")
	WebElement elementfname;
	
	@FindBy(id="createLeadForm_lastName")
	WebElement elementlname;
	
	@FindBy(name="submitButton")
	WebElement elementsubmit;
	
	public MyCreateLeadNegative entercompanyname(String cname)
	{
		type(elementcname, cname);
		return this;
	}
	public MyCreateLeadNegative enterfirstname(String fname)
	{
		type(elementfname, fname);
		return this;
	}
	public MyCreateLeadNegative enterlastname(String lname)
	{
		type(elementlname, lname);
		return this;
	}
	public ViewLeads clicksubmit()
	{
		click(elementsubmit);
		return new ViewLeads();
	}
}
