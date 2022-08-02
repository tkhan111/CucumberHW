package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	//	features = "src\\test\\java\\features\\TechFiosLogin.feature",
		features = "classpath:features",
		glue = "steps", //step definition from the loginStepDefinition
		tags = "@ExampleScenario1",
		monochrome = true, //when monochrome is true it  will give a pretty report
		dryRun = false, //its going through the code but not executing the steps. it will check initialization errors or syntax error
		plugin = { 
				"pretty", //report is on the console
				"html:target/cucumber", 
				"json:target/cucumber.json", }

)
public class LoginRunner {

}

