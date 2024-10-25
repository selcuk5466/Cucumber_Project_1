Feature: Register Functionality

  @RegressionTest @SmokeTest
  Scenario: Register with username and password

    Given Navigate to Parabank
    When Click the register button on the website
    Then Fill info of the register form and click on the register button of form

