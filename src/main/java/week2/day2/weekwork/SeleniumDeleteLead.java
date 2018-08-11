package week2.day2.weekwork;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDeleteLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		WebElement userName = driver.findElementById("username");
		userName.sendKeys("DemoSalesManager",Keys.TAB);
		Thread.sleep(2000);
		WebElement password = driver.findElementById("password");
		password.sendKeys("crmsfa",Keys.TAB,Keys.ENTER);
		WebElement crm = driver.findElementByLinkText("CRM/SFA");
		crm.click();
		WebElement leads = driver.findElementByLinkText("Leads");
		leads.click();
		WebElement findleads = driver.findElementByLinkText("Find Leads");
		findleads.click();
		WebElement phone = driver.findElementByXPath("//*[@id='findLeads']//*[contains(text(),'Phone')]");
		phone.click();
		WebElement phoneNumber = driver.findElementByXPath("//*[@class='allSubSectionBlocks']//*[contains(text(),'Phone Number')]//following::*[@name='phoneCountryCode']");
		phoneNumber.clear();
		phoneNumber.sendKeys("13");
		WebElement phoneArea = driver.findElementByXPath("//*[@name='phoneAreaCode']");
		phoneArea.sendKeys("22");
		WebElement phonecontact = driver.findElementByXPath("//*[@name='phoneNumber']");
		phonecontact.sendKeys("9952491660");
		WebElement findleadbutton = driver.findElementByXPath("//button[contains(text(),'Find Leads')]");
		findleadbutton.click();
		WebElement table = driver.findElementByXPath("//button[contains(text(),'Find Leads')]//following::*/tbody/tr/td//*[@unselectable='on']//*[@class='linktext']");
		System.out.println(table.getText());
		Thread.sleep(2000);
		table.click();
		WebElement findlead = driver.findElementByLinkText("Find Leads");
		findlead.click();
		WebElement leadid= driver.findElementByXPath("//*[contains(text(),'Lead ID')]//following::*[@name='id']");
		leadid.sendKeys(table.getText());
		WebElement findleadbuttons = driver.findElementByXPath("//button[contains(text(),'Find Leads')]");
		findleadbuttons.click();
		String errormessage = driver.findElementByXPath("//button[contains(text(),'Find Leads')]//following::*[contains(text(),'No records to display')]").getText();
		if(errormessage.equalsIgnoreCase("No records to display"))
		{
			System.out.println("System Verify the Error message");
		}
		driver.close();
	}

}
