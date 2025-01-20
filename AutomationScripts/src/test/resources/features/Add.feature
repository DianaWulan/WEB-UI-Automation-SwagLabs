@All
Feature: Add To Cart

  @positive @add
  Scenario: Success Add To Cart One Product
    Given user in the product page
    When user click Add To Cart button on one product
    Then user success add one product

  @positive @add
  Scenario: Success Add To Cart Three Product
    Given user in the product page
    When user click Add To Cart button on first product
    And user click Add To Cart button on second product
    And user click Add To Cart button on third product
    Then user success add three product