Feature: Bill Payment Functionality

  Scenario: Bill Pay

    Given Navigate to Parabank
    When Fill the username and password on login panel then click the login button
    Then Click the Bill Pay button
    Then Fill info of the pay form and click the send payment button
    And  Close the website
