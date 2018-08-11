package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTC {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

		WebElement userName = driver.findElement(By.id("userRegistrationForm:userName"));
		userName.sendKeys("Venkateshraja1993",Keys.TAB);
		
		WebElement password = driver.findElement(By.id("userRegistrationForm:password"));
		password.sendKeys("venkyraja",Keys.TAB);
		
		WebElement confirmPassword = driver.findElement(By.id("userRegistrationForm:confpasword"));
		confirmPassword.sendKeys("venkyraja",Keys.TAB);
		
		WebElement question = driver.findElement(By.id("userRegistrationForm:securityQ"));
		Select questDrop = new Select(question);
		questDrop.selectByVisibleText("What is your fathers middle name?");
		
		WebElement answer = driver.findElement(By.id("userRegistrationForm:securityAnswer"));
		answer.sendKeys("Moorthy");
		
		WebElement firstName = driver.findElement(By.id("userRegistrationForm:firstName"));
		firstName.sendKeys("Venkatesh",Keys.TAB);
		
		WebElement middleName = driver.findElement(By.id("userRegistrationForm:middleName"));
		middleName.sendKeys("Raja",Keys.TAB);
	
		WebElement lastName = driver.findElement(By.id("userRegistrationForm:lastName"));
		lastName.sendKeys("GR",Keys.TAB);
	
		WebElement gender = driver.findElement(By.xpath("//*[@type='radio' and @name='userRegistrationForm:gender' and @value='M']"));
		gender.click();
		
		WebElement martialStatus = driver.findElement(By.xpath("//*[@type='radio' and @name='userRegistrationForm:maritalStatus' and @value='U']"));
		martialStatus.click();
		
		WebElement date = driver.findElement(By.id("userRegistrationForm:dobDay"));
		Select dates = new Select(date);
		dates.selectByVisibleText("29");
		
		WebElement month = driver.findElement(By.id("userRegistrationForm:dobMonth"));
		Select months = new Select(month);
		months.selectByVisibleText("DEC");
				
		WebElement year = driver.findElement(By.id("userRegistrationForm:dateOfBirth"));
		Select years = new Select(year);
		years.selectByVisibleText("1993");
		
		
		WebElement occupation = driver.findElement(By.id("userRegistrationForm:occupation"));
		Select occupations = new Select(occupation);
		occupations.selectByVisibleText("Professional");
		
		
		WebElement country = driver.findElement(By.id("userRegistrationForm:countries"));
		Select countrys = new Select(country);
		countrys.selectByVisibleText("India");
		
		WebElement email = driver.findElement(By.id("userRegistrationForm:email"));
		email.sendKeys("venkateshraja1993@gmail.com",Keys.TAB);
		
		WebElement mobile = driver.findElement(By.id("userRegistrationForm:mobile"));
		mobile.sendKeys("9952491660");
		
		WebElement nationality = driver.findElement(By.id("userRegistrationForm:nationalityId"));
		Select nationalitys = new Select(nationality);
		nationalitys.selectByVisibleText("India");
		
		WebElement number = driver.findElement(By.id("userRegistrationForm:address"));
		number.sendKeys("10",Keys.TAB);
		
		WebElement street = driver.findElement(By.id("userRegistrationForm:street"));
		street.sendKeys("Gandhiji stree",Keys.TAB);
		
		WebElement area = driver.findElement(By.id("userRegistrationForm:area"));
		area.sendKeys("Madurai",Keys.TAB);
		 
		WebElement pinCode = driver.findElement(By.id("userRegistrationForm:pincode"));
		pinCode.sendKeys("625009",Keys.TAB,Keys.TAB);
		
		Thread.sleep(2000);
		
		WebElement city =  driver.findElement(By.id("userRegistrationForm:cityName"));
		Select citys = new Select(city);
		citys.selectByVisibleText("Madurai");

		Thread.sleep(2000);
		
		WebElement postOffice =  driver.findElement(By.id("userRegistrationForm:postofficeName"));
		Select postOffices = new Select(postOffice);
		postOffices.selectByVisibleText("Chintamani B.O");
		
		WebElement phone =  driver.findElement(By.id("userRegistrationForm:landline"));
		phone.sendKeys("9952491660");
		
		driver.close();
	}
	
}
