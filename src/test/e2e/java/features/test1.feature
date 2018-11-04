Feature: ECSD technical test

  @Test1
  Scenario: Open http://localhost:3000 and click on 'Render the Challenge' button
    Given the user is on the application home page
    When the user click on RENDER THE CHALLENGE button
    Then the Array Challenge should be displayed

  @Test2
  Scenario: Create 3 arrays out of the given table rows
    Given the user is on the application home page
    And the user click on RENDER THE CHALLENGE button
    When the Array Challenge should be displayed
    Then the table rows are extracted in an array
    And displayed on screen

  @Test3
  Scenario: Find the answer for all the 3 arrays and submit
    Given the user is on the application home page
    And the user click on RENDER THE CHALLENGE button
    When the Array Challenge should be displayed
    Then calculate and submit the answers