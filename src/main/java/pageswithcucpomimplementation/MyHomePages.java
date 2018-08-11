package pageswithcucpomimplementation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class MyHomePages extends SeMethods {

	public MyHomePages()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Leads")
	WebElement elementleadclick;
	@And("Click Leadsbutton")
	public MyLeadsPage clickLead()
	{
		click(elementleadclick);
		//WebElement lead = locateElement("linktext", prop.getProperty("value"));
		return new MyLeadsPage();
	}
}
