package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyLeadsPage extends Annotations {

	public MyLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead")
	WebElement elementcreateleadclick;
	
	@FindBy(linkText="Find Leads")
	WebElement elementfindleadclick;
	
	public MyCreateLead clickCreatelead()
	{
		click(elementcreateleadclick);
		return new MyCreateLead();
	}
	public MyEditLead clickfindlead()
	{
		click(elementfindleadclick);
		return new MyEditLead();
	}
	
}
