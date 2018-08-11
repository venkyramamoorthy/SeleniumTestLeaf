package pageswithcucpomimplementation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.SeMethods;

public class MyCreateLead extends SeMethods {

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
	@And("Enter the CCompanyName as (.*)")
	public MyCreateLead entercompanyname(String cname)
	{
		type(elementcname, cname);
		return this;
	}
	@And("Enter the CFname as (.*)")
	public MyCreateLead enterfirstname(String fname)
	{
		type(elementfname, fname);
		return this;
	}
	@And("Enter the CLname as (.*)")
	public MyCreateLead enterlastname(String lname)
	{
		type(elementlname, lname);
		return this;
	}
	@When("click on CSubmitbutton")
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
