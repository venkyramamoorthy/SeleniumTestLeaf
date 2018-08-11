package pageswithcucpomimplementation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.Annotations;
import wdMethods.SeMethods;

public class ViewLeads extends SeMethods {

	public ViewLeads()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="viewLead_firstName_sp")
	WebElement elementverifyfirstname;
	
	@FindBy(xpath="//a[contains(text(),'Edit')]")
	WebElement eleeditbutton;
	
	@FindBy(linkText="Duplicate Lead")
	WebElement Duplicatebutton;
	
	
	@Then("Verify lead created Successfully as (.*)")
	public ViewLeads verifyCreatelead(String fname)
	{
		verifyExactText(elementverifyfirstname,fname);
		return this;
	}
	@Then("close Browsers")
	public ViewLeads Browserclose()
	{
		closeBrowser();
		return this;
	}
	@And("click on editbutton")
	public MyEditingpage clickeditbutton()
	{
		click(eleeditbutton);
		return new MyEditingpage();
	}
	@And("click on duplicateleadbutton")
	public MyCreateLead clickDuplicateLeadButton()
	{
		click(Duplicatebutton);
		return new MyCreateLead();
	}
}
