@dataTable
Feature: Facebook login page

  @datatable_step  
  Scenario Outline: Datatable with email <Username>
    #Given Open Facebook application
     When Input to Username and Password
      | Username   | Password   | 
      | automation01@hotmail.com | 123466 | 
      | automation02@hotmail.com | 123466 | 
      | automation03@hotmail.com | 123466 | 
      And Click to Submit button
      #And Close application
  
    Examples: 
      | Username               | Password | 
      | automation@hotmail.com | 123456   | 


  @datatable_scenario @data_driven_testing  
  Scenario Outline: Datatable in Scenario
    #Given Open Facebook application
    When Input to Username textbox with "<Username>"
    And Input to Password textbox with "<Password>"
    And Click to Submit button
    #And Close application
    
     Examples:
      | Username   | Password   |
      | automation01@gmail.com  | 123456 |  
      | automation02@gmail.com  | 123456 |  
     
    