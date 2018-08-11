package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testleaf_lead {

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
		WebElement lead = driver.findElementByLinkText("Create Lead");
		lead.click();
		WebElement findLead = driver.findElementByLinkText("Find Leads");
		findLead.click();
		Thread.sleep(2000);
		
		WebElement firstLink = driver.findElementByXPath("//*[@id='findLeads']//following::*[contains(text(),'10024')]");
		firstLink.click();
		Thread.sleep(2000);
		WebElement mergeLead = driver.findElementByLinkText("Merge Leads");
		mergeLead.click();
		Thread.sleep(2000);
		WebElement merge = driver.findElementByXPath("(//*[@alt='Lookup'])[2]");
		merge.click();
	}

}
