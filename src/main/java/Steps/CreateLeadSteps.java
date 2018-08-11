package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateLeadSteps {
	public  RemoteWebDriver driver;
	String value;

	@Given("Open the Browser")
	public void browseropen()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@And("Max the window")
	public void windowMax()
	{
		driver.manage().window().maximize();
	}

	@And("Load the URL")
	public void loadurl()
	{
		driver.get("http://leaftaps.com/opentaps");
	}
	@And("Set the Timeout")
	public void setTime()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("Enter the Username as (.*)")
	public void enterUserName(String fname)
	{
		driver.findElementById("username").sendKeys(fname);
	}
	@And("Enter the Password as (.*)")
	public void enterpassword(String pwd)
	{
		driver.findElementById("password").sendKeys(pwd);
	}
	@And("Click on Submit")
	public void clicksubmit()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("click CRMSFA")
	public void clickCRMSFA()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("Click Leads")
	public void clickLeads()
	{
		driver.findElementByLinkText("Leads").click();
	}
	@And("Click Create Lead")
	public void clickCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
	}

	@And("Enter the Fname as (.*)")
	public void enterFname(String fNamee)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(fNamee);
		value =  driver.findElementById("createLeadForm_firstName").getAttribute("value");

	}

	@And("Enter the Lname as (.*)")
	public void enterLname(String lNamee)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lNamee);
	}

	@And("Enter the CompanyName as (.*)")
	public void enterCname(String cNamee)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cNamee);
	}

	@And("click on Submitbutton")
	public void submitLead()
	{
		driver.findElementByName("submitButton").click();
	}
	@And("Verify lead created Successfully")
	public void verifyFname()
	{
		String firstname = driver.findElementById("viewLead_firstName_sp").getText();
		if(firstname.equalsIgnoreCase(value))
		{
			System.out.println("Both are Same");
		}else
		{
			System.out.println("Both are not Same");
		}
	}
	@Then("close Browser")
	public void closeBrowser()
	{
		driver.close();
	}
}
