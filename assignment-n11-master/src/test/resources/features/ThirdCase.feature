@ThirdCase
Feature: Third Case

  Scenario: Third Example
    Given user goes to base url
    When user search for telefon with using search bar
    And user picks second brand listed on the page
    Then user should see second brand
    When user sorted items by using number of comments
    Then user should see the items are sorted in the correct order
    When user picks free delivery on the page
    Then user should see all products are listed with free delivery
