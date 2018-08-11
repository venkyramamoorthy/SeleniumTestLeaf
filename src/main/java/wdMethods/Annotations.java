package wdMethods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Excelfilemaintanace.ReadExcelAdvance;

public class Annotations extends SeMethods {
	public String excelname,testname,testdesc,author,category,iteration;
	//Reporter function 
	@BeforeSuite
	public void brforesuite()
	{
		beginResult();
		//property();
	}
	@BeforeClass
	public void beforeclass()
	{
		startTest(testname,testdesc);
	}

	//@BeforeMethod(groups= {"smoke","regression","sanity"})
	@BeforeMethod
	@Parameters({"url","username","password"})
	public void login(String url,String username,String password)
	{
		startTestIteration(iteration,author,category) ;
		startApp("chrome", url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, username);
		WebElement elePassword = locateElement("id","password");
		type(elePassword, password);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement link = locateElement("linktext","CRM/SFA");
		click(link);
	}
	//@AfterMethod(groups= {"smoke","regression","sanity"})
	@AfterMethod
	public void close()
	{
		closeAllBrowsers();
	}

	@AfterSuite
	public void aftersuite()
	{
		endResult();
	}
	@DataProvider(name="data")
	public Object[][] data() throws IOException
	{
		ReadExcelAdvance excelcall = new ReadExcelAdvance();
		Object[][] outputvalue = excelcall.excelread(excelname);
		return outputvalue;
	}

}
