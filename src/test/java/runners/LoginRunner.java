package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)  //add @RunWith import from Add JUnit 4library build path
@CucumberOptions (
		strict = true,	//this statement will suppress the warning in console
		features = "classpath:features",
		//features ="src\\test\\resources\\features\\CodeFiosLogin.feature",
		glue = "steps",	// referring to the package that holds all the step definition
		tags = "@CodeFios-Scenario1",
		monochrome = true,
		dryRun = false,
		plugin = {		//plugin means what type of report needs to generated
				"pretty",  //will give report in the console
				"html:target/reports/cucumber.html",
				"json:target/reports.cucumber.json"
		}
		)
public class LoginRunner {

}
