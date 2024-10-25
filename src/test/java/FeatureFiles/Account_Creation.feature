Feature: Account Creation Functionality

  @RegressionTest @SmokeTest
  Scenario: New Account Creation

    Given Navigate to Parabank
    When Fill the username and password on login panel then click the login button
    Then Click on the open new Account button
    And Select the account type and click the open new account button
