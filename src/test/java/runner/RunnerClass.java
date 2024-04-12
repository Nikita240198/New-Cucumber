package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/Mind/eclipse-workspace/BlinklyCucumber/src/test/resources/featureFiles", 
					glue = "stepDefinition", 
					dryRun = false, // step definition are not defined than set to true, if set to false than it will execute with browser
					monochrome = true, 
					strict = true, 
					tags = {"@ComposeMailtag29"}, 
					plugin = {
		"json:/Users/Mind/eclipse-workspace/BlinklyCucumber/target/cucumber/1.json"
							})

public class RunnerClass {

	
}
