Feature: Free CRM Login Feature

Scenario: Free CRM Login Test Scenario
#BDD without example keyword
Given user is already on login Page
When title of login page is Free CRM
Then user enters "arahim" and "arahim"
And user clicks on login button
Then user is on home page