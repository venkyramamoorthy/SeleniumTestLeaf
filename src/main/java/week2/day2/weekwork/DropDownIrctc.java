package week2.day2.weekwork;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDownIrctc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		int i=0;
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		WebElement country =  driver.findElementById("userRegistrationForm:countries");
		Select value = new Select(country);
		List <WebElement> countrydrop = value.getOptions();
		//int size = countrydrop.size();
		
	    
		for(WebElement dropallvalues : countrydrop)
		{
			System.out.println(dropallvalues.getText());
		}
		
		for(WebElement dropall : countrydrop)
		{
			if(dropall.getText().startsWith("E"))
			{
				i++;
			}
			if(i==2)
			{
				System.out.println(dropall.getText());
				dropall.click();
			}
		}
	}
}