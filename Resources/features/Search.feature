Feature: As a user i want to have possibility to search products in the Shop

  Scenario: Check search functionality when searching for existing product.
    Given I open automationpractice website
    When I search for product with phrase "Faded Short Sleeve T-shirts"
    And I click enter
    Then I see product with title "Faded Short Sleeve T-shirts"

  Scenario: Check search functionality when searching with empty field.
    Given I open automationpractice website
    When I click search button
    Then I see product warning popup with phrase "Please enter a search keyword"

  Scenario: Check search functionality when searching for non exists product.
    Given I open automationpractice website
    When I search for product with phrase "For sure non existing product"
    And I click enter
    Then I see product warning popup with phrase "No results were found for your search" for searching "For sure non existing product"

  Scenario: Check search functionality when searching for existing product with name written by same large letters.
    Given I open automationpractice website
    When I search for product with phrase "FADED SHORT SLEEVE T-SHIRTS"
    And I click enter
    Then I see product with title "Faded Short Sleeve T-shirts"

  Scenario: Check search functionality when searching for existing product with name written by same small letters.
    Given I open automationpractice website
    When I search for product with phrase "faded short sleeve t-shirts"
    And I click enter
    Then I see product with title "Faded Short Sleeve T-shirts"

  Scenario: Check search functionality when searching for existing product with name written by alternately small and large letters.
    Given I open automationpractice website
    When I search for product with phrase "fAdEd ShOrT sLeEvE t-ShIrTs"
    And I click enter
    Then I see product with title "Faded Short Sleeve T-shirts"

  Scenario: Check search functionality when searching for existing product by part of product name.
    Given I open automationpractice website
    When I search for product with phrase "Faded Short"
    And I click enter
    Then I see product with title "Faded Short Sleeve T-shirts"

  Scenario: Check search functionality when searching for more than one existing products by part of product name.
    Given I open automationpractice website
    When I search for product with phrase "dress"
    And I click enter
    Then I see more than one product

  Scenario: Check search functionality when searching for existing product without white spaces between product name parts
    Given I open automationpractice website
    When I search for product with phrase "FadedShortSleeveT-shirts"
    And I click enter
    Then I see product warning popup with phrase "No results were found for your search" for searching "FadedShortSleeveT-shirts"