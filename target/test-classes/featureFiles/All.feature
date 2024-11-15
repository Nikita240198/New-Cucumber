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

@AllMail
Feature: Verify Dashboad Features
  I want to use this template for my feature file

  @Alltag1
  Scenario: User Navigation and Composing Email
    Given the user is logged in
    Then On  Dashboard screen should get open with All selected
    And It should display Both email and chats in email list

  @Alltag2
  Scenario: User Open Chat or email
    Given the user is logged in
    When User click on first tile or any tile it should get open in Third Pane

  @Alltag3
  Scenario: Sent single mail to spam From Header
    Given the user is logged in
    When On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message
    And On click on Spam icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should move to spam

  @Alltag4
  Scenario: Cancel mail to spam
    Given the user is logged in
    When On click on checkbox mail it should select mail
    And On click on Spam icon it should open a Popup with confirmation messgae
    Then On click on Cancel the mail should not move to spam

  @Alltag5
  Scenario: Delete single mail From Header
    Given the user is logged in
    When On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message for Delete
    And On click on Delete icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @Alltag6
  Scenario: Cancel mail to get Delete
    Given the user is logged in
    When On click on checkbox mail it should select mail
    And On click on Delete icon it should open a Popup with confirmation messgae
    Then On clikc on Cancel the mail should not get Deleted

  @Alltag7
  Scenario: verify Mark as read from Header
    Given the user is logged in
    When On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message for mark as read/unread
    Then On click On Mailbox icon The email shoudld mark as read or unread

  @Alltag8
  Scenario: verify Add label without any value select
    Given the user is logged in
    When On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message for Add Lable
    And On click On Add Lable it should open popup
    And Click on Apply Lable
    Then It should show validation message
    

  @Alltag9
  Scenario: verify Add label from popup
    Given the user is logged in
    When On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    Then create new label

  @Alltag10
  Scenario: Select Label from List
    Given the user is logged in
    When On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    And Select label From List
    Then Click on Apply Lable

  @Alltag11
  Scenario: Search and apply with or without labels in list
    Given the user is logged in
    When On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    And Search Label
    And Select label From List
    Then Click on Apply Lable

  @Alltag12
  Scenario: Cancel labelPopup
    Given the user is logged in
    When On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    Then Close the Popup

  @Alltag13
  Scenario: Verify Select All and sent to spam
    Given the user is logged in
    When user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message
    And On click on Spam icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should move to spam

  @Alltag14
  Scenario: Verify Select All and sent to Delete
    Given the user is logged in
    When user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message for Delete
    And On click on Delete icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @Alltag15
  Scenario: Verify Select All and Mark As Read Unread
    Given the user is logged in
    When user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message for mark as read/unread
    Then On click On Mailbox icon The email shoudld mark as read or unread

  @Alltag16
  Scenario: Verify Select All and Add label
    Given the user is logged in
    When user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message for Add Lable
    And On click On Add Lable it should open popup
    And Select label From List
    Then Click on Apply Lable

  @Alltag17
  Scenario: Verify Hover on email and delete mail
    Given the user is logged in
    When User Hover on email tile it should show Delete icon and On click on Delete icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @Alltag18
  Scenario: Verify Hover on email and Mark as Read mail
    Given the user is logged in
    When User Hover on email tile it should show Mail icon and On click on mail icon mail should mark as read or unread

  @Alltag19
  Scenario: Verify Open Mail from List
    Given the user is logged in
    When user Click on first tile it should Open mail or message

  @Alltag20
  Scenario: Verify Expand Mail on Open mail
    Given the user is logged in
    When user Click on first tile it should Open mail or message
    And On Hover it should show Tooltip Expand or Collapse and on Click it should expand mail or collapse mail

  @Alltag21
  Scenario: Verify Print on Open mail
    Given the user is logged in
    When user Click on first tile it should Open mail or message
    And On Hover it should show Tooltip Print on Click it should open new page

  @Alltag22
  Scenario: Verify New Window on Open mail
    Given the user is logged in
    When user Click on first tile it should Open mail or message
    And On Hover it should show Tooltip NewWindow
    Then On Click On newindow it should navigate to next tab

  @Alltag23
  Scenario: Verify ellipses on Open mail and send mail to spam
    Given the user is logged in
    When user Click on first tile it should Open mail or message
    And On Hover it should show Tooltip Ellipses on Click it should open popup
    And Click Report Spam
    And it Should Show confirmation popup
    Then On click on Ok the mail should move to spam

  @Alltag24
  Scenario: Verify list view
    Given the user is logged in
    When user Click on list view it should convert to list view
    And user Click on list view it should convert to list view

  @Alltag25
  Scenario: Verify Delete from ellipses
    Given the user is logged in
    When user Click on first tile it should Open mail or message
    And On Hover it should show Tooltip Ellipses on Click it should open popup
    And On Click Delete
    Then On click on Ok the mail should get Delete

  @Alltag26
  Scenario: Verify mark as read unread  from ellipses
    Given the user is logged in
    When user Click on first tile it should Open mail or message
    And On Hover it should show Tooltip Ellipses on Click it should open popup
    And On Click Mark as read or unread mail should mark as read/unread

  @Alltag27
  Scenario: Verify Add Labels from ellipses
    Given the user is logged in
    When user Click on first tile it should Open mail or message
    And On Hover it should show Tooltip Ellipses on Click it should open popup
    And Clikc Lables and Add from ellipses

  @Alltag28
  Scenario: Verify Reply After open mail from icon
    Given the user is logged in
    When user click on First mail mail should get open
    And On Click on Reply iocn user should be able to send reply
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content

  @Alltag29
  Scenario: Verify Reply After open mail from button with multiple recipient from Reply icon
    Given the user is logged in
    When user click on First mail mail should get open
    And On Click on Reply iocn user should be able to send reply
    And Enter another Recipient
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content


  @Alltag30
  Scenario: Verify no mail in list
    Given the user is logged in
    When if there is no mail in list it should show message

  @Alltag31
  Scenario: Verify Report spam from second ellipses
    Given the user is logged in
    When user Click on first tile it should Open mail or message
    And On Hover on second ellipses it should show Tooltip on Click it should open popup
    And on Click on report spam 
    And it Should Show confirmation popup
    Then On click on Ok the mail should move to spam

  @Alltag32
  Scenario: Verify Cancel Report spam from second ellipses
    Given the user is logged in
    When user click on First mail mail should get open
    And On Hover on second ellipses it should show Tooltip on Click it should open popup
    And on Click on report spam it should show confirmation popup
    Then On clikc on Cancel the mail should not move to spam

  @Alltag33
  Scenario: Verify Print from second ellipses
    Given the user is logged in
    When user click on First mail mail should get open
    And On Hover on second ellipses it should show Tooltip on Click it should open popup
    Then On click on print It should open Popup

  @Alltag34
  Scenario: Verify Original get downloaded from second ellipses
    Given the user is logged in
    When user click on First mail mail should get open
    And On Hover on second ellipses it should show Tooltip on Click it should open popup
    Then On click on Original It should open save Popup

  @Alltag35
  Scenario: Verify mail gets Deleted from second ellipses
    Given the user is logged in
    When user click on First mail mail should get open
    And On Hover on second ellipses it should show Tooltip on Click it should open popup
    And On click on Delete It should Confirmation popup
    Then On click on Ok the mail should get Delete

  @Alltag36
  Scenario: Verify mail gets cancel on delete from second ellipses
    Given the user is logged in
    When user click on First mail mail should get open
    And On Hover on second ellipses it should show Tooltip on Click it should open popup
    And On click on Delete It should Confirmation popup
    Then On clikc on Cancel the mail should not get Deleted

  # Right click
  @Alltag37
  Scenario: Verify when user right click on mail it should open popup
    Given the user is logged in
    When user right click on any Mail
    Then It should show popup with all options present

  @Alltag38
  Scenario: Verify report spam on right click
    Given the user is logged in
    When user right click on any Mail
    And user select Report spam after right click it should show confirmation popup
    Then On click on Ok the mail should move to spam

  @Alltag39
  Scenario: Verify report spam on right click
    Given the user is logged in
    When user right click on any Mail
    And user select Report spam
    And  after right click it should show confirmation popup
    Then On clikc on Cancel the mail should not move to spam
    
    
  @Alltag40
  Scenario: Verify Deleet mail on right click
    Given the user is logged in
    When user right click on any Mail
    And Click on Delete After rightClick it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @Alltag41
  Scenario: Verify Cancel Deleted mail on right click
    Given the user is logged in
    When user right click on any Mail
    And Click on Delete After rightClick it should open a Popup with confirmation messgae
    Then On clikc on Cancel the mail should not get Deleted

  @Alltag42
  Scenario: Verify Mark as read on right click
    Given the user is logged in
    When user right click on any Mail
    Then on Clikc on Mark as read mail should mark as read

  @Alltag43
  Scenario: verify Add label without any value select after right click
    Given the user is logged in
    When user right click on any Mail
    And User Select Add label after right click and it should open popup
    Then create new label

  @Alltag44
  Scenario: Select Label from List after right click
    Given the user is logged in
    When user right click on any Mail
    And User Select Add label after right click and it should open popup
    And Select label From List
    Then Close the Popup

  @Alltag45
  Scenario: Search and apply or remove labels in list
    Given the user is logged in
    When user right click on any Mail
    And User Select Add label after right click and it should open popup
    And Search Label
    And Select label From List
    Then Close the Popup

  @Alltag46
  Scenario: Open First Mail
    Given the user is logged in
    When user click on First mail mail should get open
    
    #reply and forward

  @Alltag47
  Scenario: Verify Reply After open mail from Reply button
    Given the user is logged in
    When user click on First mail mail should get open
    And On Click on Reply button
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content

  @Alltag48
  Scenario: Verify Reply After open mail from button with multiple recipient
    Given the user is logged in
    When user click on First mail mail should get open
    And On Click on Reply button
    And Enter another Recipient
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content

  @Alltag49
  Scenario: Verify Reply with all options from Reply button
    Given the user is logged in
    When user click on First mail mail should get open
    And On Click on Reply button
    And Enter the Body
    And Scroll page
    And Verify schedule send dropdown gets open on click
    And the user should be able to Save
    And On save The time and date should get display on Compose Box
    And The User click on Set to Expire button a popup should get Open
    And the User Clicks on Expiration Time Filed a list should get open
    And User Should be able to select expiration time for one hour
    And user should be able to Save
    And The User click on VC icon the icon should get enabled
    Then the user clicks on the Send button without entering any content

  @Alltag50
  Scenario: Verify forward After open mail from button with multiple recipient
    Given the user is logged in
    When user click on First mail mail should get open
    And On Click on Forward icon
    And the user enters an email address in the To field
    And On click on Enter email id should get enter
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content
    
  @Alltag51
  Scenario: Verify Forward After open mail from button with multiple recipient with Forward button
    Given the user is logged in
    When user click on First mail mail should get open
    And On Click on Forward button
    And user enters multiple email address in TO field
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content

  @Alltag52
  Scenario: Verify Forward with all options from Reply button
    Given the user is logged in
    When user click on First mail mail should get open
    And On Click on Forward button
    And the user enters an email address in the To field
    And On click on Enter email id should get enter
    And Enter the Body
    And Scroll page
    And Verify schedule send dropdown gets open on click
    And the user should be able to Save
    And On save The time and date should get display on Compose Box
    And The User click on Set to Expire button a popup should get Open
    And the User Clicks on Expiration Time Filed a list should get open
    And User Should be able to select expiration time for one hour
    And user should be able to Save
    And Scroll page
    And The User click on VC icon the icon should get enabled
    And Scroll page
    Then the user clicks on the Send button without entering any content
    
    

    