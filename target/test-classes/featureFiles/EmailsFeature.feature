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

@Emails
Feature: Verify Emails Features
  I want to use this template for my feature file

  @Emailstag1
  Scenario: Verify Redirection on email page
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page

  @Emailstag2
  Scenario: User Open Chat or email
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User click on first tile or any tile it should get open in Third Pane

  @Emailstag3
  Scenario: Sent single mail to spam From Header
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message
    And On click on Spam icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should move to spam

  @Emailstag4
  Scenario: Cancel mail to spam
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And On click on checkbox mail it should select mail
    And On click on Spam icon it should open a Popup with confirmation messgae
    Then On clikc on Cancel the mail should move to spam

  @Emailstag5
  Scenario: Delete single mail to spam From Header
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message for Delete
    And On click on Delete icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @Emailstag6
  Scenario: Cancel mail to get Delete
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And On click on checkbox mail it should select mail
    And On click on Delete icon it should open a Popup with confirmation messgae
    Then On clikc on Cancel the mail should not get Deleted

  @Emailstag7
  Scenario: verify Mark as read from Header
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message for mark as read/unread
    Then On click On Mailbox icon The email shoudld mark as read or unread

  @Emailstag8
  Scenario: verify Add label without any value select
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message for Add Lable
    And On click On Add Lable it should open popup
    And Click on Apply Lable

  @Emailstag9
  Scenario: verify Add label from popup
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    And create new label

  @Emailstag10
  Scenario: Select Label from List
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    And Select label From List
    Then Click on Apply Lable

  @Emailstag11
  Scenario: Search and apply with or without labels in list
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    And Search Label
    And Select label From List
    Then Click on Apply Lable

  @Emailstag12
  Scenario: Cancel labelPopup
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    Then Close the Popup

  @Emailstag13
  Scenario: Verify Select All and sent to spam
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message
    And On click on Spam icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should move to spam

  @Emailstag14
  Scenario: Verify Select All and sent to Delete
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message for Delete
    And On click on Delete icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @Emailstag15
  Scenario: Verify Select All and Mark As Read Unread
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message for mark as read/unread
    Then On click On Mailbox icon The email shoudld mark as read or unread

  @Emailstag16
  Scenario: Verify Select All and Add label
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message for Add Lable
    And On click On Add Lable it should open popup
    And Select label From List
    Then Click on Apply Lable

  @Emailstag17
  Scenario: Verify Hover on email and delete mail
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User Hover on email tile it should show Delete icon and On click on Delete icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @Emailstag18
  Scenario: Verify Hover on email and Mark as Read mail
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User Hover on email tile it should show Mail icon and On click on mail icon mail should mark as read or unread

  @Emailstag19
  Scenario: Verify Open Mail from List
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user Click on first tile it should Open mail or message

  @Emailstag20
  Scenario: Verify Expand Mail on Open mail
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user Click on first tile it should Open mail or message
    And On Hover it should show Tooltip Expand or Collapseand on Click it should expand mail or collapse mail

  @Emailstag21
  Scenario: Verify Print on Open mail
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And On click on Emails Tab it should navigate to emails page
    And user Click on first tile it should Open mail or message
    And On Hover it should show Tooltip Print on Click it should open new page

  @Emailstag22
  Scenario: Verify New Window on Open mail
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User click on first tile or any tile it should get open in Third Pane
    Then On Click On newindow it should navigate to next tab

  @Emailstag23
  Scenario: Verify ellipses on Open mail
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user Click on first tile it should Open mail or message
    And On Hover it should show Tooltip Ellipses on Click it should open popup
    And Click Report Spam
    Then On click on Ok the mail should move to spam

  @Emailstag24
  Scenario: Verify list view
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user Click on list view it should convert to list view
    And user Click on list view it should convert to list view

  @Emailstag25
  Scenario: Verify Delete from ellipses
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user Click on first tile it should Open mail or message
    And On Hover it should show Tooltip Ellipses on Click it should open popup
    And On Click Delete
    Then On click on Ok the mail should get Delete

  @Emailstag26
  Scenario: Verify mark as read unread  from ellipses
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user Click on first tile it should Open mail or message
    And On Hover it should show Tooltip Ellipses on Click it should open popup
    And On Click Mark as read or unread mail should mark as read/unread

  @Emailstag27
  Scenario: Verify labels from ellipses
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user Click on first tile it should Open mail or message
    And On Hover it should show Tooltip Ellipses on Click it should open popup
    And Clikc Lables and Add from ellipses


  @Emailstag30
  Scenario: Verify no mail in list
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And if there is no mail in list it should show message

  @Emailstag31
  Scenario: Load All mails and sent to spam
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And Load all mail

  #And user select global chekbox all mail shoul get selected
  #And On click on Spam icon it should open a Popup with confirmation messgae
  #Then On click on Ok the mail should move to spam
  @Emailstag32
  Scenario: Verify when user right click on mail it should open popup
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user right click on any Mail
    Then It should show popup with all options present

  @Emailstag33
  Scenario: Verify report spam on right click
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user right click on any Mail
    And user select Report spam after right click it should show confirmation popup
    Then On click on Ok the mail should move to spam

  @Emailstag34
  Scenario: Verify report spam on right click
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user right click on any Mail
    And user select Report spam after right click it should show confirmation popup
    Then On clikc on Cancel the mail should not move to spam

  @Emailstag35
  Scenario: Verify Deleet mail on right click
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user right click on any Mail
    And Click on Delete After rightClick it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @Emailstag36
  Scenario: Verify Cancel Deleted mail on right click
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user right click on any Mail
    And Click on Delete After rightClick it should open a Popup with confirmation messgae
    Then On clikc on Cancel the mail should not get Deleted

  @Emailstag37
  Scenario: Verify Mark as read on right click
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user right click on any Mail
    Then on Clikc on Mark as read mail should mark as read

  @Emailstag38
  Scenario: verify Add label without any value select after right click
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user right click on any Mail
    And User Select Add label after right click and it should open popup
    Then create new label

  @Emailstag39
  Scenario: Select Label from List after right click
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user right click on any Mail
    And User Select Add label after right click and it should open popup
    And Select label From List
    Then Close the Popup

  @Emailstag40
  Scenario: Search and apply or remove labels in list
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user right click on any Mail
    And User Select Add label after right click and it should open popup
    And Search Label
    And Select label From List
    Then Close the Popup

  # Reply and forward
  @Emailstag41
  Scenario: Verify Reply After open mail from icon
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on First mail mail should get open
    And On Click on Reply iocn user should be able to send reply
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content

  @Emailstag42
  Scenario: Verify Reply After open mail from button with multiple recipient from Reply icon
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on First mail mail should get open
    And On Click on Reply iocn user should be able to send reply
    And Enter another Recipient
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content
    
   @Emailstag43
  Scenario: Verify Reply After open mail from Reply button
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on First mail mail should get open
    And On Click on Reply button
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content

  @Emailstag44
  Scenario: Verify Reply After open mail from button with multiple recipient
    Given the user is logged in
   When On click on Emails Tab it should navigate to emails page
    And user click on First mail mail should get open
    And On Click on Reply button
    And Enter another Recipient
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content

  @Emailstag45
  Scenario: Verify Reply with all options from Reply button
    Given the user is logged in
   When On click on Emails Tab it should navigate to emails page
    And user click on First mail mail should get open
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

 @Emailstag46
  Scenario: Verify forward After open mail from button with multiple recipient
    Given the user is logged in
   When On click on Emails Tab it should navigate to emails page
    And user click on First mail mail should get open
    And On Click on Forward icon
    And the user enters an email address in the To field
    And On click on Enter email id should get enter
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content
    
  @Emailstag47
  Scenario: Verify Forward After open mail from button with multiple recipient with Forward button
    Given the user is logged in
   When On click on Emails Tab it should navigate to emails page
    And user click on First mail mail should get open
    And On Click on Forward button
    And user enters multiple email address in TO field
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content

  @Emailstag48
  Scenario: Verify Forward with all options from Reply button
    Given the user is logged in
  When On click on Emails Tab it should navigate to emails page
    And user click on First mail mail should get open
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
    
