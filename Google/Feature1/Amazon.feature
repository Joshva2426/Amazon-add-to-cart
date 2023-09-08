Feature: Test Amazon cart functionality

  Scenario: Validate Amazon search is working
    Given I Open the Browser
    And I Navigate to the URL
    When I search for a product
    And search results is displayed
    Then select a product
    And I navigate to nextpage
    And click a add to cart
