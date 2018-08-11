package wdMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import util.Reporter;


public class SeMethods extends Reporter implements WdMethods{
	//public class SeMethods implements WdMethods{
	//  chrome or firefox implements from RemoteWebDriver interface 
	public static RemoteWebDriver driver ;
	public static Properties prop;
	int i = 1;
	public void property()
	{
		prop = new Properties();
		try {
			prop.load(new FileInputStream("./src/test/resources/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void startApp(String browser, String url) {	

		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();			
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
				driver = new FirefoxDriver();		
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser "+browser+" is Launched Successfully");
			reportStep("The browser: "+browser+" launched successfully", "pass");
		} catch (WebDriverException e) {			
			reportStep("The browser: "+browser+" could not be launched", "fail");
		}

		finally {
			takeSnap();
		}


	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);	
			case "linktext": return driver.findElementByLinkText(locValue);	

			}
		} catch (NoSuchElementException e) {
			reportStep("The element with locator "+locator+" not found.","FAIL");
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while finding "+locator+" with the value "+locValue, "FAIL");
		}

		return null;
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			System.out.println("The Data "+data+" is Entered Successfully");
			reportStep("The data: "+data+" entered successfully in the field :"+ele, "PASS");
		} catch (InvalidElementStateException e) {
			reportStep("The data: "+data+" could not be entered in the field :"+ele,"FAIL");
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while entering "+data+" in the field :"+ele, "FAIL");
		}
	
	finally {
		takeSnap();			
	}
}

public void click(WebElement ele) {
	try {
		ele.click();
		System.out.println("The Element "+ele+" is clicked Successfully");
		reportStep("The element  is clicked", "pass");
	} catch (InvalidElementStateException e) {
		reportStep("The element could not be clicked", "fail");
	} catch (WebDriverException e) {
		reportStep("Unknown exception occured while clicking in the field :", "FAIL");
	} 

	finally
	{
		takeSnap();
	}		
}

public void clickWithoutSnap(WebElement ele) {
	try
	{
		ele.click();
		System.out.println("The Element "+ele+" is clicked Successfully");
		reportStep("The Element "+ele+" is clicked Successfully","pass");
	}catch (NoSuchElementException e) {
		System.err.println("NosuchelementException has been occured ");
		reportStep("NosuchelementException has been occured","fail");

	}catch (Exception e) {
		System.err.println("Exception has been occured ");
		reportStep("Exception has been occured","fail");

	}
	finally
	{
		takeSnap();
	}	
}

public String getText(WebElement ele) {

	String text = "";
	try
	{
		text= ele.getText();
		System.out.println("The value :"+ele+"is get from UI");	
		reportStep("The value : "+ele+"is get from UI","pass");
	}
	catch (NoSuchElementException e) {
		reportStep("NosuchelementException has been occured","fail");
		System.err.println("NosuchelementException has been occured ");

	}catch (Exception e) {
		System.err.println("Exception has been occured ");
		reportStep("Exception has been occured","fail");

	}
	finally
	{
		takeSnap();
	}
	return text;
}

public void selectDropDownUsingText(WebElement ele, String value) {
	try
	{
		Select values = new Select(ele);
		values.selectByVisibleText(value);
		reportStep("The value : "+value+"is select by using visible text","pass");
		System.out.println("The value :"+value+"is select by using visible text");
	}
	catch (NoSuchElementException e) {
		reportStep("NosuchelementException has been occured","fail");
		System.err.println("NosuchelementException has been occured ");

	}catch (Exception e) {
		System.err.println("Exception has been occured ");
		reportStep("Exception has been occured","fail");

	}
	finally
	{
		takeSnap();
	}
}
public void selectDropDownUsingvalue(WebElement ele, String value) {
	try {
		Select values = new Select(ele);
		values.selectByValue(value);
		reportStep("The value : "+value+"is select by using value","pass");
	} catch (NoSuchElementException e) {
		reportStep("NosuchelementException has been occured","fail");
		System.err.println("NosuchelementException has been occured ");

	}catch (Exception e) {
		reportStep("Exception has been occured","fail");
		System.err.println("Exception has been occured ");

	}
	finally
	{
		takeSnap();
	}
}
public void selectDropDownUsingIndex(WebElement ele, int index) {
	try {
		Select values = new Select(ele);
		values.selectByIndex(index);
		reportStep("The value : "+index+"is select by using index","pass");
	} catch (NoSuchElementException e) {
		reportStep("NosuchelementException has been occured","fail");
		System.err.println("NosuchelementException has been occured ");

	}catch (Exception e) {
		reportStep("Exception has been occured","fail");
		System.err.println("Exception has been occured ");

	}
	finally
	{
		takeSnap();
	}

}

