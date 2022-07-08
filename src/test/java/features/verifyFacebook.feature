@login
Feature: Facebook login page

  @no_para
  Scenario: Scenario have no parameter
    Given Open Facebook application
    When Input to Username textbox
    And Input to Password textbox
    And Click to Submit button
    And Close application
    
  @para-mark  
  Scenario: Scenario have parameter
    Given Open Facebook application
    When Input to Username textbox with "automationtest@gmail.com"
    And Input to Password textbox with "123456"
    And Click to Submit button
    # Then verify...
    And Close application
    
  @multiple_para  
  Scenario: Scenario have parameter
    Given Open Facebook application
    When Input to Username with "automationtest@gmail.com" and Password with "123456"
    And Click to Submit button
    # Then verify...
    And Close application
    
  @datatable_step  
  Scenario outline: Datatable with <Username>
    Given Open Facebook application
     When Input to Username and Password
      | Username   | Password   | 
      | <UserName> | <Password> | 
      And Click to Submit button
      And Close application
  
    Examples: 
      | Username               | Password | 
      | automation@hotmail.com | 123456   | 


  @datatable_scenario @data_driven_testing  
  Scenario Outline: Datatable in Scenario
    Given Open Facebook application
    When Input to Username textbox with "<Username>"
    And Input to Password textbox with "<Password>"
    And Click to Submit button
    And Close application
    
     Examples:
      | Username   | Password   |
      | automation01@gmail.com  | 123456 |  
      | automation02@gmail.com  | 123456 |  
     
    