package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyCreateLead extends Annotations {

	public MyCreateLead()
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
	
	/*@FindBy(className="errorList")
	WebElement elementerrorlist;*/
	
	public MyCreateLead entercompanyname(String cname)
	{
		type(elementcname, cname);
		return this;
	}
	public MyCreateLead enterfirstname(String fname)
	{
		type(elementfname, fname);
		return this;
	}
	public MyCreateLead enterlastname(String lname)
	{
		type(elementlname, lname);
		return this;
	}
	public ViewLeads clicksubmit()
	{
		click(elementsubmit);
		return new ViewLeads();
	}
	/*public MyCreateLead clicksubmit()
	{
		click(elementsubmit);
		return this;
	}
	public MyCreateLead errormessage(String errormessage)
	{
		verifyPartialText(elementerrorlist, errormessage);
		return this;
	}*/
}
