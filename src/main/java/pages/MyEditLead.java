package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyEditLead extends Annotations {

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
	
	
	public MyEditLead enterfirstnameedit(String fname)
	{
		type(elefname, fname);
		return this;
	}
	
	public MyEditLead clickfindlead()
	{
		click(findlead);
		return this;
	}
	public ViewLeads clickfirstlead()
	{
		waiting(3000);
		click(firstlead);
		return new ViewLeads();
	}
	public MyEditLead clickphone()
	{
		click(phoneclick);
		return this;
	}
	public MyEditLead typephone(String phone)
	{
		type(phoneNumber, phone);
		return this;
	}
}
