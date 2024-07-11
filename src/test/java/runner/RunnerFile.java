package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
	features = "src/test/resources",
	glue = {"stepDefinition", "configuration"},	
	plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
	monochrome = true
	
)

public class RunnerFile extends AbstractTestNGCucumberTests{

}
