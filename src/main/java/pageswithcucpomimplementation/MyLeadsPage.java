package pageswithcucpomimplementation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import wdMethods.Annotations;
import wdMethods.SeMethods;

public class MyLeadsPage extends SeMethods {

	public MyLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead")
	WebElement elementcreateleadclick;
	
	@FindBy(linkText="Find Leads")
	WebElement elementfindleadclick;
	
	@Given("Click Create Leadbutton")
	public MyCreateLead clickCreatelead()
	{
		click(elementcreateleadclick);
		return new MyCreateLead();
	}
	@Given("Click find Leads")
	public MyEditLead clickfindlead()
	{
		click(elementfindleadclick);
		return new MyEditLead();
	}
	
}
