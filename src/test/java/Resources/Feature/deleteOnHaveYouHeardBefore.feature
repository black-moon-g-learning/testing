Feature: Delete the news on Have you heard before? category

  Scenario Outline: Delete the news successfully in HYHB?
    Given login successfully
    When  navigate to the HYHB category
    And   click on delete button
    Then  click on confirm button
    Then the <message> will be display
    Examples:
      | message |
      | ok      |