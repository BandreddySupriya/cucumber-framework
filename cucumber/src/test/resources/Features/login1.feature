Feature: login functionallity

  Scenario: login funtionality
    Given user is on login page
    Then user enters username and password
    And user click on login button
    Then user is navigated to home page

 #Scenario: Admin funtionality
    Given user click admin tab
    Then user verify the name of the Textbox
    And user enters the text in textbox
    Then user select the role in userrole dropdown
    And user click on search button
