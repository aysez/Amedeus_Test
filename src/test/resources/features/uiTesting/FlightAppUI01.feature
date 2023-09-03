@flightAppUI01  @UI
Feature: Check website
  Background:
    Given User goes to url

  @TC01_01
  Scenario: TC01
    When User verifies url
    When User displayed from header
    Then User click from box
    Then User enters departing city into from box
    When User displayed to header
    Then User click to box
    Then User enters destination city into to box
    When User displayed attention note

  @TC01_02  @afterScenarioFinish
  Scenario: Negative Scenario
    Then User enters negative departing info into from box
    Then User enters negative destination info into to box
