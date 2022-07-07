Feature: Facebook login page

  @displayed
  Scenario: Verify login page
    Given Open Facebook application
    Then Verify email textbox is displayed
    And verify password textbox is displayed
    And Close application