package CucumberPackages;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/main/java/FeatureFiles/OverAllScenarios.feature",glue={"pageswithcucpomimplementation","hooks"},monochrome=true,tags="@god")
public class JunitRun {

}
