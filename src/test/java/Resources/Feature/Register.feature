Feature: User Registration

  Background:
    Given User navigates to Register Account page

  Scenario Outline: Register with mandatory fields
    When User enters valid name <name>
    And Enters valid email <email>
    And Enters valid the password <password>
    And Clicks on SignUp button
    Then The message is displayed
    Examples:
      | name | email               | password  |
      | Hanh | hanhvanqb@gmail.com | Vanhanh1! |


  Scenario: Register without providing any fields
    When User do not enter details into any fields
    And Clicks on SignUp button
    Then The message is displayed