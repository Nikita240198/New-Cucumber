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
    And Click on Sign in Button
    Then a validation message should be displayed indicating that the email ID is incorrect

  @Logintag2
  Scenario: empty username field
    When the user clicks backspace in the username field until it's empty
    And Click on Sign in Button
    Then a validation message for empty username should be displayed

  @Logintag3
  Scenario: Validation message for username field  with only spaces
    When the user enters only spaces in the username field
    And Click on Sign in Button
    Then a validation message for username with only spaces should be displayed

  @Logintag4
  Scenario: Validation message for invalid password
    When the user enters an invalid password
    And Click on Sign in Button
    Then a validation message for invalid password should be displayed

  @Logintag5
  Scenario: empty password field
    When the user clicks backspace in the password field until it's empty
    And Click on Sign in Button
    Then a validation message for empty password should be displayed

  @Logintag6
  Scenario: Validation message for password with only spaces
    When the user enters only spaces in the password field
    And Click on Sign in Button
    Then a validation message for password with only spaces should be displayed

  @Logintag7
  Scenario: Successful login with valid credentials
    When the user enters valid Username
    And user enters vaild Password
    And Click on Sign in Button
