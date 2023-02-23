Feature: Admin Login

  Scenario Outline: Login with valid data( Login successfully)
    Given administrators is on admin login page
    And verify login page
    When input email as <email>
    And input password as <password>
    And administrators click on login button
    Then the <message> will be display
    Examples:
      | email           | password | message            |
      | Admin@gmail.com | password | Login successfully |

  Scenario Outline: Login with invalid data( Login unsuccessfully)
    Given administrators is on admin login page
    And verify login page
    When input email as <email>
    And input password as <password>
    And administrators click on login button
    Then the <message> will be display
    Examples:
      | email           | password | message              |
      | admin@gmail.com | password | Login unsuccessfully |
      | Admin@gmail.com | Password | Login unsuccessfully |
      |                 | password | Login unsuccessfully   |
      | admin@gmail.com |          | Login unsuccessfully   |
      |                 |          | Login unsuccessfully   |