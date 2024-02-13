#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Navigation and Theme Switching on Landing Screen

  @tag1
  Scenario: User navigates to the Landing screen and interacts with elements
    Given the user is on the Landing screen
    When they click on the Blinkly logo at the top right corner
    Then the screen should refresh

  @tag2
  Scenario: User interacts with theme switching functionality
    Given the default theme should be light mode
    When the user clicks on the dark mode icon
    Then the page should switch to dark mode
    When the user clicks on the light mode icon
    Then the page should switch to light mode
    
  @tag3
  Scenario: User clicks on the Access button to navigate to the login screen
    When they click on the Access button
    Then they should be redirected to the login screen

