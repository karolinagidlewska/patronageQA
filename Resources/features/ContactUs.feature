Feature: As a user i want to have possibility to contact Shop

  Scenario: Check error pop-up if user send empty contact us form
    Given I open automationpractice website
    When I click on ContactUS link
    And I click on Send button
    Then I will see error popup