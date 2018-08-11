package util;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
public abstract class Reporter {
	public static ExtentHtmlReporter html;
	public static ExtentReports extent;
	public static ExtentTest test, suiteTest;

	// This method creates the HTML report
	//@BeforeSuite
	public void beginResult() {
		html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(false);		
		extent = new ExtentReports();		
		extent.attachReporter(html);
	}
	// This method creates the test case level report in HTML
	//@BeforeClass
	public ExtentTest startTest(String testCaseName, String testDescription) {
		suiteTest = extent.createTest(testCaseName, testDescription);
		return suiteTest;
	}
	// This method create entry for every test case iteration
	//@BeforeMethod
	public ExtentTest startTestIteration(String iteration, String author, String category ) {	
		test = suiteTest.createNode(iteration);
		test.assignAuthor(author);
		test.assignCategory(category);
		return test;
	}
	// This method create entry for every step SeMethods
	public void reportStep(String desc,String status) {
		if (status.equalsIgnoreCase("pass")) {
			test.pass(desc);
		} else if (status.equalsIgnoreCase("fail")) {
			test.fail(desc);
			//throw new RuntimeException();
		}else if (status.equalsIgnoreCase("warning")) {
			test.warning(desc);
		}
	}
	// This method create the HTML report finally
	//@AfterMethod
	public void endResult() {
		extent.flush();
	}
}