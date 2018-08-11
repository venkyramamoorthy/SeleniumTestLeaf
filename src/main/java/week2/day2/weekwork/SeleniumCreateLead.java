package week2.day2.weekwork;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumCreateLead {

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
		WebElement companyName = driver.findElementById("createLeadForm_companyName");
		companyName.sendKeys("TataConsultancyServices");
		WebElement firstName = driver.findElementById("createLeadForm_firstName");
		firstName.sendKeys("Venkatesh");
		WebElement lastName = driver.findElementById("createLeadForm_lastName");
		lastName.sendKeys("Raja");
		WebElement firstNameLocal = driver.findElementById("createLeadForm_firstNameLocal");
		firstNameLocal.sendKeys("Venky");
		WebElement lastNameLocal = driver.findElementById("createLeadForm_lastNameLocal");
		lastNameLocal.sendKeys("Raj");
		WebElement saluation = driver.findElementById("createLeadForm_personalTitle");
		saluation.sendKeys("MR");
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select value = new Select(source);
		value.selectByValue("LEAD_WEBSITE");
		
		WebElement title = driver.findElementById("createLeadForm_generalProfTitle");
		title.sendKeys("MR");
		WebElement annualRevenue = driver.findElementById("createLeadForm_annualRevenue");
		annualRevenue.sendKeys("123");
		
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select industryvalue = new Select(industry);
		industryvalue.selectByValue("IND_INSURANCE");
		
		
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select ownershipValue = new Select(ownership);
		ownershipValue.selectByValue("OWN_PARTNERSHIP");
		
		WebElement SICcode = driver.findElementById("createLeadForm_sicCode");
		SICcode.sendKeys("625008");
		
		WebElement Description = driver.findElementById("createLeadForm_description");
		Description.sendKeys("I Described my self");
		
		WebElement importantNote = driver.findElementById("createLeadForm_importantNote");
		importantNote.sendKeys("Important I support my self");
		
		WebElement countryCode = driver.findElementById("createLeadForm_primaryPhoneCountryCode");
		countryCode.sendKeys("3");
		
		WebElement areaCode = driver.findElementById("createLeadForm_primaryPhoneAreaCode");
		areaCode.sendKeys("22");
	
		WebElement extension = driver.findElementById("createLeadForm_primaryPhoneExtension");
		extension.sendKeys("123");
		
		WebElement department = driver.findElementById("createLeadForm_departmentName");
		department.sendKeys("IT");
		
		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		Select currencyvalue = new Select(currency);
        currencyvalue.selectByVisibleText("ALL - Albanian Lek");
        
        WebElement employees = driver.findElementById("createLeadForm_numberEmployees");
        employees.sendKeys("100");
        
        WebElement tickersymbol = driver.findElementById("createLeadForm_tickerSymbol");
        tickersymbol.sendKeys("12");
        
        WebElement person = driver.findElementById("createLeadForm_primaryPhoneAskForName");
        person.sendKeys("Qwerty");
        
        WebElement URL = driver.findElementById("createLeadForm_primaryWebUrl");
        URL.sendKeys("//https:sendkeys.text");
        
        WebElement toName = driver.findElementById("createLeadForm_generalToName");
        toName.sendKeys("Venkateshraja");
        
        
        WebElement address1 = driver.findElementById("createLeadForm_generalAddress1");
        address1.sendKeys("Madurai");
        
        WebElement city = driver.findElementById("createLeadForm_generalCity");
        city.sendKeys("Palanganatham");
        
       WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
       Select statevalue = new Select(state);
       statevalue.selectByVisibleText("Alabama");
       
       WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
       Select countryvalue = new Select(country);
       countryvalue.selectByVisibleText("Albania");
       
       WebElement postalCode = driver.findElementById("createLeadForm_generalPostalCode");
       postalCode.sendKeys("123456");
       
       WebElement zipcode = driver.findElementById("createLeadForm_generalPostalCodeExt");
       zipcode.sendKeys("1236");
       
       WebElement marketing = driver.findElementById("createLeadForm_marketingCampaignId");
       Select marketingvalue = new Select(marketing);
       marketingvalue.selectByVisibleText("Automobile");
       
    
       WebElement phone = driver.findElementById("createLeadForm_primaryPhoneNumber");
       phone.sendKeys("9952491660");
       
       WebElement email = driver.findElementById("createLeadForm_primaryEmail");
       email.sendKeys("venkateshraja1993@gmail.com");
       
       WebElement createLeadbutton = driver.findElementByXPath("//*[@class='smallSubmit']");
       createLeadbutton.click();
       
       WebElement verifyfirstname= driver.findElementById("viewLead_firstName_sp");
       String firstNamevalue = verifyfirstname.getText();
       System.out.println("The first name is : "+firstNamevalue);
       if(firstNamevalue.equalsIgnoreCase("Venkatesh"))
       {
    	   System.out.println("The Values is Venkatesh");
       }
       else
       {
    	   System.out.println("The Value is not venkatesh");
       }
	}

}
