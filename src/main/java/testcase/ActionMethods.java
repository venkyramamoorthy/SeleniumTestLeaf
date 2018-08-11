package testcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMethods {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		//Dragable
		WebElement draggable = driver.findElementByLinkText("Draggable");
		draggable.click();
		WebElement befFrame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(befFrame);
		WebElement drag = driver.findElementById("draggable");
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, 120, 160).perform();
		driver.switchTo().defaultContent();
		//Dropable
		WebElement dropable = driver.findElementByLinkText("Droppable");
		dropable.click();
		WebElement befFramedrop = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(befFramedrop);
		WebElement drop1 = driver.findElementById("draggable");
		WebElement drop2 = driver.findElementById("droppable");
		builder.dragAndDrop(drop1, drop2).perform();
		driver.switchTo().defaultContent();
		//Sortable
		WebElement Sortable = driver.findElementByLinkText("Sortable");
		Sortable.click();
		WebElement befsortFramedrop = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(befsortFramedrop);
		WebElement item1 = driver.findElementByXPath("//*[@id='sortable']/li[1]");
		WebElement item5 = driver.findElementByXPath("//*[@id='sortable']/li[5]");
		int y = item5.getLocation().getY();
		builder.dragAndDropBy(item1, 0, y).perform();
		driver.switchTo().defaultContent();
		//Selectable
		WebElement Selectable = driver.findElementByLinkText("Selectable");
		Selectable.click();
		WebElement befselectFramedrop = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(befselectFramedrop);
		WebElement item = driver.findElementByXPath("//*[@id='selectable']/li[1]");
		WebElement items = driver.findElementByXPath("//*[@id='selectable']/li[5]");
		builder.dragAndDrop(item, items).perform();
		driver.switchTo().defaultContent();
	}
}
