@All
Feature: Cart

  @positive @cart
  Scenario: User Remove Product
    Given user in the product page
    And user add products to cart
    And user clik the cart icon
    When user in the cart page
    And user clik Remove button
    Then user success remove product in cart page

  @positive @cart
  Scenario: User Clik Continue Shopping button
    Given user in the product page
    And user clik the cart icon
    When user in the cart page
    And user clik Continue Shopping button
    Then user redirected to the product page

  @positive @cart
  Scenario: User Checkout with One Product
    Given user in the product page
    And user add one product to cart
    And user clik the cart icon
    When user in the cart page
    And user clik Checkout button
    Then user redirected to Checkout page

  @positive @cart
  Scenario: User Checkout with Two Products
    Given user in the product page
    And user add products to cart
    And user clik the cart icon
    When user in the cart page
    And user clik Checkout button
    Then user redirected to Checkout page

  @negative @cart
  Scenario: User Checkout without Product
    Given user in the product page
    And user clik the cart icon
    When user in the cart page
    And user clik Checkout button
    Then user failed redirect to checkout page and get error massage