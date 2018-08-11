package testcase1;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class MergeLead extends Annotations {
	@Test(groups= {"regression"})
	public void merge() throws InterruptedException
	{
		/*startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");*/
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement link = locateElement("linktext", "CRM/SFA");
		click(link);
		WebElement Leads = locateElement("linktext", "Leads");
		click(Leads);
		WebElement Merge = locateElement("linktext", "Merge Leads");
		click(Merge);
		WebElement img = locateElement("xpath", "//*[@id='partyIdFrom']//following::*[@alt='Lookup']");
		click(img);
		switchToWindow(1);
		WebElement type = locateElement("xpath", "//*[@id='lookupLeads']//*[contains(text(),'Lead ID:')]//following::*[@type='text' and @name='id']");
		type(type, "10117");
		WebElement clickvalue = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
		click(clickvalue);
		waiting(2000);
		WebElement res = locateElement("xpath", "//*[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '][1]/div/a");
		waiting(2000);
		clickWithoutSnap(res);
		waiting(2000);
		switchToWindow(0);
		WebElement img1 = locateElement("xpath", "//*[@id='partyIdFrom']//following::*[@alt='Lookup']//following::*[@alt='Lookup']");
		click(img1);
		switchToWindow(1);
		WebElement type1 = locateElement("xpath", "//*[@id='lookupLeads']//*[contains(text(),'Lead ID:')]//following::*[@type='text' and @name='id']");
		type(type1, "10125");
		WebElement clickvalue1 = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
		click(clickvalue1);
		waiting(2000);
		WebElement res1 = locateElement("xpath", "//*[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '][1]/div/a");
		clickWithoutSnap(res1);
		waiting(2000);
		switchToWindow(0);
		WebElement merge = locateElement("xpath", "//*[@class='buttonDangerous']");
		clickWithoutSnap(merge);
		acceptAlert();
		WebElement findLeads = locateElement("linktext", "Find Leads");
		click(findLeads);
		WebElement type12 = locateElement("xpath", "//*[contains(text(),'Lead ID:')]//following::*[@type='text' and @name='id']");
		type(type12, "10117");
		WebElement findleads = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
		click(findleads);
		waiting(2000);
		WebElement verify = locateElement("xpath", "//*[contains(text(),'No records to display')]");
		verifyExactText(verify, "No records to display");
//		closeBrowser();
	}
}
