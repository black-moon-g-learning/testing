Feature: Update information about the country

  Scenario Outline: Successful country update with valid data in all fields
    Given login successfully
    And   navigate to countries category
    When  click on edit button
    Then  edit data on <name> field 1
    Then edit data on <description> field 2
    And  change image by choose file from computer device
    Then click on submit button in countries category
    Then the <message> will be display
    Examples:
      | name          | description | message |
      | Afghanistan 1 | message     | ok      |

  Scenario Outline: Unsuccessful country update with invalid data (name field = blank)
    Given login successfully
    And   navigate to countries category
    When  click on edit button
    Then edit name field = blank
    Then the <message> will be display
    Examples:
      | message |
      | ok      |

  Scenario Outline: Unsuccessful country update with invalid data (description field = blank)
    Given login successfully
    And   navigate to countries category
    When  click on edit button
    Then edit description field = blank
    Then the <message> will be display
    Examples:
      | message |
      | ok      |


