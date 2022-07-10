@parameter
Feature: Facebook login page

#Background:
	#Given Open Facebook application

  @no_para
  Scenario: Scenario have no parameter
    #Given Open Facebook application
    When Input to Username textbox
    And Input to Password textbox
    And Click to Submit button
    #And Close application
    
  @para-mark  
  Scenario: Scenario have parameter
    #Given Open Facebook application
    When Input to Username textbox with "automationtest@gmail.com"
    And Input to Password textbox with "123456"
    And Click to Submit button
    # Then verify...
    And Close application
    
  @multiple_para  
  Scenario: Scenario have parameter
    #Given Open Facebook application
    When Input to Username with "automationtest@gmail.com" and Password with "123456"
    And Click to Submit button
    # Then verify...
    And Close application
    
  