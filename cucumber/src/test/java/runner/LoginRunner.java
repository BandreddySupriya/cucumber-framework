package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/login1.feature",
glue= {"stepsdefination","hooks"},

plugin= {"pretty","html:target/ExtentReport/extent-report.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome=true
		
		
		
		)


public class LoginRunner {

}
