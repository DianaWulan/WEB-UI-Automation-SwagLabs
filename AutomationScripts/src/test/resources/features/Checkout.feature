@All
Feature: Checkout

  @positive @checkout @valid
  Scenario: User fill all Checkout: Your Information
    Given user to checkout page
    And user input the first name
    And user input the last name
    And user input zip postal code
    When user clik continue button
    Then user redirect to checkout overview page

  @negative @checkout @firstname
  Scenario: User fill all Checkout: Your Information with Invalid Fist Name in number
    Given user to checkout page
    And user input the invalid num first name
    And user input the last name
    And user input zip postal code
    When user clik continue button
    Then user get error massage checkout

  @negative @checkout @firstname
  Scenario: User fill all Checkout: Your Information with Invalid First Name have character
    Given user to checkout page
    And user input the invalid char first name
    And user input the last name
    And user input the zip postal code
    When user clik continue button
    Then user get error massage checkout

  @negative @checkout @firstname
  Scenario: User fill all Checkout: Your Information without fill First Name
    Given user to checkout page
    And user input the last name
    And user input the zip postal code
    When user clik continue button
    Then user get error massage checkout

  @negative @checkout @lastname
  Scenario: User fill all Checkout: Your Information with Invalid Last Name in number
    Given user to checkout page
    And user input the first name
    And user input the invalid num last name
    And user input zip postal code
    When user clik continue button
    Then user get error massage checkout

  @negative @checkout @lastname
  Scenario: User fill all Checkout: Your Information with Invalid Last Name have character
    Given user to checkout page
    And user input the first name
    And user input the invalid char last name
    And user input the zip postal code
    When user clik continue button
    Then user get error massage checkout

  @negative @checkout @lastname
  Scenario: User fill all Checkout: Your Information without fill Last Name
    Given user to checkout page
    And user input the first name
    And user input the zip postal code
    When user clik continue button
    Then user get error massage checkout

  @negative @checkout @zip/postalcode
  Scenario: User fill all Checkout: Your Information with Invalid Zip/Postal Code in word
    Given user to checkout page
    And user input the first name
    And user input the last name
    And user input invalid zip postal code
    When user clik continue button
    Then user get error massage checkout

  @negative @checkout @zip/postalcode
  Scenario: User fill all Checkout: Your Information with Invalid Zip/Postal Code have character
    Given user to checkout page
    And user input the first name
    And user input the last name
    And user input invalid char zip postal code
    When user clik continue button
    Then user get error massage checkout

  @negative @checkout @zip/postalcode
  Scenario: User fill all Checkout: Your Information with null Zip/Postal
    Given user to checkout page
    And user input the first name
    And user input the last name
    When user clik continue button
    Then user get error massage checkout

  @negative @checkout @allnull
  Scenario: User not fill Checkout: Your Information
    Given user to checkout page
    When user clik continue button
    Then user get error massage checkout

  @positive @checkout1 @cancel
  Scenario: User click Cancel button
    Given user to checkout page
    When user clik cancel button
    Then user redirected to cart page


    #Overview Page
  @positive @checkout1 @overview
  Scenario: User click Cancel button
    Given user to checkout overview page
    When user clik cancel button in checkout overview page
    Then user redirected to the product page

  @positive @checkout @overview
  Scenario: User click Finish button
    Given user to checkout overview page
    When user clik finish button
    Then user redirected to the checkout complete page

    #Complete page
  @positive @checkout @complete
  Scenario: User click Back Home button
    Given user to checkout complate page
    When user clik Back Home button
    Then user redirected to the product page



