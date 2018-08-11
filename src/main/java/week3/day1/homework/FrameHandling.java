package week3.day1.homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement frameone = driver.findElementByXPath("//button[contains(text(),'Close Me')]");
		frameone.click();
		Thread.sleep(4000);
		driver.switchTo().frame("childIframe");
		WebElement frametwo = driver.findElementByXPath("//button[contains(text(),'Close Me')]");
		frametwo.click();
		Thread.sleep(4000);
		WebElement framethree = driver.findElementByXPath("//*[@class='ui-layout-east ui-layout-pane ui-layout-pane-east']/p/button[contains(text(),'Close Me')]");
		framethree.click();
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		WebElement framefour = driver.findElementByXPath("//*[@class='ui-layout-east ui-layout-pane ui-layout-pane-east']/p/button[contains(text(),'Close Me')]");
		framefour.click();
		driver.close();

	}

}
