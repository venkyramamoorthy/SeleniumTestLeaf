package pageswithcucpomimplementation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import wdMethods.SeMethods;

public class LoginPageimpl extends SeMethods {

	public LoginPageimpl()
	{
		PageFactory.initElements(driver, this);
	}

	/*@FindBy(id="username")
	WebElement enterUserName;

	@FindBy(id="password")
	WebElement enterpassword;

	@FindBy(className="decorativeSubmit")
	WebElement submit;*/
	
	@Given("Open_Browser_Maximize_window_Load_URL_Set_Timeout as (.*)")
	public LoginPageimpl openbrowser(String url)
	{
		startApp("chrome", url);
		return this;
	}
	@And("Enter Usernames as (.*)")
	public LoginPageimpl Enterusername(String uname)
	{
		WebElement enterUserName=locateElement("id","username");
		type(enterUserName,uname);
		//driver.findElementById("username").sendKeys(uname);
		return this;
	}
	@And("Enter Passwords as (.*)")
	public LoginPageimpl EnterPassword(String pwd)
	{
		WebElement enterpassword=locateElement("id","password");
		type(enterpassword,pwd);
		//driver.findElementById("password").sendKeys(pwd);
		return this;
	}
	@And("Click Submitbutton")
	public HomePage clicksubmit()
	{
		WebElement submit =locateElement("class","decorativeSubmit");
		click(submit);
		//driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}	
}