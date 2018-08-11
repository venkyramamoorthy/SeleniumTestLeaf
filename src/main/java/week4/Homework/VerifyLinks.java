package week4.Homework;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLinks {

	public static void main(String[] args) 
	{
		
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in/");
		//driver.get("http://ww.goo.co.in");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+links.size());
		for(int i=0;i<links.size();i++)
		{
			WebElement ele= links.get(i);
			String url=ele.getAttribute("href");
			verifyLinkActive(url);
		}
	}
	
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();           
           httpURLConnect.setConnectTimeout(3000);           
           httpURLConnect.connect();           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
	   if(httpURLConnect.getResponseCode()==201)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_CREATED);
            }
	   if(httpURLConnect.getResponseCode()==202)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_ACCEPTED);
            }
	   if(httpURLConnect.getResponseCode()==400)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_BAD_REQUEST);
            }
           if(httpURLConnect.getResponseCode()==401)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_UNAUTHORIZED);
            }
	   if(httpURLConnect.getResponseCode()==402)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_PAYMENT_REQUIRED);
            }
	   if(httpURLConnect.getResponseCode()==403)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_FORBIDDEN);
            }
	   if(httpURLConnect.getResponseCode()==404)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
           
        }
    } 
}
