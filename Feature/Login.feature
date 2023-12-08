
#Sample Feature Definition Template

Feature: This is login page
  I want to successfully login

@Login
  Scenario: Login Page
    Given User should be on login page
    When User enters username "manvi15.challagundla@gmail.com"
    And User enters password "M@nvitha15"
    And Clicks on Submit button
    Then User should be able to login

