package hooks;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;
public class Hooks extends SeMethods
{
	public static String iteration="Leads";
	public static String author="venky";
	public static String category="god";			
	@Before
	public void Before(Scenario Sc)
	{
		beginResult();
		startTest(Sc.getName(),Sc.getId());
		//startTestIteration(iteration,author,category) ;
		test = suiteTest.createNode(iteration);
		test.assignAuthor(author);
		test.assignCategory(category);
		//System.out.println(Sc.getName());
		//System.out.println(Sc.getId());
	}
	@After
	public void after(Scenario Sc)
	{
		closeAllBrowsers();
		endResult();
		//System.out.println(Sc.getStatus());
		//System.out.println(Sc.isFailed());
		//driver.close();*/
	}
}