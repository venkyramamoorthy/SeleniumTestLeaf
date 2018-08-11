package week2.day2;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestleafListDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		
		List<WebElement> select = driver.findElementsByTagName("select");
		int size =select.size();
		System.out.println("count of dropdown : "+size);
		
		//Error Exactly Second drop down value
		WebElement secondWeb = select.get(1);
		System.out.println("Second Web element values is"+secondWeb.getText());
		
		
		
		//All Dropdwon values
		System.out.println("Below are the list of dropdown values");
		for (WebElement alldropvalues : select)
		{
			String value = alldropvalues.getText();
			System.out.println(value);
		}

	}

}
