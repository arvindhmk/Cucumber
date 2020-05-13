package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class backgroundstepdef 
{

@Given("^student completed higher seondarr regular$")
public void student_completed_higher_seondarr_regular()
{
    // Write code here that turns the phrase above into concrete actions
 
	System.out.println("Student completed higher secondary regular");
}

@Given("^student completed higher secondary part time$")
public void student_completed_higher_secondary_part_time()
{
    // Write code here that turns the phrase above into concrete actions
    
	System.out.println("Student completed higher secondary part time");
}

@Given("^Student applied for medical exam$")
public void student_applied_for_medical_exam()
{
    // Write code here that turns the phrase above into concrete actions
    
	System.out.println("Applied for medical");
}

@When("^Student cleared the exam$")
public void student_cleared_the_exam()
{
    // Write code here that turns the phrase above into concrete actions
   System.out.println("cleared the exam");
	
}

@Then("^The student is eligible for joining medical$")
public void the_student_is_eligible_for_joining_medical()
{
    // Write code here that turns the phrase above into concrete actions
    
	System.out.println("eligible for joining medicine");
}

@Given("^Student applied for engineering course$")
public void student_applied_for_engineering_course()
{
    // Write code here that turns the phrase above into concrete actions
  
	System.out.println("Applied for engineering");
}

@When("^Student got good cut off$")
public void student_got_good_cut_off()
{
    // Write code here that turns the phrase above into concrete actions
    
	System.out.println("good cut off");
}

@Then("^Student is eligible for joining any engineering institute$")
public void student_is_eligible_for_joining_any_engineering_institute()
{
    // Write code here that turns the phrase above into concrete actions
    
	System.out.println("eligble for joining the engineering");
}
	
}
