Feature: login functionallity

  Scenario: login funtionality
    Given user is on login page
    Then user enters username and password
    And user click on login button
    Then user is navigated to home page
