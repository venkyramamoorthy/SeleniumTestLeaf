package week3.day1.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		WebElement button = driver.findElementByXPath("//button[contains(text(),'Try it')]");
		button.click();
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.sendKeys("Venky");
		myalert.accept();
		WebElement value = driver.findElementById("demo");
		String output = value.getText();
		if(output.contains("Venky"))
		{
			System.out.println("The given value venky is available in the outout");
		}
		
		driver.switchTo().defaultContent();
		WebElement home = driver.findElementById("tryhome");
		home.click();
		
		Set <String> setwindow = driver.getWindowHandles();
		List<String> listwindow = new ArrayList<String>();
		listwindow.addAll(setwindow);
		
		System.out.println("Second window Details");
		// Second window
		driver.switchTo().window(listwindow.get(1));
		System.out.println("Second window title : "+driver.getTitle());
		System.out.println("Second window URL : "+driver.getCurrentUrl());
		
		System.out.println("First window Details");
		//First window
		driver.switchTo().window(listwindow.get(0));
		System.out.println("Second window title : "+driver.getTitle());
		System.out.println("Second window URL : "+driver.getCurrentUrl());
		
		// close all the window
		driver.quit();
	}

}
