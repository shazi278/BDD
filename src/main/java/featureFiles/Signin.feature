Feature: Application login
Scenario: Homepage default login 


Given User is on  Facebook Homepage
When User login with username and password
Then User clicks on Signin button
Then sucessful login with Username and password
Then User is on Facebook home page