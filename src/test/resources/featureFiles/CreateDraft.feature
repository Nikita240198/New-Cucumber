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
@Drafttag
Feature: Draft screen features

  @Drafttag1
  Scenario: Create Normal draft
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the email compose editor should open
    And the user enters an email address in the To field
    And On click on Enter email id should get enter
    And Enter the subject
    And Enter the Body
    And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    Then Created Draft should be present in list

  @Drafttag2
  Scenario: Open First draft Mail
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the email compose editor should open
    And the user enters an email address in the To field
    And On click on Enter email id should get enter
    And Enter the subject
    And Enter the Body
    And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    Then User Open Forst Draft in list

  @Drafttag3
  Scenario: Create draft with schedule time and recipient in Cc Field
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the email compose editor should open
    And the user enters an email address in the To field
    And On click on Enter email id should get enter
    And Enter the subject
    And Enter the Body
