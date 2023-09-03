@flightAppUI02  @UI
Feature: US
  Background:
    Given User goes to url

  @TC02_01
    Scenario Outline: enters same city
    Then User enters same city "<from city>" into from box
    Then User enters same city "<to city>" into to box
    When User displayed empty boxes
    Examples:
      | from city   | to city     |
      | Istanbul    | Istanbul    |
      | New York    | New York    |
      | London      | London      |
      | Paris       | Paris       |
      | Tokyo       | Tokyo       |
      | Sydney      | Sydney      |
      | Los Angeles | Los Angeles |
      | Chicago     | Chicago     |
      | Beijing     | Beijing     |
      | Dubai       | Dubai       |
      | Singapore   | Singapore   |
      | Hong Kong   | Hong Kong   |
      | Frankfurt   | Frankfurt   |
      | Madrid      | Madrid      |
      | Rome        | Rome        |




