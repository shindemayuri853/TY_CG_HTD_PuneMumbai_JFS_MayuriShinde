Feature: Testing the login Feature

Scenario: Testing the login Feature with Valid Data
Given the user has loaded the application in the browser
When the user enter the valid username
And the user enter the valid password
And the user clicks on the login button
Then the dashboard page must be displayed 