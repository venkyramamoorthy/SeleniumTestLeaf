package pageswithcucpomimplementation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.Annotations;
import wdMethods.SeMethods;

public class MyEditLead extends SeMethods {

	public MyEditLead()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//input[@name='firstName'])[3]")
	WebElement elefname;
	
	@FindBy(xpath="//button[contains(text(),'Find Leads')]")
	WebElement findlead;
	
	@FindBy(xpath="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	WebElement firstlead;
	
	@FindBy(xpath="//span[contains(text(),'Phone')]")
	WebElement phoneclick;
	
	@FindBy(name="phoneNumber")
	WebElement phoneNumber;
	
	@And("Enter the EFirstname as (.*)")
	public MyEditLead enterfirstnameedit(String fname)
	{
		type(elefname, fname);
		return this;
	}
	@And("click on findleadbutton")
	public MyEditLead clickfindlead()
	{
		click(findlead);
		return this;
	}
	@And("click on firstlead")
	public ViewLeads clickfirstlead()
	{
		waiting(3000);
		click(firstlead);
		return new ViewLeads();
	}
	@And("click on phone")
	public MyEditLead clickphone()
	{
		click(phoneclick);
		return this;
	}
	@And("Enter phone number as (.*)")
	public MyEditLead typephone(String phone)
	{
		type(phoneNumber, phone);
		return this;
	}
}
