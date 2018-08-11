package week3.day1.homework;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FrameHandlingCount {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		driver.manage().window().maximize();
		List<WebElement> val = driver.findElementsByTagName("iframe");
		int Totalcount = val.size();
		System.out.println(Totalcount);
		Thread.sleep(4000);
		
		WebElement framecount = driver.findElementByXPath("//iframe[@class='ui-layout-north ui-layout-pane ui-layout-pane-north']");
		driver.switchTo().frame(framecount);
		List<WebElement> value = driver.findElementsByTagName("iframe");
		int count1 = value.size();
		System.out.println(count1);
		Thread.sleep(4000);
		driver.switchTo().parentFrame();
		
		WebElement framecounts = driver.findElementByXPath("//iframe[@class='ui-layout-center ui-layout-pane ui-layout-pane-center']");
		driver.switchTo().frame(framecounts);
		List<WebElement> values = driver.findElementsByTagName("iframe");
		int count2 = values.size();
		System.out.println(count2);
		Thread.sleep(4000);
		driver.switchTo().parentFrame();
	
		WebElement framecountable = driver.findElementByXPath("//*[@class='ui-layout-south ui-layout-pane ui-layout-pane-south']//iframe");
		driver.switchTo().frame(framecountable);
		List<WebElement> valu = driver.findElementsByTagName("iframe");
		int count3 = valu.size();
		System.out.println(count3);
		Thread.sleep(4000);
		driver.switchTo().parentFrame();
		
		WebElement framecountables = driver.findElementByXPath("//iframe[@class='ui-layout-content']");
		driver.switchTo().frame(framecountables);
		List<WebElement> valuenumber = driver.findElementsByTagName("iframe");
		int count4 = valuenumber.size();
		System.out.println(count4);
		Thread.sleep(4000);
		driver.switchTo().parentFrame();
		
		WebElement framecountabling = driver.findElementByXPath("//iframe[@class='ui-layout-east ui-layout-pane ui-layout-pane-east']");
		driver.switchTo().frame(framecountabling);
		List<WebElement> valuenumbers = driver.findElementsByTagName("iframe");
		int count5 = valuenumbers.size();
		System.out.println(count5);
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(framecounts);
		WebElement framecountablings = driver.findElementByXPath("//*[@id='hiddenFetchesResults']//following::iframe");
		driver.switchTo().frame(framecountablings);
		List<WebElement> valuenumbering = driver.findElementsByTagName("iframe");
		int count6 = valuenumbering.size();
		System.out.println(count6);
		Thread.sleep(4000);
		
	    int overallcount = Totalcount+count1+count2+count3+count4+count5+count6;
	    System.out.println("The overall Frame count for this page is : "+overallcount);
	}

}
