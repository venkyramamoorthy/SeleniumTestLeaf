package testcase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Contact_Testleaf {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement userName = driver.findElementById("username");
		userName.sendKeys("DemoSalesManager",Keys.TAB);
		WebElement password = driver.findElementById("password");
		password.sendKeys("crmsfa",Keys.TAB,Keys.ENTER);
		WebElement crm = driver.findElementByLinkText("CRM/SFA");
		crm.click();
		WebElement createcontact = driver.findElementByLinkText("Create Contact");
		createcontact.click();
		WebElement firstname =driver.findElementById("firstNameField");
		firstname.sendKeys("Venkatesh");
		WebElement lastname =driver.findElementById("lastNameField");
		lastname.sendKeys("Raja");
		WebElement firstnamelocal =driver.findElementById("createContactForm_firstNameLocal");
		firstnamelocal.sendKeys("venky");
		WebElement lastnamelocal =driver.findElementById("createContactForm_lastNameLocal");
		lastnamelocal.sendKeys("Raj");
		WebElement saluation =driver.findElementById("createContactForm_personalTitle");
		saluation.sendKeys("MR");
		WebElement Title =driver.findElementById("createContactForm_generalProfTitle");
		Title.sendKeys("MR");
		WebElement Department =driver.findElementById("createContactForm_departmentName");
		Department.sendKeys("CSE");
		WebElement preferredcurrency =driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select value = new Select(preferredcurrency);
		value.selectByVisibleText("ALL - Albanian Lek");
		WebElement Description =driver.findElementById("createContactForm_description");
		Description.sendKeys("DESCRIPTION");
		WebElement importantnote =driver.findElementById("createContactForm_importantNote");
		importantnote.sendKeys("IMPORTANTNOTE");
		WebElement areacode = driver.findElementByXPath("//*[contains(text(),'Area Code')]//following::*[@name='primaryPhoneAreaCode']");
		areacode.sendKeys("001");
		WebElement Extension = driver.findElementByXPath("//*[contains(text(),'Extension')]//following::*[@name='primaryPhoneExtension']");
		Extension.sendKeys("0010");
		WebElement email = driver.findElementById("createContactForm_primaryEmail");
		email.sendKeys("venkateshraja1993@gmail.com");
		WebElement phone = driver.findElementById("createContactForm_primaryPhoneNumber");
		phone.sendKeys("9952491660");
		WebElement person = driver.findElementById("createContactForm_primaryPhoneAskForName");
		person.sendKeys("person");
		WebElement Toname = driver.findElementById("generalToNameField");
		String names = Toname.getAttribute("value");
		System.out.println("To Name value is : "+Toname.getAttribute("value"));
		WebElement address = driver.findElementById("createContactForm_generalAddress1");
		address.sendKeys("Address 1");
		WebElement city = driver.findElementById("createContactForm_generalCity");
		city.sendKeys("Madurai");
		WebElement zip = driver.findElementById("createContactForm_generalPostalCode");
		zip.sendKeys("625008");
		WebElement zipExtn = driver.findElementById("createContactForm_generalPostalCodeExt");
		zipExtn.sendKeys("025");
		WebElement Attnname = driver.findElementById("createContactForm_generalAttnName");
		Attnname.sendKeys("Attention");
		WebElement address2 = driver.findElementById("createContactForm_generalAddress2");
		address2.sendKeys("Address 2");
		WebElement country = driver.findElementById("createContactForm_generalCountryGeoId");
		Select values1 = new Select(country);
		values1.selectByVisibleText("India");
		WebElement provinces = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select values2 = new Select(provinces);
		values2.selectByVisibleText("ANDHRA PRADESH");
		WebElement createcontacts = driver.findElementByXPath("//*[@name='submitButton']");
		createcontacts.click();
		WebElement firstnames = driver.findElementById("viewContact_firstName_sp");
		String value2 = firstnames.getText();
		if(names.contains(value2))
		{
			System.out.println("Text available");
		}else
		{
			System.out.println("Text not available");
		}
		WebElement edit = driver.findElementByXPath("//*[@class='subMenuButton' and contains(text(),'Edit')]");
		edit.click();
		WebElement marketing = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
		Select marketvalue = new Select(marketing);
		marketvalue.selectByVisibleText("Automobile");
		WebElement Add = driver.findElementByXPath("//*[@class='smallSubmit' and @value='Add']");
		Add.click();
		WebElement update = driver.findElementByXPath("//*[@class='smallSubmit' and @value='Update']");
		update.click();
		WebElement choosemarket = driver.findElementById("viewContact_marketingCampaigns_sp");
		String marketingvalue = choosemarket.getText();
		if(marketingvalue.contains("Automobile"))
		{
			System.out.println("Text matched");
		}else
		{
			System.out.println("Text not matched");
		}
	}
}
