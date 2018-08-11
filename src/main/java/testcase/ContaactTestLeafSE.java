package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class ContaactTestLeafSE extends Annotations{
	//@Test(groups= {"regression"})
	@Test
	public void contact()
	{
	/*startApp("chrome", "http://leaftaps.com/opentaps");
	WebElement eleUserName = locateElement("id", "username");
	type(eleUserName, "DemoSalesManager");
	WebElement elePassword = locateElement("id","password");
	type(elePassword, "crmsfa");*/
	WebElement eleLogin = locateElement("class","decorativeSubmit");
	click(eleLogin);
	WebElement createcontactlink = locateElement("linktext","Create Contact");
	click(createcontactlink);
	WebElement firstname = locateElement("firstNameField");
	type(firstname,"Venkatesh");
	WebElement lastname =locateElement("lastNameField");
	type(lastname,"Raja");
	WebElement firstnamelocal =locateElement("createContactForm_firstNameLocal");
	type(firstnamelocal,"venky");
	WebElement lastnamelocal =locateElement("createContactForm_lastNameLocal");
	type(lastnamelocal,"Raj");
	WebElement saluation =locateElement("createContactForm_personalTitle");
	type(saluation,"MR");
	WebElement Title =locateElement("createContactForm_generalProfTitle");
	type(Title,"MR");
	WebElement Department =locateElement("createContactForm_departmentName");
	type(Department,"CSE");
	WebElement preferredcurrency=locateElement("createContactForm_preferredCurrencyUomId");
	selectDropDownUsingText(preferredcurrency,"ALL - Albanian Lek");
	WebElement Description =locateElement("createContactForm_description");
	type(Description,"Description");
	WebElement importantnote =locateElement("createContactForm_importantNote");
	type(importantnote,"IMPORTANTNOTE");
	WebElement areacode = locateElement("xpath", "//*[contains(text(),'Area Code')]//following::*[@name='primaryPhoneAreaCode']");
	type(areacode,"001");
	WebElement Extension =locateElement("xpath","//*[contains(text(),'Extension')]//following::*[@name='primaryPhoneExtension']");
	type(Extension,"0010");
	WebElement email = locateElement("createContactForm_primaryEmail");
	type(email,"venkateshraja1993@gmail.com");
	WebElement phone =locateElement("createContactForm_primaryPhoneNumber");
	type(phone,"9952491660");
	WebElement person =locateElement("createContactForm_primaryPhoneAskForName");
	type(person,"person");
	WebElement Toname =locateElement("generalToNameField");
	String tonames = getText(Toname);
	WebElement address =locateElement("createContactForm_generalAddress1");
	type(address,"address");
	WebElement city =locateElement("createContactForm_generalCity");
	type(city,"Madurai");
	WebElement zip = locateElement("createContactForm_generalPostalCode");
	type(zip,"625008");
	WebElement zipExtn = locateElement("createContactForm_generalPostalCodeExt");
	type(zipExtn,"025");
	WebElement Attnname =locateElement("createContactForm_generalAttnName");
	type(Attnname,"Attention");
	WebElement address2 =locateElement("createContactForm_generalAddress2");
	type(address2,"address2");
	}

}
