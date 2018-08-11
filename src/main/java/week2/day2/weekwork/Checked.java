package week2.day2.weekwork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checked {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		Thread.sleep(2000);
		WebElement check = driver.findElementByXPath("//*[@id='contentblock']/section/div[1]//input[1]");
		System.out.println("The value is : "+check.isSelected());
		if(!check.isSelected())
		{
			check.click();
		}
	}
}