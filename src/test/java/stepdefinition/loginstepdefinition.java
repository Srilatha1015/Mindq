package stepdefinition;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Allpages.Login;
import BasePP.Genericmethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepdefinition extends Login{
	Genericmethods obj = new Genericmethods();
	
	@Given("User should be on login page")
	public void user_should_be_on_login_page() throws IOException {
		Browserlauch();
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(obj.takescreenshot());
	    
	}

	@When("User enters username {string}")
	public void user_enters_username(String Username) throws IOException {
		Enter_Email(Username);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(obj.takescreenshot());
	  
	}

	@When("User enters password {string}")
	public void user_enters_password(String Pswd) throws IOException {
		Enter_password(Pswd);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(obj.takescreenshot());
	 
	}

	@When("Clicks on Submit button")
	public void clicks_on_submit_button() throws IOException {
		button_click();
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(obj.takescreenshot());

	}

	@Then("User should be able to login")
	public void user_should_be_able_to_login() {

	}



	
}
