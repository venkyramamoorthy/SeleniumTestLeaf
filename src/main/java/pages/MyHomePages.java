package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyHomePages extends Annotations {

	public MyHomePages()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Leads")
	WebElement elementleadclick;
	
	public MyLeadsPage clickLead()
	{
		click(elementleadclick);
		//WebElement lead = locateElement("linktext", prop.getProperty("value"));
		return new MyLeadsPage();
	}
}
