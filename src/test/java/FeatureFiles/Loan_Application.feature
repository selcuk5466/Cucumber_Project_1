Feature: Loan Application Functionality

  Background:
    Given Navigate to Parabank
    When Fill the username and password on login panel then click the login button

  @RegressionTest
  Scenario: Loan Application

      Then Click on the request loan button
      And Fill the loan info the form on right and click on the apply now button
      Then Should be show result message
