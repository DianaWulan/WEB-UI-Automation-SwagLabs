@All
Feature: Remove Product

  @positive @remove
  Scenario: Success Remove a Product
  Given user in the product page
  When user click Add To Cart button on one product
  And user click Remove button on one product
  Then user success remove product

  @positive @remove
  Scenario: Success Remove Multi Product
  Given user in the product page
  When user click Add To Cart button on first, second and third product
  And user click Remove button on first, second and third product
  Then user success remove all product