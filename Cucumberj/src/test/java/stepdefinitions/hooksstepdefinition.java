package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class hooksstepdefinition 
{

	@When("^Enter the url for hooks$")
	public void enter_the_url_for_hooks() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Url entered");
	}

	@Then("^Respective page is displayed for hooks$")
	public void respective_page_is_displayed_for_hooks() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("WebPage loaded");
	}

}
