Feature: Customer Login

  Scenario: Login with valid data
    Given user is on customer login page
    And verify login page
    When user select on your name
    And user click on login button
    Then message will be display

  Scenario: Customer made deposit successfully
    Given user is on customer login page
    And verify login page
    When user select on your name
    And user click on login button
    When click on 'Deposit' button
    And input amount
    Then click on 'Deposit' button to deposit
    Then message will be display

  Scenario: Customer made deposit with invalid data
    Given user is on customer login page
    And verify login page
    When user select on your name
    And user click on login button
    When click on 'Deposit' button
    Then click on 'Deposit' button to deposit
    Then message will be display

  Scenario: Customer in transaction page
    Given user is on customer login page
    And verify login page
    When user select on your name
    And user click on login button
    When click on 'Transaction' button
    Then click on 'Reset' button
    When click on 'Back' button
    Then message will be display

  Scenario: Customer in transaction page
    Given user is on customer login page
    And verify login page
    When user select on your name
    And user click on login button
    When click on 'Transaction' button
    Then click on 'Reset' button
    When click on 'Back' button
    Then message will be display