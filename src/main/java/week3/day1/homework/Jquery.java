package week3.day1.homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jquery {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/");
		driver.manage().window().maximize();
		WebElement dragable = driver.findElementByXPath("//*[@id='sidebar']//*[contains(text(),'Draggable')]");
		dragable.click();
		Thread.sleep(4000);
		WebElement call = driver.findElementByXPath("//*[@class='demo-frame']");
		driver.switchTo().frame(call);
		Thread.sleep(4000);
		WebElement dragcontent = driver.findElementById("draggable");
		System.out.println("Inside Dragable");
		System.out.println(dragcontent.getText());
		driver.switchTo().defaultContent();
		WebElement droppable = driver.findElementByXPath("//*[@id='sidebar']//*[contains(text(),'Droppable')]");
		droppable.click();
	}

}
