package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	 @Given("^User is on NetBanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
	       //code to navigate to login url
		 System.out.println("navigated to login url");
	    }

	 @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	        System.out.println("user logged in with following credentials: "+ strArg1 +" "+strArg2);
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	       //home page validation 
	    	System.out.println("home page validated");
	    }

	    @Then("^Cards are displayed are \"([^\"]*)\"$")
	    public void cards_are_displayed_are(String arg1) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	       
	    
	    	System.out.println(arg1);
}}
