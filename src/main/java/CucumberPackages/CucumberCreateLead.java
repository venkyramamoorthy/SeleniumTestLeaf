package CucumberPackages;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="./src/main/java/FeatureFiles/login.feature",glue= {"Steps","hooks"},monochrome=true,tags="@god")
public class CucumberCreateLead {

}
