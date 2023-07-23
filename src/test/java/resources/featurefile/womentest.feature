Feature: Women Test

  Scenario: Verify The Sort By Product Name Filter
    Given I am on home page
    When Mouse Hover on Women Menu
    And Mouse Hover on Tops
    And Click on Jackets
    Then Select Sort By filter “Product Name" Verify the products name display in alphabetical order