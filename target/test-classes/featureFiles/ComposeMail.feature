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
@ComposeMail
Feature: Email Composition and Alerts
  I want to use this template for my feature file

  @ComposeMailtag1
  Scenario: User Navigation and Composing Email
    Given the user is logged in
    When the user clicks on the Compose Email button
    Then the email compose editor should open

  @ComposeMailtag2
  Scenario: Sending Email without Content
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user clicks on the Send button without entering any content
    Then an alert popup should be displayed

  @ComposeMailtag3
  Scenario: Close Alert Popup
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user clicks on the Send button without entering any content
    And the user clicks on the OK button
    Then the alert popup should be closed

  @ComposeMailtag4
  Scenario: Closing Alert Popup when user clicks anywhere
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user clicks on the Send button without entering any content
    And the user clicks anywhere outside the popup
    Then the alert popup should be closed

  @ComposeMailtag5
  Scenario: Entering Email Address
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user enters an email address in the To field
    Then On click on Enter email id should get enter

  @ComposeMailtag6
  Scenario: Entering Email Address
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user enters few letters of email address in the To field
    Then the autosuggestion should work

  @ComposeMailtag7
  Scenario: Removing Email Address
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user enters few letters of email address in the To field
    And the user clicks on the backspace key
    And the user enters an email address in the To field
    Then On click on Enter email id should get enter
    And the user clicks on the backspace key
    Then the email address should be removed

  @ComposeMailtag8
  Scenario: Editing Email Address
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user enters an email address in the To field
    And On click on Enter email id should get enter
    And the user double clicks on the email address
    Then the email address should be editable

  @ComposeMailtag9
  Scenario: Canceling Email Address Entry
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user enters an email address in the To field
    And On click on Enter email id should get enter
    When the user clicks on the Cancel button
    Then the email address should be removed
