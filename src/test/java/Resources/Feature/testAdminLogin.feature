Feature: Admin Login

  Scenario Outline: Login with valid data( Login successfully)
    Given administrators is on admin login page
    And   verify login page
    When  input email as <email>
    And   input password as <password>
    And   administrators click on login button
    Then  the <message> will be display
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
      | Admin           | password | Login unsuccessfully |
      | admingmail.com  | password | Login unsuccessfully |
      | Admin@gmailcom  | password | Login unsuccessfully |

  Scenario Outline: Login with invalid data, username = blank( Login unsuccessfully)
    Given administrators is on admin login page
    And verify login page
    And input password as <password>
    And administrators click on login button
    Then the <message> will be display
    Examples:
      | password | message |
      | password | ok      |

  Scenario Outline: Login with invalid data password = blank( Login unsuccessfully)
    Given administrators is on admin login page
    And verify login page
    When input email as <email>
    And administrators click on login button
    Then the <message> will be display
    Examples:
      | email           | message |
      | Admin@gmail.com | ok      |

  Scenario Outline: Login with invalid data, username = blank and password = blank( Login unsuccessfully)
    Given administrators is on admin login page
    And verify login page
    And administrators click on login button
    Then the <message> will be display
    Examples:
      | message |
      | ok      |