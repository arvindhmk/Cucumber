package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class taggedhooksteps 
{

	@Given("^First step$")
	public void first_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("First step");   
	}

	@When("^Second step$")
	public void second_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
		System.out.println("Second step");
	}

	@Then("^Third step$")
	public void third_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println("Third step");
	}


}
