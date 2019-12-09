Feature: Testing the login Feature

Scenario Outline: Testing the login Feature with Valid Data
Given the user has loaded the application in the browser
When the user enters "<username>" in the username
And the user enters "<password>" in the password
And the user clicks on the login button
Then the dashboard page must be displayed 

Examples:
|username|password|
|admin|manager|
|trainee|trainee|