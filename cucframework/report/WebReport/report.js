$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("dropdowns.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author:Arvindh"
    }
  ],
  "line": 2,
  "name": "Practicing the dropdown element",
  "description": "",
  "id": "practicing-the-dropdown-element",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Test dropdown1",
  "description": "",
  "id": "practicing-the-dropdown-element;test-dropdown1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Navigate to TestLeaf \"http://www.leafground.com/pages/Dropdown.html\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Automate the dropdown field using index",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Automate the dropdown field using text",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Automate the dropdown field using value",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Get number of dropdown options",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "AutomateMultiple selection",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.leafground.com/pages/Dropdown.html",
      "offset": 22
    }
  ],
  "location": "dropdownstepdefinition.navigate_to_TestLeaf_page(String)"
});
formatter.result({
  "duration": 1442030000,
  "error_message": "java.lang.NullPointerException\r\n\tat stepdefinitions.dropdownstepdefinition.navigate_to_TestLeaf_page(dropdownstepdefinition.java:29)\r\n\tat ✽.Given Navigate to TestLeaf \"http://www.leafground.com/pages/Dropdown.html\" page(dropdowns.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "dropdownstepdefinition.automate_the_dropdown_field_using_index()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "dropdownstepdefinition.automate_the_dropdown_field_using_text()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "dropdownstepdefinition.automate_the_dropdown_field_using_value()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "dropdownstepdefinition.get_number_of_dropdown_options()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "dropdownstepdefinition.automatemultiple_selection()"
});
formatter.result({
  "status": "skipped"
});
});