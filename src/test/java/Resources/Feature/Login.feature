Feature: User Login

  Scenario Outline: Login with valid credentials
    Given User navigates to Login page
    When User enters valid email address <email>
    And Enters valid password <password>
    And Clicks on Login button
    Then The message is displayed
    Examples:
      | email               | password  |
      | hanhvanqb@gmail.com | Vanhanh1! |

  Scenario Outline: Login with invalid credentials
    Given User navigates to Login page
    When User enters invalid email address <email>
    And Enters invalid password <password>
    And Clicks on Login button
    Then The message is displayed
    Examples:
      | email               | password  |
      | hanhvan             | Van       |