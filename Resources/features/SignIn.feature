Feature: As a user i want to have possibility to sign in in to Shop

  Scenario: Check sign in functionality if user sign in with correct username and password
    Given I open automationpractice website
    When I click on Sign in link
    And I fill username with phrase "karolina.gorzow@gmail.com"
    And I fill password with phrase "abc123"
    And I click on signIn button
    Then I see user account page

  Scenario: Check sign in functionality if user sign in with correct password and
  incorrect email
    Given I open automationpractice website
    When I click on Sign in link
    And I fill username with phrase "incorrectEmail"
    And I fill password with phrase "abc123"
    And I click on signIn button
    Then I see sign in error popup

  Scenario: Check sign in functionality if user sign in with correct username and incorrect password
    Given I open automationpractice website
    When I click on Sign in link
    And I fill username with phrase "karolina.gorzow@gmail.com"
    And I fill password with phrase "incorrectPassword"
    And I click on signIn button
    Then I see sign in error popup

  Scenario: Check sign in functionality if user sign in with incorrect username and incorrect password
    Given I open automationpractice website
    When I click on Sign in link
    And I fill username with phrase "incorrectEmail"
    And I fill password with phrase "incorrectPassword"
    And I click on signIn button
    Then I see sign in error popup

  Scenario: Check sign in functionality if user sign in with correct username but without filling password field.
    Given I open automationpractice website
    When I click on Sign in link
    And I fill username with phrase "karolina.gorzow@gmail.com"
    And I click on signIn button
    Then I see sign in error popup

  Scenario: Check sign in functionality if user sign in with correct password but without filling username field.
    Given I open automationpractice website
    When I click on Sign in link
    And I fill password with phrase "abc123"
    And I click on signIn button
    Then I see sign in error popup

  Scenario: Check sign in functionality if user sign in without filling username and password fields.
    Given I open automationpractice website
    When I click on Sign in link
    And I click on signIn button
    Then I see sign in error popup