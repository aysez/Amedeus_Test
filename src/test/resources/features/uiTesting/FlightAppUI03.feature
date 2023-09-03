@flightAppUI03  @UI
Feature: US
  Background:
    Given User goes to url

  @TC03_01
  Scenario Outline: enters city info
    Then User enters city "<city>" into from box
    Then User enters city into to box

    Examples:
      | city        |  |
      | Istanbul    |  |
      | New York    |  |
      | London      |  |
      | Paris       |  |
      | Tokyo       |  |
      | Sydney      |  |
      | Los Angeles |  |
      | Chicago     |  |
      | Beijing     |  |
      | Dubai       |  |
      | Singapore   |  |
      | Hong Kong   |  |
      | Frankfurt   |  |
      | Madrid      |  |
      | Rome        |  |
