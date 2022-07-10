Feature: Register and Login
I want to use this template for my feature file

@register_login
  Scenario Outline: Register to system and login
    Given Open register page
     When Input to First Name textbox with "<First Name>"
      And Input to Last Name textbox with "<Last Name>"
      And Input to Email textbox with "<Email Address>"
      And Input to Password textbox with "<Password>"
      And Input to ConfirmPassword textbox "<Confirm Password>"
      And Click to Register button
     Then Dashboard page is displayed
     When Click on Logout link 
     Then Home page is displayed  
     When Click on Login link
      And Input to Email textbox with "<Email Address>"
      And Input to Password textbox with "<Password>"
  	  And Click to login button
  	 Then Dashboard page is displayed
  
    Examples: 
      | First Name | Last Name | Email Address            | Password | Password Confirm | 
      | Khan Auto  | Nguyen    | automation01@hotmail.com | 123456   | 123456           | 


 
