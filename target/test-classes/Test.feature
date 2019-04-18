
@tag
Feature: Title of your feature
  I want to use this template for my feature file
  @tag1 @smoke @regression
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    
  @tag11 @smoke @regression
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    

  @tag3  @regression
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with "<name>"
    When I check for the "<value>" in step
    Then I verify the "<status>" in step
    @dev
    Examples: 
      | name  | value   | status  |
      | dev1 |     dev5 | success |
      | dev2 |     dev7 | Fail    |

      
     @Uat 
    Examples: 
      | name  | value | status  |
      | uat1 |     uat5 | success |
      | uat2 |    uat 7 | Fail    |