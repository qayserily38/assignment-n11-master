@FirstCase
Feature: First Case

  Scenario: First Example
    Given user goes to the web site store url
    When user clicks all store
    And user picks S from the list on the page
    And user clicks one of the stores listed below
    Then user should see the selected store