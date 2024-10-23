Feature: Account Creation Functionality

  Scenario: New Account Creation

    Given Navigate to Parabank
    When Fill the username and password on login panel then click the login button
    Then Click on the open new Account button
    And Select the account type and click the open new account button
    Then Close the website