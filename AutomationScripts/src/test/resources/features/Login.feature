@All
Feature: Login

  @positive @login1
  Scenario: Success login with valid username and password
    Given user enter the swag labs in browser
    When user in login page
    And user input the valid username
    And user input the valid password
    And user click the login button
    Then user redirected to product page

  @negative @login
  Scenario: Failed Login with invalid username and password
    Given user enter the swag labs in browser
    When user in login page
    And user input the invalid username
    And user input the invalid password
    And user click the login button
    Then user get error massage

  @negative @login
  Scenario: Failed Login with valid username and invalid password
    Given user enter the swag labs in browser
    When user in login page
    And user input the valid username
    And user input the invalid password
    And user click the login button
    Then user get error massage

  @negative @login
  Scenario: Failed Login with invalid username and valid password
    Given user enter the swag labs in browser
    When user in login page
    And user input the invalid username
    And user input the valid password
    And user click the login button
    Then user get error massage

  @negative @login
  Scenario: Failed Login without fill username and password
    Given user enter the swag labs in browser
    When user in login page
    And user click the login button
    Then user get error massage

  @negative @login
  Scenario: Failed Login with valid username and without fill password
    Given user enter the swag labs in browser
    When user in login page
    And user input the valid username
    And user click the login button
    Then user get error massage

  @negative @login
  Scenario: Failed Login without fill username and valid password
    Given user enter the swag labs in browser
    When user in login page
    And user input the valid password
    And user click the login button
    Then user get error massage
