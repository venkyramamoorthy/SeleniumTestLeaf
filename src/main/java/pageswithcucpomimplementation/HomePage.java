package pageswithcucpomimplementation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.SeMethods;

public class HomePage extends SeMethods {

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="CRM/SFA")
	WebElement crmsfalink;
	
	@When("click CRMSFA link")
	public MyHomePages crmsfalink()
	{
		click(crmsfalink);
		//driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePages();
	}
}
