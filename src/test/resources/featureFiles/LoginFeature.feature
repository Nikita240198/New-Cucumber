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
@Logintag
Feature: User Accesses Login Page and Enters Credentials

  @Logintag1
  Scenario: Validation message for incorrect username/email
    Given the user is on the login page
    When the user enters an incorrect email ID in the username field
    And Click on Sign in button
    Then a validation message should be displayed

  @Logintag2
  Scenario: empty username field
    Given the user is on the login page
    And the user clicks in the username field and it is empty
    And Click on Sign in button
    Then a validation message should be displayed

  @Logintag3
  Scenario: Validation message for username field  with only spaces
    Given the user is on the login page
    When the user enters only spaces in the username field
    And Click on Sign in button
    Then a validation message should be displayed

  @Logintag4
  Scenario: Validation message for invalid password
    Given the user is on the login page
    When the user enters an invalid password
    And Click on Sign in button
    Then a validation message should be displayed

  @Logintag5
  Scenario: empty password field
    Given the user is on the login page
    When the user clicks and the password field is empty
    And Click on Sign in button
    Then a validation message should be displayed

  @Logintag6
  Scenario: Validation message for password with only spaces
    Given the user is on the login page
    When the user enters only spaces in the password field
    And Click on Sign in button
    Then a validation message should be displayed

  @Logintag7
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid Username
    And user enters vaild Password
    And Click on Sign in button

  @Logintag8
  Scenario: Verify Password is enabled on click eye cion 
    Given the user is on the login page
    When user enters vaild Password
    And user should be able to view password
   
    @Logintag9
     Scenario: Verify Password is disabled on click eye cion 
    Given the user is on the login page
    When user enters vaild Password
    Then user should be able to view password
    And password is getting disabled or not
    
    @Logintag10
    Scenario: Verify user select the slider only 
    Given the user is on the login page
    When the user slides the slider to the given number
    And Click on Sign in button
    Then a validation message should be displayed
