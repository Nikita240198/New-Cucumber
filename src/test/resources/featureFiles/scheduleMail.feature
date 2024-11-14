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
Feature: Scheduled email in drafts after sent

  @scheduleTag1
  Scenario: View scheduled mail list
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user enters an email address in the To field
    And On click on Enter email id should get enter
    And Enter the subject
    And Enter the Body
    And Verify schedule send dropdown gets open on click
    And the user should be able to Save
    And the user clicks on the Send button without entering any content
    And On click on Drafts user should navigate to draft screen
    Then Schedule mail should get present in list

  @scheduleTag2
  Scenario: Open existing scheduled mail
    Given the user is logged in
    And On click on Drafts user should navigate to draft screen
    Then On Click first scheduled mail

  @scheduleTag3
  Scenario: Edit existing scheduled mail by changing date
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On Click first scheduled mail
    And Click on Edit it should open Copmose box with prefilled content
    And Click on Edit Saved schedule Date and Time in compose
    And Open date picker
    And user should be able to select any future date from the date picker
    And the user should be able to Save
    Then the user clicks on the Send button without entering any content

  @scheduleTag4
  Scenario: Edit existing scheduled mail by changing time
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On Click first scheduled mail
    And Click on Edit it should open Copmose box with prefilled content
    And Click on Edit Saved schedule Date and Time in compose
    And Open date picker
    And user should be able to select any future date from the date picker
    And Open Time picker
    And the user should be able to select any future Time from the Calendar
    And the user should be able to Save
    Then the user clicks on the Send button without entering any content

  @scheduleTag5
  Scenario: Verify User Edit Schedule mail with expiry date
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On Click first scheduled mail
    And Click on Edit it should open Copmose box with prefilled content
    And The User click on Set to Expire button a popup should get Open
    And the User Clicks on Expiration Time Filed a list should get open
    And User Should be able to select expiration time for one hour
    And the user should be able to Save
    Then the user clicks on the Send button without entering any content

  @scheduleTag6
  Scenario: Verify User Edit Schedule mail with VC enabled
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On Click first scheduled mail
    And Click on Edit it should open Copmose box with prefilled content
    And The User click on VC icon the icon should get enabled
    Then the user clicks on the Send button without entering any content

  @scheduleTag7
  Scenario: Verify User Edit Schedule mail with D2I enabled
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On Click first scheduled mail
    And Click on Edit it should open Copmose box with prefilled content
    And The User click on D2I icon the icon should get enabled
    Then the user clicks on the Send button without entering any content

  @scheduleTag8
   #got failed Jira Ticket EFR-955
  Scenario: Verify User Edit Schedule mail With attachment
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On Click first scheduled mail
    And Click on Edit it should open Copmose box with prefilled content
    And On click on Attachment icon system Files Popup should get open
    And User Should be able to add attachmetns
    And the user clicks on the Send button without entering any content
    Then On Click first scheduled mail

  @scheduleTag9
   #got failed Jira Ticket EFR-955
  Scenario: Verify User Edit Schedule mail With all content
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On Click first scheduled mail
    And Click on Edit it should open Copmose box with prefilled content
    And user enters multiple email address in TO field
    And Edit Subject of schedule mail
    And Edit Body Content
    And the user clicks on the Send button without entering any content
    Then On Click first scheduled mail

  @scheduleTag10
  Scenario: Verify User minimize scheduled mail
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On Click first scheduled mail
    And Click on Edit it should open Copmose box with prefilled content
    And Verify Compose gets minimize
    Then On click on Maximize Compose should reopen

  @scheduleTag11
  Scenario: Verify Scheduled mail got tucked
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On Click first scheduled mail
    And Click on Edit it should open Copmose box with prefilled content
    And On click on Maximize Compose should reopen
    Then On click on Maximize Compose should reopen
    
    
  @scheduleTag12
  Scenario: Verify Close Scheduled mail popup 
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On Click first scheduled mail
    And Click on Edit it should open Copmose box with prefilled content  
    Then On click on Cross Compose box should get closed 
    
    
 @scheduleTag13
  Scenario: Verify Close Scheduled mail popup 
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On Click first scheduled mail
    And Click on Edit it should open Copmose box with prefilled content  
   Then On click on Delete icon Compose box should get closed   
   
   
    @scheduleTag14
  Scenario: Verify Cancel Scheduled mail 
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On Click first scheduled mail
    And User click on cancel 
    Then Schedule mail gets removed from scheduled list and gets addded in draft list
   
   
   @scheduleTag15
  Scenario: Verify close Shcedule mail list dropdown
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And User click on dropdown icon 
    Then Click on dropdown icon again
   
   
   
   @scheduleTag16
  Scenario: Verify detail dropdown of schedule mail and Open Compose From user
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
     And On Click first scheduled mail
    And User click on detail dropdown icon of schedule mail
    Then User Click on compose icon should Open Compose
    
   
    @scheduleTag17
  Scenario: Verify detail dropdown of schedule mail and copy mail if of From recipient
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
     And On Click first scheduled mail
    And User click on detail dropdown icon of schedule mail
    And User Copied recipient email address of From user
    Then User click on detail dropdown icon of schedule mail
   
   
    @scheduleTag18
  Scenario: Verify detail dropdown of schedule mail and Open Compose From to user
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
     And On Click first scheduled mail
    And User click on detail dropdown icon of schedule mail
    And User Click on compose icon of To then should Open Compose
    
   
 
@scheduleTag19
  Scenario: Verify detail dropdown of schedule mail and copy mail if of From recipient
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
     And On Click first scheduled mail
    And User click on detail dropdown icon of schedule mail
    And User Copied recipient email address of To user
    Then User click on detail dropdown icon of schedule mail
    
    
    @scheduleTag20
  Scenario: Verify cancel schedule mail after open scheduled mail
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
     And On Click first scheduled mail
     And Click on Edit it should open Copmose box with prefilled content 
     And Click on cross icon
     And the user clicks on the Send button without entering any content
     Then Schedule mail gets removed from scheduled list and gets addded in draft list
    
    
    
    