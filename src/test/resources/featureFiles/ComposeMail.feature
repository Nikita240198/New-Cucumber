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
    And the User Clicks on Expiration Time Filed a list should get open

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

  @ComposeMailtag47
  Scenario: Verify Cancel Vc
    Given the user is logged in
    When the user clicks on the Compose Email button
    And The User click on VC icon the icon should get enabled
    Then Click on Cancel buttton Of Vc

  @ComposeMailtag48
  Scenario: Verify Cancel Vc
    Given the user is logged in
    When the user clicks on the Compose Email button
    And The User click on D2I icon the icon should get enabled
    Then Click on Cancel buttton Of D2I

  @ComposeMailtag49
  Scenario: Verify Open text Format
    Given the user is logged in
    When the user clicks on the Compose Email button
    And Enter the Body
    And On Hover Tooltip message should show for Text Format
    And On Click on text Format it should Open a popup

  @ComposeMailtag50
  Scenario: Verify Undo and Redo on Text format
    Given the user is logged in
    When the user clicks on the Compose Email button
    And Enter the Body
    And On Click on text Format it should Open a popup
    And On Hover Undo it should show tooltip with message
    And On Click on Undo it will undo action
    And On Hover Redo it will show tooltip with message
    And on click on Redo it will redo action

  @ComposeMailtag51
  Scenario: Check Title on Compose box
    Given the user is logged in
    When the user clicks on the Compose Email button
    Then Verify title is present

  @ComposeMailtag52
  Scenario: Check compose box get minimize
    Given the user is logged in
    When the user clicks on the Compose Email button
    And Verify Compose gets minimize
    Then On click on Maximize Compose should reopen

  @ComposeMailtag53
  Scenario: Make Compose Compact or maximize
    Given the user is logged in
    When the user clicks on the Compose Email button
    Then On click on Maximize Compose should reopen
    And On click on Maximize Compose should reopen

  @ComposeMailtag54
  Scenario: Close Compose Box
    Given the user is logged in
    When the user clicks on the Compose Email button
    And On click on Cross Compose box should get closed

  @ComposeMailtag55
  Scenario: Delete Compose Box
    Given the user is logged in
    When the user clicks on the Compose Email button
    Then On click on Delete icon Compose box should get closed

  @ComposeMailtag56
  Scenario: Open Attachment Popup
    Given the user is logged in
    When the user clicks on the Compose Email button
    And On click on Attachment icon system Files Popup should get open
    Then User Should be able to add attachmetns

  @ComposeMailtag57
  Scenario: Change Font type in Compose mail
    Given the user is logged in
    When the user clicks on the Compose Email button
    And On Click on text Format it should Open a popup
    Then Enter the Body
    And On Hover Font type should show Tooltip message
    And On Click on Font Type a dropdown should get open and  on select any option font type should get changed

  @ComposeMailtag58
  Scenario: Change Font size in Compose mail
    Given the user is logged in
    When the user clicks on the Compose Email button
    And On Click on text Format it should Open a popup
    And Enter the Body
    And On Hover Font size should show Tooltip message
    And On Click on Font size a dropdown should get open and  on select any option font size should get changed

  @ComposeMailtag59
  Scenario: Change Text in Bold
    Given the user is logged in
    When the user clicks on the Compose Email button
    And On Click on text Format it should Open a popup
    And Enter the Body
    And On Hover B Icon should show Tooltip message
    And On Click on B Icon  text should change to Bold

  @ComposeMailtag60
  Scenario: Change Text in Italic
    Given the user is logged in
    When the user clicks on the Compose Email button
    And On Click on text Format it should Open a popup
    And Enter the Body
    And On Hover I Icon should show Tooltip message
    Then On Click on I icon the text should change to Italic

  @ComposeMailtag61
  Scenario: Add Underline
    Given the user is logged in
    When the user clicks on the Compose Email button
    And On Click on text Format it should Open a popup
    And Enter the Body
    And On Hover U icon should show Tooltip message
    Then On Click on U icon the text should change to Underline

  @ComposeMailtag62
  Scenario: Add Strikethorough
    Given the user is logged in
    When the user clicks on the Compose Email button
    And On Click on text Format it should Open a popup
    And Enter the Body
    And On Hover S icon should show Tooltip message
    Then On Click on S icon the text should change to StrikeThrough

  @ComposeMailtag63
  Scenario: Change Allignment
    Given the user is logged in
    When the user clicks on the Compose Email button
    And On Click on text Format it should Open a popup
    And Enter the Body
    And On Hover Alignment icon should show Tooltip message
    And On Click on Alignment it should open a dropdown and Alignment should get changed

  @ComposeMailtag64
  Scenario: Add Bullets
    Given the user is logged in
    When the user clicks on the Compose Email button
    And On Click on text Format it should Open a popup
    And Enter the Body
    And On Hover Bullet List icon should show Tooltip message
    And On Click on Bullet List icon it should add bullets

  @ComposeMailtag65
  Scenario: Add Number List
    Given the user is logged in
    When the user clicks on the Compose Email button
    And On Click on text Format it should Open a popup
    And Enter the Body
    And On Hover Number List icon should show Tooltip message
    And On Click on Number List icon it should add Number

  @ComposeMailtag66
  Scenario: Add Indent
    Given the user is logged in
    When the user clicks on the Compose Email button
    And On Click on text Format it should Open a popup
    And Enter the Body
    And On Hover indent icon should show Tooltip message
    And On Click on indent  icon it should add moves toward right

  @ComposeMailtag67
  Scenario: Add Outdent
    Given the user is logged in
    When the user clicks on the Compose Email button
    And On Click on text Format it should Open a popup
    And Enter the Body
    And On Click on indent  icon it should add moves toward right
    And On Hover outdent icon should show Tooltip message
    And On Click on outdent List icon it should moves toward left

  @ComposeMailtag68
  Scenario: Add BlockQuote
    Given the user is logged in
    When the user clicks on the Compose Email button
    And On Click on text Format it should Open a popup
    And Enter the Body
    And On Hover BLockquote icon should show Tooltip message
    And On Click on BLockquote icon it should add BlockQuote

  @ComposeMailtag69
  Scenario: Clear Text Format
    Given the user is logged in
    When the user clicks on the Compose Email button
    And On Click on text Format it should Open a popup
    And Enter the Body
    And On Click on BLockquote icon it should add BlockQuote
    And On Hover Tx icon should show Tooltip message
    And On Click on Tx icon it should add clear latest Text format

  @ComposeMailtag70
  Scenario: Close Text Format
    Given the user is logged in
    When the user clicks on the Compose Email button
    And On Click on text Format it should Open a popup
    And On Click on text Format it should Open a popup

 @ComposeMailtag71
  Scenario: Create Draft
  Given the user is logged in
    When the user clicks on the Compose Email button
    And the user enters an email address in the To field
    Then On click on Enter email id should get enter
    And On click on Cross Compose box should get closed
    
    @ComposeMailtag72
     Scenario: Sent Bulk Mail
    Given the user is logged in
    When Sent Email in bulk
    
    
    
    
    