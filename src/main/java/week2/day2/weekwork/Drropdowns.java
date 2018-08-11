package week2.day2.weekwork;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drropdowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");

		// Select drop down values with out giving the value and index by using a List 
		WebElement dropdown = driver.findElementByXPath("//*[@id='dropdown1']");
		Select dropdownvalues = new Select(dropdown);
		List <WebElement> alldrop =dropdownvalues.getOptions();
		int size = alldrop.size();
		dropdownvalues.selectByIndex(size-2);

		WebElement dropdown2 = driver.findElementByXPath("//*[@name='dropdown2']");
		Select value = new Select(dropdown2);
		List <WebElement> drop = value.getOptions();
		int sizeofdrop = drop.size();
		value.selectByIndex(sizeofdrop-1);
	}
}
