package week2.day2.weekwork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unchecked {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.heroKuapp.com/pages/checkbox.html");
		WebElement check = driver.findElementByXPath("//*[@id='contentblock']/section/div[2]//input[1]");
		System.out.println("The check box is : "+check.isSelected());
		if(check.isSelected())
		{
			check.click();
		}
	}

}