public boolean verifyTitle(String expectedTitle) {
	String title="";
	boolean value = false;
	try {
		title = driver.getTitle();
		if(title.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("The title value "+expectedTitle+" has matched");
			reportStep("The title value "+expectedTitle+" has matched","pass");
			value= true;
		}else
		{
			System.out.println("the title value "+expectedTitle+"is not matched");
			reportStep("The title value "+expectedTitle+"is not matched","fail");

		}
		value= false;
		return value;
	} catch (WebDriverException e) {
		System.err.println("Webdriver Exception has been occured");
		reportStep("Webdriver Exception has been occured","fail");

	}
	catch (Exception e) {
		reportStep("Exception has been occured","fail");
		System.err.println("Exception has been occured");

	}finally
	{
		takeSnap();
	}
	return value;
}

public void verifyExactText(WebElement ele, String expectedText) {
	try {
		String textvalue= ele.getText();
		if(textvalue.equalsIgnoreCase(expectedText))
		{
			System.out.println("The value "+expectedText+" matched exactly");
			reportStep("The value "+expectedText+" matched exactly","pass");
		}else
		{
			System.out.println("The value "+expectedText+" not matched");
			reportStep("The value "+expectedText+" not matched","fail");
		}
	} catch (NoSuchElementException e) {
		reportStep("NoSuchElementException Exception has been occured","fail");
		System.err.println("NoSuchElementException Exception has been occured");

	}catch (Exception e) {
		reportStep("Exception has been occured","fail");
		System.err.println("Exception has been occured");

	}finally
	{
		takeSnap();
	}

}
public void verifyPartialText(WebElement ele, String expectedText) {
	try {
		String partial= ele.getText();
		if(partial.contains(expectedText))
		{
			System.out.println("The value "+expectedText+" matched partially");
			reportStep("The value "+expectedText+" matched partially","pass");
		}else
		{
			reportStep("The value "+expectedText+" matched partially","fail");
			System.out.println("The value "+expectedText+" not partially");
		}
	} catch (NoSuchElementException e) {
		reportStep("NoSuchElementException Exception has been occured","fail");
		System.err.println("NoSuchElementException Exception has been occured");

	}catch (Exception e) {
		reportStep("Exception has been occured","fail");
		System.err.println("Exception has been occured");

	}finally
	{
		takeSnap();
	}
}

public void verifyExactAttribute(WebElement ele, String attribute, String value) {
	try {
		String val =ele.getAttribute(attribute);
		if (val.equals(value)) {
			System.out.println("The given "+value+" is Matched");
			reportStep("The given "+value+" is Matched","pass");

		} else {
			reportStep("The given "+value+" not Matched","fail");
			System.out.println("The given "+value+" not Matched");
		}
	}catch (NoSuchElementException e) {
		reportStep("NoSuchElementException Exception has been occured","fail");
		System.err.println("NoSuchElementException Exception has been occured");

	}catch (Exception e) {
		reportStep("Exception has been occured","fail");
		System.err.println("Exception has been occured");

	}finally
	{
		takeSnap();
	}
}
public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
	try {
		String val =ele.getAttribute(attribute);
		if (val.equalsIgnoreCase(value)) {
			System.out.println("The given "+value+" is partially Matched");
			reportStep("The given "+value+" is partially Matched","pass");

		} else {
			reportStep("The given "+value+" not partially Matched","fail");
			System.out.println("The given "+value+" not partially Matched");
		}
	}catch (NoSuchElementException e) {
		reportStep("NoSuchElementException Exception has been occured","fail");
		System.err.println("NoSuchElementException Exception has been occured");

	}catch (Exception e) {
		reportStep("Exception has been occured","fail");
		System.err.println("Exception has been occured");

	}finally
	{
		takeSnap();
	}

}

public void verifySelected(WebElement ele) {
	try {
		ele.isSelected();
		System.out.println("The "+ele+" is Selected ");
		reportStep("The "+ele+" is Selected","pass");
	}catch (NoSuchElementException e) {
		reportStep("NoSuchElementException Exception has been occured","fail");
		System.err.println("NoSuchElementException Exception has been occured");

	}catch (Exception e) {
		reportStep("Exception has been occured","fail");
		System.err.println("Exception has been occured");

	}finally
	{
		takeSnap();
	}
}

public void verifyDisplayed(WebElement ele) {
	try {
		ele.isDisplayed();
		System.out.println("The "+ele+" is Displayed ");
		reportStep("The "+ele+" is Displayed","pass");
	}catch (NoSuchElementException e) {
		reportStep("NoSuchElementException Exception has been occured","fail");
		System.err.println("NoSuchElementException Exception has been occured");

	}catch (Exception e) {
		reportStep("Exception has been occured","fail");
		System.err.println("Exception has been occured");

	}finally
	{
		takeSnap();
	}
}

public void switchToWindow(int index) {
	try {
		Set<String> setwindow = driver.getWindowHandles();
		List<String> listwindow = new ArrayList<String>();
		listwindow.addAll(setwindow);
		driver.switchTo().window(listwindow.get(index));
		reportStep("The "+index+" th window switched successfully","pass");
		System.out.println("The "+index+" th window switched successfully");
	}catch (NoSuchWindowException e) {
		reportStep("NoSuchElementException Exception has been occured","fail");
		System.err.println("NoSuchWindowException Exception has been occured");

	}catch (Exception e) {
		reportStep("Exception has been occured","fail");
		System.err.println("Exception has been occured");

	}
}

