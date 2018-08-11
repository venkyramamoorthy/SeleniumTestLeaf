package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Testleaf {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		/*             Run a chrome version in background
		ChromeOptions background = new ChromeOptions();
		background.setHeadless(true);
		ChromeDriver driver = new ChromeDriver(background);*/
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		
		// Implicit Wait function
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement userName = driver.findElementById("username");
		userName.sendKeys("DemoSalesManager",Keys.TAB);
		Thread.sleep(2000);
		WebElement password = driver.findElementById("password");
		password.sendKeys("crmsfa",Keys.TAB,Keys.ENTER);
		
		/*WebElement submit = driver.findElementByClassName("decorativeSubmit");
		submit.click();*/
		WebElement crm = driver.findElementByLinkText("CRM/SFA");
		crm.click();
		WebElement lead = driver.findElementByLinkText("Create Lead");
		lead.click();
		Thread.sleep(3000);
		WebElement companyName = driver.findElementById("createLeadForm_companyName");
		companyName.sendKeys("TCS");
		WebElement firstName = driver.findElementById("createLeadForm_firstName");
		firstName.sendKeys("VenkateshRaja");
		WebElement lastName = driver.findElementById("createLeadForm_lastName");
		lastName.sendKeys("GR");
		
		// Select using dropdown
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown = new Select(industry);
		dropdown.selectByValue("IND_DISTRIBUTION");
		
		// count of select
		List <WebElement> allOptions = dropdown.getOptions();
		int size = allOptions.size();
		System.out.println("Count of dropdown values : "+size);
		
		// Last value of dropdown
		dropdown.selectByIndex(size-1);
		for(WebElement eachvalue : allOptions)
		{
			String Value = eachvalue.getText();
			System.out.println(Value);
		}
		WebElement createLead = driver.findElementByClassName("smallSubmit");
		createLead.click();   
		
		}

}
