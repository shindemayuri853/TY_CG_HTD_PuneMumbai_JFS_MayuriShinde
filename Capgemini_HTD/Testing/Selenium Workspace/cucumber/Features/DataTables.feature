Feature: Testing the login Feature

Scenario: Testing the login Feature with Valid Data
Given the user has loaded the application in the browser
When the user enters username in the username textbox
|Usernames|Passwords|
|admin|trainee|
And the user enters textbox in the password textbox
|manager|
And the user clicks on the login button
Then the dashboard page must be displayed 