public void switchToFrame(WebElement ele) {
	try
	{
		driver.switchTo().frame(ele);
		System.out.println("The Frames Switched Successfully");	
		reportStep("The Frames Switched Successfully","pass");
	}catch (NoSuchFrameException e) {
		reportStep("NoSuchFrameException Exception has been occured","fail");
		System.err.println("NoSuchFrameException Exception has been occured");

	}catch (Exception e) {
		reportStep("Exception has been occured","fail");
		System.err.println("Exception has been occured");

	}finally
	{
		takeSnap();
	}
}

public void acceptAlert() {
	try
	{   
		Alert alertvalue = driver.switchTo().alert();
		alertvalue.getText();
		alertvalue.accept();
		reportStep("The alert Accepted done successfully","pass");
		System.out.println("The alert Accepted done successfully");
	}catch (UnhandledAlertException e) {
		reportStep("UnhandledAlertException Exception has been occured","fail");
		System.err.println("UnhandledAlertException Exception has been occured");

	}catch (NoAlertPresentException e) {
		reportStep("NoAlertPresentException Exception has been occured","fail");
		System.err.println("NoAlertPresentException Exception has been occured");

	}catch (Exception e) {
		reportStep("Exception has been occured","fail");
		System.err.println("Exception has been occured");

	}
}

public void dismissAlert() {
	try
	{
		Alert alertvalue = driver.switchTo().alert();
		alertvalue.getText();
		alertvalue.dismiss();
		System.out.println("The alert dismissed done successfully");
		reportStep("The alert dismissed done successfully","pass");
	}catch (UnhandledAlertException e) {
		reportStep("UnhandledAlertException Exception has been occured","fail");
		System.err.println("UnhandledAlertException Exception has been occured");

	}catch (NoAlertPresentException e) {
		reportStep("NoAlertPresentException Exception has been occured","fail");
		System.err.println("NoAlertPresentException Exception has been occured");

	}catch (Exception e) {
		reportStep("Exception has been occured","fail");
		System.err.println("Exception has been occured");

	}
}

public String getAlertText() {
	String values=" ";
	try
	{
		Alert alertvalue = driver.switchTo().alert();
		values = alertvalue.getText();
		reportStep("The alert text get successfully","pass");
		return values;
	}catch (UnhandledAlertException e) {
		reportStep("UnhandledAlertException Exception has been occured","fail");
		System.err.println("UnhandledAlertException Exception has been occured");

	}catch (NoAlertPresentException e) {
		reportStep("NoAlertPresentException Exception has been occured","fail");
		System.err.println("NoAlertPresentException Exception has been occured");

	}catch (Exception e) {
		reportStep("Exception has been occured","fail");
		System.err.println("Exception has been occured");

	}
	return values;
}

public void takeSnap() {
	File src = driver.getScreenshotAs(OutputType.FILE);
	File desc = new File("./snaps/img"+i+".png");
	try {
		FileUtils.copyFile(src, desc);
	} catch (IOException e) {
		e.printStackTrace();
	}
	i++;
}
public void takeSnaps() {
	try {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		FileUtils.copyFile(src, desc);
		reportStep("The snap done successfully","pass");
	} catch (IOException e) {
		reportStep("IOException has been occured","fail");
		System.err.println("IOException has been occured");

	}catch (Exception e) {
		reportStep("Exception has been occured","fail");
		System.err.println("Exception has been occured");	

	}
	finally
	{
		i++;
	}
}

public void closeBrowser() {
	try
	{
		driver.close();
		reportStep("The Browser closed successfully","pass");
		System.out.println(" the Browser closed successfully");
	}catch(WebDriverException e)
	{
		reportStep("WebDriverException has been occured","fail");
		System.err.println("WebDriverException has been occured");

	}catch(Exception e)
	{
		reportStep("Exception has been occured","fail");
		System.err.println("Exception has been occured");

	}
}

public void closeAllBrowsers() {
	try
	{
		driver.quit();
		reportStep("ALL Browsers closed successfully","pass");
		System.out.println(" All Browsers closed successfully");
	}catch(WebDriverException e)
	{
		reportStep("WebDriverException has been occured","fail");
		System.err.println("WebDriverException has been occured");

	}catch(Exception e)
	{
		reportStep("Exception has been occured","fail");
		System.err.println("Exception has been occured");

	}

}
public void waiting(int value) 
{
	try {
		Thread.sleep(value);
		reportStep("Waiting done successfully","pass");
	} catch (InterruptedException e) {
		reportStep("InterruptedException has been occured","fail");
		System.err.println("InterruptedException has been occured");

	}
}
public void Mouseover(WebElement ele1,WebElement ele2)
{
	Actions builder = new Actions(driver);
	//builder.moveToElement(ele1).pause(3000).click(ele2).build().perform();
	builder.moveToElement(ele1).click(ele2).build().perform();
}

}