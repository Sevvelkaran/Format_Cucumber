package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin = {"pretty",
		"json:target/cucumber-reports/Cucumber.json",
		"html:target/cucumber-reports/Cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
features="src/test/resources/com/feature/login.feature",
glue="setupdefination")
public class runnerTestNG extends AbstractTestNGCucumberTests {

}