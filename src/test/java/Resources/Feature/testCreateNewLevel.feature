Feature: Create new level

  Scenario Outline: Create new level successfully with all fields
    Given login successfully
    When navigate to Level category
    And click on create new button
    Then enter data on <description> field 1
    And enter data on <name> field 2
    Then choose image by choose file from computer device
    And click on submit button
    Then the <message> will be display
    Examples:
      | description                | name    | message |
      | Game so good, happy, happy | Advance | ok      |