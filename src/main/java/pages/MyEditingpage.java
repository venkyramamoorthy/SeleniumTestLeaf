package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;

public class MyEditingpage extends Annotations {

	public MyEditingpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="updateLeadForm_industryEnumId")
	WebElement dropingvalue;
	
	@FindBy(xpath="(//input[@class='smallSubmit'])[1]")
	WebElement editsubmit;
	
	
	public MyEditingpage selectdrop(String dropvalue)
	{
		selectDropDownUsingText(dropingvalue, dropvalue);
		return this;
	}
	
	public MyEditingpage submit()
	{
		click(editsubmit);
		return this;
	}
	
}
