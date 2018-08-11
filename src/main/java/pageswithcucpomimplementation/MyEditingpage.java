package pageswithcucpomimplementation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.Annotations;
import wdMethods.SeMethods;

public class MyEditingpage extends SeMethods {

	public MyEditingpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="updateLeadForm_industryEnumId")
	WebElement dropingvalue;
	
	@FindBy(xpath="(//input[@class='smallSubmit'])[1]")
	WebElement editsubmit;
	
	@And("click on dropdownvalues as (.*)")
	public MyEditingpage selectdrop(String dropvalue)
	{
		selectDropDownUsingText(dropingvalue, dropvalue);
		return this;
	}
	@When("click on Submit")
	public ViewLeads submit()
	{
		click(editsubmit);
		return new ViewLeads();
	}
}
