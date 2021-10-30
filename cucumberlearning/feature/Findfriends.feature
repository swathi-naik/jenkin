Feature: Facebook Findfriends page Scenarios


Scenario: Naviagte to facebook home page


Given I am on facebook page
When  I Click on Login button after entering a credential
Then  I Navigate to facebook home  page
Given I am on facebook home page
When  I Click on Findfriends button
Then  I Navigate to Findfriends page
