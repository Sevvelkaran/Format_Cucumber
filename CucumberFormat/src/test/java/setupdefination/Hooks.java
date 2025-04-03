package setupdefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.Scenario;
import utilities.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public static void setUp() {
		HelperClass.setUpDriver();
	}
	@After
	public static void teardown(Scenario scenario) {
		HelperClass.teardown();
	}
}