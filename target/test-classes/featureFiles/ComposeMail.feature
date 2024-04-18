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
  Scenario: Entering Email Address with augesstion
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

  @ComposeMailtag10
  Scenario: User: interacts with CC field in Email Composition
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user clicks on the CC field
    Then the CC field should open for input

  @ComposeMailtag11
  Scenario: User: Enter Email in Cc Field
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user clicks on the CC field
    And the user enters an email address in the CC field
    Then On click on Enter email id should get enter

  @ComposeMailtag12
  Scenario: User: Remove Email in Cc Field
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user clicks on the CC field
    And the user enters an email address in the CC field
    And On click on Enter email id should get enter
    And the user clicks on backspace after entering an email address in the CC field
    Then the email address should be removed

  @ComposeMailtag13
  Scenario: User: Autosuggetion Email in Cc Field
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user clicks on the CC field
    And the user enters few letters of email address in the Cc field
    And On click on Enter email id should get enter
    Then the autosuggestion should work

  @ComposeMailtag14
  Scenario: User: Remove Email From Cancel button
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user clicks on the CC field
    And the user enters an email address in the CC field
    And On click on Enter email id should get enter
    When the user clicks on the Cancel button
    Then the email address should be removed from the CC field

  @ComposeMailtag15
  Scenario: User: Edit Email in Cc Field
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user clicks on the CC field
    And the user enters an email address in the CC field
    And On click on Enter email id should get enter
    When the user double clicks on an email address in the CC field
    Then the email address should become editable

  @ComposeMailtag16
  Scenario: User: interacts with Bcc field in Email Composition
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user clicks on the Bcc field
    Then the Bcc field should open for input

  @ComposeMailtag17
  Scenario: User: Enter Email in Bcc Field
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user clicks on the Bcc field
    And the user enters an email address in the Bcc field
    Then On click on Enter email id should get enter

  @ComposeMailtag18
  Scenario: User: Remove Email in Bcc Field
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user clicks on the Bcc field
    And the user enters an email address in the Bcc field
    And On click on Enter email id should get enter
    And the user clicks on backspace after entering an email address in the Bcc field
    Then the email address should be removed

  @ComposeMailtag19
  Scenario: User: Autosuggestion Email in Bcc Field
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user clicks on the Bcc field
    And the user enters few letters of email address in the Bcc field
    Then On click on Enter email id should get enter

  @ComposeMailtag20
  Scenario: User: Remove Email From Cancel button in Bcc Field
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user clicks on the Bcc field
    And the user enters an email address in the Bcc field
    And On click on Enter email id should get enter
    When the user clicks on the Cancel button
    Then the email address should be removed from the Bcc field

  @ComposeMailtag21
  Scenario: Edit Email in Bcc Field
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user clicks on the Bcc field
    And the user enters an email address in the Bcc field
    And On click on Enter email id should get enter
    When the user double clicks on an email address in the Bcc field
    Then the Bccemail address should become editable

  @ComposeMailtag22
  Scenario: Verify Subject placehoder is present or not
    Given the user is logged in
    When the user clicks on the Compose Email button
    Then Veify Placeholder of subject field

  @ComposeMailtag23
  Scenario: send mail successfully
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user enters an email address in the To field
    And On click on Enter email id should get enter
    And Enter the subject
    And Enter the Body
    Then the user clicks on the Send button without entering any content

  @ComposeMailtag24
  Scenario: Verify Hover on Schedule Send
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user enters an email address in the To field
    And On click on Enter email id should get enter
    And Enter the subject
    Then Verify on Hover it should show tooltip for Schedule send

  @ComposeMailtag25
  Scenario: Verify saving todays date
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user enters an email address in the To field
    And On click on Enter email id should get enter
    And Enter the subject
    And Verify schedule send dropdown gets open on click
    And the current date should be displayed in the date picker
    And the current time should be displayed in the date picker
    Then the user should be able to Save

  @ComposeMailtag26
  Scenario: Verify selecting future date
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user enters an email address in the To field
    And On click on Enter email id should get enter
    And Enter the subject
    And Verify schedule send dropdown gets open on click
    And Open date picker
    Then the user should be able to select any future date from the date picker

  @ComposeMailtag27
  Scenario: Verify unable to select past date
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user enters an email address in the To field
    And On click on Enter email id should get enter
    And Enter the subject
    And Verify schedule send dropdown gets open on click
    And Open date picker
    Then the user should not be able to select any past date from the date picker

  @ComposeMailtag28
  Scenario: Verify saving todays Time
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user enters an email address in the To field
    And On click on Enter email id should get enter
    And Enter the subject
    And Verify schedule send dropdown gets open on click
    And Open Time picker
    Then the current time should be displayed in the date picker
    And the user should be able to select the current Date and Time on Save

  @ComposeMailtag29
  Scenario: Verify selecting future Time
    Given the user is logged in
    When the user clicks on the Compose Email button
    #And the user enters an email address in the To field
    #And On click on Enter email id should get enter
    #And Enter the subject
    And Verify schedule send dropdown gets open on click
    And Open Time picker
    Then the user should be able to select any future Time from the Calendar

  @ComposeMailtag30
  Scenario: Verify unable to select past Time
    Given the user is logged in
    When the user clicks on the Compose Email button
    #And the user enters an email address in the To field
    #And On click on Enter email id should get enter
    #And Enter the subject
    And Verify schedule send dropdown gets open on click
    And Open Time picker
    Then the user should not be able to select any past Time from the Calendar

  @ComposeMailtag31
  Scenario: Verify the Time picker closes when clicking outside
    Given the user is logged in
    When the user clicks on the Compose Email button
    #And the user enters an email address in the To field
    #And On click on Enter email id should get enter
    #And Enter the subject
    And Verify schedule send dropdown gets open on click
    And Open Time picker
    Then clicking outside the Time picker should close it

  @ComposeMailtag32
  Scenario: schedule time is getting save or not
    Given the user is logged in
    When the user clicks on the Compose Email button
    And Verify schedule send dropdown gets open on click
    And the user should be able to Save
    Then On save The time and date should get display on Compose Box

  @ComposeMailtag33
  Scenario: schedule time is getting Edit or not
    Given the user is logged in
    When the user clicks on the Compose Email button
    And Verify schedule send dropdown gets open on click
    And the user should be able to Save
    And On Click on Edit the schedule box should reopen
    And Open date picker
    Then the user should be able to select any future date from the date picker
    And Open Time picker
    And the user should be able to select any future Time from the Calendar
    Then the user should be able to Save

  @ComposeMailtag34
  Scenario: schedule time is getting Canceled or not
    Given the user is logged in
    When the user clicks on the Compose Email button
    And Verify schedule send dropdown gets open on click
    And Open Time picker
    And the user should be able to Save
    Then On Click on Cross icon the scheedule time should get canceled

  @ComposeMailtag35
  Scenario: Verify Set to expire hover message
    Given the user is logged in
    When the user clicks on the Compose Email button
    And user Hover on it should show tootlip with message

  @ComposeMailtag36
  Scenario: Verify Set to expire Popup Gets Open on Click
    Given the user is logged in
    When the user clicks on the Compose Email button
    Then The User click on Set to Expire button a popup should get Open

  @ComposeMailtag37
  Scenario: Verify to open Expiration dropdown
    Given the user is logged in
    When the user clicks on the Compose Email button
    Then The User click on Set to Expire button a popup should get Open
    And the User Clicks onExpiraation Time Filed a list should get open

  @ComposeMailtag38
  Scenario: Verify to Select Expiration time from dropdown for one hour
    Given the user is logged in
    When the user clicks on the Compose Email button
    Then The User click on Set to Expire button a popup should get Open
    And the User Clicks on Expiration Time Filed a list should get open
    Then User Should be able to select expiration time for one hour

  @ComposeMailtag39
  Scenario: Verify user save expiry time with password
    Given the user is logged in
    When the user clicks on the Compose Email button
    Then The User click on Set to Expire button a popup should get Open
    And the User Clicks on Expiration Time Filed a list should get open
    And User Should be able to select expiration time for one hour
    And User should be able Enter Password
    And user should be able to Save
    Then On save Expiration date and time should get displayed

  @ComposeMailtag40
  Scenario: Verify user save expiry time without password
    Given the user is logged in
    When the user clicks on the Compose Email button
    Then The User click on Set to Expire button a popup should get Open
    And the User Clicks on Expiration Time Filed a list should get open
    And User Should be able to select expiration time for one hour
    And user should be able to Save
    Then On save Expiration date and time should get displayed

  @ComposeMailtag41
  Scenario: Verify user should be able to cancel Set To Expire Popup
    Given the user is logged in
    When the user clicks on the Compose Email button
    And The User click on Set to Expire button a popup should get Open
    Then On Click on Cancel the popup should get closed

  @ComposeMailtag42
  Scenario: Verify Edit Popup is getting open or not
    Given the user is logged in
    When the user clicks on the Compose Email button
    And The User click on Set to Expire button a popup should get Open
    And the User Clicks on Expiration Time Filed a list should get open
    And User Should be able to select expiration time for one hour
    And User should be able Enter Password
    And user should be able to Save
    Then On Click Edit The same Set to expiry popup should get open with saved value

  @ComposeMailtag43
  Scenario: Verify user is able to edit Expiration date and time
    Given the user is logged in
    When the user clicks on the Compose Email button
    And The User click on Set to Expire button a popup should get Open
    And the User Clicks on Expiration Time Filed a list should get open
    And User Should be able to select expiration time for one hour
    And User should be able Enter Password
    And user should be able to Save
    Then On Click Edit The same Set to expiry popup should get open with saved value
    When the User Clicks on Expiration Time Filed a list should get open
    And User Should be able to select expiration time for one week
    And User should be able Change Password
    Then user should be able to Save

  @ComposeMailtag44
  Scenario: Verify saved time and date is getting canceled
    Given the user is logged in
    When the user clicks on the Compose Email button
    And The User click on Set to Expire button a popup should get Open
    And the User Clicks on Expiration Time Filed a list should get open
    And User Should be able to select expiration time for one hour
    And User should be able Enter Password
    And user should be able to Save
    Then On click on cross icon saved expiring time should get removed

  @ComposeMailtag45
  Scenario: Verify Send VC mail
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user enters an email address in the To field
    And On click on Enter email id should get enter
    And Enter the subject
    And Enter the Body
    And On Hover Tooltip message should show for Vc
    And The User click on VC icon the icon should get enabled
    And On click on VC icon again the icon should get disabled
    And The User click on VC icon the icon should get enabled
    Then the user clicks on the Send button without entering any content

  @ComposeMailtag46
  Scenario: Verify D2I mail
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the user enters an email address in the To field
    And On click on Enter email id should get enter
    And Enter the subject
    And Enter the Body
    And On Hover Tooltip message should show for D2I icon
    And The User click on D2I icon the icon should get enabled
    And On click on D2I icon again the icon should get disabled
    And The User click on D2I icon the icon should get enabled
    Then the user clicks on the Send button without entering any content
