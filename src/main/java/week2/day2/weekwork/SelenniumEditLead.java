package week2.day2.weekwork;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenniumEditLead {

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
		WebElement firstname = driver.findElementByXPath("//*[@id='findLeads']//*[@name='firstName']");
		firstname.sendKeys("Venkatesh");
		WebElement findleadbutton = driver.findElementByXPath("//button[contains(text(),'Find Leads')]");
		findleadbutton.click();
		Thread.sleep(2000);
		WebElement table = driver.findElementByXPath("//button[contains(text(),'Find Leads')]//following::table/tbody/tr/td//*[@unselectable='on']//*[@class='linktext']");
		System.out.println(table.getText());
		table.click();
		
		String title = driver.getTitle();
		System.out.println("Title of the page : "+title);
		
		
		WebElement edit = driver.findElementByXPath("//*[@class='subMenuButton' and contains(text(),'Edit')]");
		edit.click();
		
		WebElement editcompanyname = driver.findElementByXPath("//*[@name='companyName' and @id='updateLeadForm_companyName']");
		editcompanyname.clear();
		editcompanyname.sendKeys("TATA");
		
		WebElement updatebutton = driver.findElementByXPath("//*[@type='submit' and @class='smallSubmit' and @value='Update']");
		updatebutton.click();
		
		String updatecheck = driver.findElementById("viewLead_companyName_sp").getText();
		String updatevalue = updatecheck.substring(0, 4).trim();
		//System.out.println(updatevalue);
		if(updatevalue.equalsIgnoreCase("TATA"))
		{
			System.out.println("The company name is updated as : "+updatevalue);
		}
		else 
		{
			System.out.println("The value is not updated");
		}
		driver.close();
	}
	

}
