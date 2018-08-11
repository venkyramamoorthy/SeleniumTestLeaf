package week3.day1.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/");
		driver.manage().window().maximize();
		WebElement clickvalue = driver.findElementByLinkText("Multi-PopUp Test #2");
		clickvalue.click();
		Set<String> popup = driver.getWindowHandles();
		List<String> popups = new ArrayList<String>();
		popups.addAll(popup);
		driver.switchTo().window(popups.get(1));
		driver.close();
		driver.switchTo().window(popups.get(2));
		driver.close();
		driver.switchTo().window(popups.get(3));
		driver.close();
		driver.switchTo().window(popups.get(0));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
