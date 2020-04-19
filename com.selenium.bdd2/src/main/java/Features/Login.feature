Feature: Login 

Scenario: Login Scenario
  Given I am on the login page
  When I enter username in usrename field
  And I enter password in password field
  And I click on Logon Button
  Then I should be logged and redirected to home page 
  Then Close the Borwser