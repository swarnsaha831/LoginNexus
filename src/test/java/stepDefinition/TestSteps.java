package stepDefinition;

import configuration.Hooks;
import utilities.WebDriverUtil;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class TestSteps {

	public WebDriver driver;
	private WebDriverUtil util; 
	
	@Given("User naviagtes to one of the designated websites")
	public void user_naviagtes_to_one_of_the_designated_websites() {
		util = new WebDriverUtil(Hooks.getDriver());
		driver = util.getDriver();
	}

	@When("User enters the respective login info")
	public void user_enters_the_respective_login_info() {
	    util.enterInfo();
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() throws InterruptedException {
	    util.login();
	}

	@Then("User should have access to their account")
	public void user_should_have_access_to_their_account() {
		util.checkTest();
	}
	
}
