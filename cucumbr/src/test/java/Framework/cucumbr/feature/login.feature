@sprint1 
Feature: TO validate the login functionality 

Background: 
	Given Navigate to utest url 
	When Click on login link 
	
	#@userstory001
	#Scenario: Validate the negative login functionality
	#And Click on sign in button
	#Then Validate the error message "Invalid username or password."
	
	
@userstory002 
Scenario Outline: Validate the negative login functionality 
	And Enter email "<EMAIL>" 
	And Click on sign in button 
	Then Validate the error message "<EXPECTED MESSAGE>" 
	
	Examples: 
	
		|EMAIL|EXPECTED MESSAGE|
		|school@gmail.com|Invalid username or password.|
		|college@gmail.com|Invalid username or password.|