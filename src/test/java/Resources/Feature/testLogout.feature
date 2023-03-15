Feature: Admin Sign Out

  Scenario Outline: Sign out successfully when clicking the Sign Out button
    Given login successfully
    When click on sign out button
    Then the <message> will be display
    Examples:
      | message               |
      | Sign out successfully |