@SecondCase
Feature: Second Case

  Scenario: Second Example
    Given user goes to base url
    When user search for iPhone with using search bar
    Then user should see the entered value is listed as iPhone
    When user adds the first and the last product listed on the page to the cart
    And user goes to cart page as a guest user
    Then user should see the checkout page