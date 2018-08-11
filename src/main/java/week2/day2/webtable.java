package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		
		List<WebElement> table=driver.findElementsByXPath("//*[@class='innerblock']//table");
		int tablesize =table.size();
		System.out.println("Size of Table : "+tablesize);
		
		List<WebElement> row=driver.findElementsByXPath("//*[@class='innerblock']//table/tbody/tr");
		int rowsize = row.size();
		System.out.println("Size of row : "+rowsize);
		
		List<WebElement> column=driver.findElementsByXPath("//*[@class='innerblock']//table/tbody/tr/th");
		int columnsize = column.size();
		System.out.println("Size of column : "+columnsize);
		
		// Another method to display 80%
		List<WebElement> columnvalue =row.get(2).findElements(By.tagName("td"));
		System.out.println(columnvalue.get(1).getText());
	
		String secondvalue = driver.findElementByXPath("//tbody/tr[3]/td[2]").getText();
		System.out.println(secondvalue);
	}

}
