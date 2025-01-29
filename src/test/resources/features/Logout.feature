@All
Feature: Logout

  @positive @logout
    Scenario: User Success Logout
    Given user in the product page
    When user clik Menu button
    And user clik logout button
    Then user success logout