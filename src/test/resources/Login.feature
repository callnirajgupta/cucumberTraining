@login
Feature: Title of your feature
  I want to use this template for my feature file

@LoginAndLogout_ExamplesParameters 
Scenario Outline: login with ExamplesParameters
Given User "<User>" with password "<Password>" login into the application with correct credentials ExamplesParameters
Then User successfully log out of the application after clicking on log out button
Examples:
|User      |Password|
|callnirajgupta@gmail.com|password1| 

  
