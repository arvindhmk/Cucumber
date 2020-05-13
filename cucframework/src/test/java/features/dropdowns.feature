#Author:Arvindh
Feature: Practicing the dropdown element

Scenario: Test dropdown1
Given Navigate to TestLeaf "http://www.leafground.com/pages/Dropdown.html" page
When Automate the dropdown field using index

Then Automate the dropdown field using text
Then Automate the dropdown field using value


Then Get number of dropdown options
Then AutomateMultiple selection
