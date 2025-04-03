package setupdefination;

import org.testng.Assert;

import actions.HomePageActions;
import actions.LoginPageActions;
import utilities.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefinitions {
	LoginPageActions objLogin=new LoginPageActions();
	HomePageActions objHomePage=new HomePageActions();
	

	@Given("User is on HRMLogin Page {string}")
	public void user_is_on_hrm_login_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    HelperClass.openPage(string);
	}
	@When("User enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    objLogin.login();
	}
	@Then("User should be able to login successfully and new page open")
	public void user_should_be_able_to_login_successfully_and_new_page_open() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(objHomePage.getHomePageText().contains("Dashboard"));
	}
}