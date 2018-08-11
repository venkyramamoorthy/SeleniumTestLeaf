package week2.day2.weekwork;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDuplicate {

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
		WebElement email = driver.findElementByXPath("//*[@id='findLeads']//*[contains(text(),'Email')]");
		email.click();
		WebElement emaildetail = driver.findElementByXPath("//*[@name='emailAddress']");
		emaildetail.sendKeys("venkateshraja1993@gmail.com");
		WebElement findleadbutton = driver.findElementByXPath("//button[contains(text(),'Find Leads')]");
		findleadbutton.click();
		WebElement table = driver.findElementByXPath("//button[contains(text(),'Find Leads')]//following::*/tbody/tr/td//*[@unselectable='on']//*[@class='linktext']");
		System.out.println(table.getText());
		Thread.sleep(2000);
		table.click();
		WebElement duplicate = driver.findElementByXPath("//*[@class='subMenuButton' and contains(text(),'Duplicate Lead')]");
		duplicate.click();
		String title = driver.getTitle();
		System.out.println(title);
		WebElement createLeadbutton = driver.findElementByXPath("//*[@class='smallSubmit']");
	    createLeadbutton.click();
	    driver.close();
	}

}
