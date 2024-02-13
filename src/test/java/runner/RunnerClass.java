package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/Mind/eclipse-workspace/BlinklyCucumber/src/test/resources/featureFiles", 
					glue = "stepDefination", 
					dryRun = false, 
					monochrome = true, 
					strict = true, 
					tags = "@tag", 
					plugin = {
		"json:/Users/Mind/eclipse-workspace/BlinklyCucumber/target/cucumber/1.json"
							})

public class RunnerClass {

}
