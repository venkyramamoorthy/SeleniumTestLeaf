package week3.day1.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowLearningIrctc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		WebElement compactabilitybrowser = driver.findElementByXPath("//*[contains(text(),'Compatible Browser')]");
		compactabilitybrowser.click();
		WebElement contactclick = driver.findElementByXPath("//*[contains(text(),'Contact Us')]");
		contactclick.click();
		
		Set<String> setwindow = driver.getWindowHandles();
		List<String> listWindow = new ArrayList<String>();
		listWindow.addAll(setwindow);

		driver.switchTo().window(listWindow.get(0));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(listWindow.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(listWindow.get(2));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String browser1 =driver.findElementByXPath("//*[@class='container']//*[@class='content_12']/ul/li[1]").getText();
		String browser2 =driver.findElementByXPath("//*[@class='container']//*[@class='content_12']/ul/li[2]").getText();
		String browser3 =driver.findElementByXPath("//*[@class='container']//*[@class='content_12']/ul/li[3]").getText();
		String browser4 =driver.findElementByXPath("//*[@class='container']//*[@class='content_12']/ul/li[4]").getText();
		String browser5 =driver.findElementByXPath("//*[@class='container']//*[@class='content_12']/ul/li[5]").getText();
		System.out.println(browser1+","+browser2+","+browser3+","+browser4+","+browser5);
		driver.close();
	}

}
