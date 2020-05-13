Feature: Open google
@Opengoogle @Closegoogle
Scenario: Open google in browser

Given Open browser

When Enter the url

Then Respective page is displayed

#@Closegoogle
Scenario: close browser

Given browser open

When url entered as google

Then close the browser