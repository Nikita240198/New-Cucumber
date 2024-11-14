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
Feature: Verify Expiring Tab Features

  @Expirytag1
  Scenario: Verify User Navigation on expiration mail
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    Then Verify if there is no mail or mail in list

  @Expirytag2
  Scenario: Verify Email shows timer
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    Then If mail is present it should show Timer and icon

  @Expirytag3
  Scenario: Verify User Open First Expiration mail
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And User click on first tile or any tile it should get open in Third Pane
    Then Timer and mail content should be present in Third Pane

  @Expirytag4
  Scenario: Verify User should not Sent single mail to spam From Header
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message
    And On click on Spam icon
    Then it should not let user to move Expiring mail to spam

  @Expirytag5
  Scenario: Delete single mail From Header
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message for Delete
    And On click on Delete icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @Expirytag6
  Scenario: Cancel mail to get Delete
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And On click on checkbox mail it should select mail
    And On click on Delete icon it should open a Popup with confirmation messgae
    Then On clikc on Cancel the mail should not get Deleted

  @Expirytag7
  Scenario: verify Mark as read from Header
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message for mark as read/unread
    Then On click On Mailbox icon The email shoudld mark as read or unread

  @Expirytag8
  Scenario: verify Add label without any value select
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message for Add Lable
    And On click On Add Lable it should open popup
    And Click on Apply Lable
    Then It should show validation message

  @Expirytag9
  Scenario: verify Add label from popup
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    Then create new label

  @Expirytag10
  Scenario: Select Label from List
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    And Select label From List
    Then Click on Apply Lable

  @Expirytag11
  Scenario: Search and apply with or without labels in list
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    And Search Label
    And Select label From List
    Then Click on Apply Lable

  @Expiryta12
  Scenario: Cancel labelPopup
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    Then Close the Popup

  @Expiryta13
  Scenario: Verify Select All and sent to spam
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message
    And On click on Spam icon
    Then it should not let user to move Expiring mail to spam

  @Expiryta14
  Scenario: Verify Select All and sent to Delete
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message for Delete
    And On click on Delete icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @Expiryta15
  Scenario: Verify Select All and Mark As Read Unread
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message for mark as read/unread
    Then On click On Mailbox icon The email shoudld mark as read or unread

  @Expiryta16
  Scenario: Verify Select All and Add label
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message for Add Lable
    And On click On Add Lable it should open popup
    And Select label From List
    Then Click on Apply Lable

  @Expiryta17
  Scenario: Verify Hover on email and delete mail
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And User Hover on email tile it should show Delete icon and On click on Delete icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @Expiryta18
  Scenario: Verify Hover on email and Mark as Read mail
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    Then User Hover on email tile it should show Mail icon and On click on mail icon mail should mark as read or unread

  @Expiryta19
  Scenario: Verify Print on Open mail
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And User click on first tile or any tile it should get open in Third Pane
    Then On Hover it should show Tooltip Print on Click it should open new page

  @Expiryta20
  Scenario: Verify New Window on Open mail
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user click on First mail mail should get open
    And On Hover it should show Tooltip NewWindow
    Then On Click On newindow it should navigate to next tab

  @Expiryta21
  Scenario: Verify list view
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user Click on list view it should convert to list view
    Then user Click on list view it should convert to list view

  @Expiryta22
  Scenario: Verify ellipses on Open mail and send mail to spam
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user click on First mail mail should get open
    And On Hover it should show Tooltip Ellipses on Click it should open popup
    And Click Report Spam
    Then it should not let user to move Expiring mail to spam

  @Expiryta23
  Scenario: Verify Delete from ellipses
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user Click on first tile it should Open mail or message
    And On Hover it should show Tooltip Ellipses on Click it should open popup
    And On Click Delete
    Then On click on Ok the mail should get Delete

  @Expiryta24
  Scenario: Verify mark as read unread  from ellipses
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user Click on first tile it should Open mail or message
    And On Hover it should show Tooltip Ellipses on Click it should open popup
    Then On Click Mark as read or unread mail should mark as read/unread

  @Expiryta25
  Scenario: Verify Add Labels from ellipses
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user Click on first tile it should Open mail or message
    And On Hover it should show Tooltip Ellipses on Click it should open popup
    Then Clikc Lables and Add from ellipses

  @Expiryta26
  Scenario: Verify Reply After open mail from icon
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user click on First mail mail should get open
    And On Click on Reply iocn user should be able to send reply
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content

  @Expiryta27
  Scenario: Verify Reply After open mail from button with multiple recipient from Reply icon
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user click on First mail mail should get open
    And On Click on Reply iocn user should be able to send reply
    And Enter another Recipient
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content

  @Expiryta28
  Scenario: Verify Report spam from second ellipses
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user Click on first tile it should Open mail or message
    And On Hover on second ellipses it should show Tooltip on Click it should open popup
    And on Click on report spam
    Then it should not let user to move Expiring mail to spam

  @Expiryta29
  Scenario: Verify Print from second ellipses
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user click on First mail mail should get open
    And On Hover on second ellipses it should show Tooltip on Click it should open popup
    Then On click on print It should open Popup

  @Expiryta30
  Scenario: Verify Original get downloaded from second ellipses
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user click on First mail mail should get open
    And On Hover on second ellipses it should show Tooltip on Click it should open popup
    Then On click on Original It should open save Popup

  @Expiryta31
  Scenario: Verify mail gets Deleted from second ellipses
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user click on First mail mail should get open
    And On Hover on second ellipses it should show Tooltip on Click it should open popup
    And On click on Delete It should Confirmation popup
    Then On click on Ok the mail should get Delete

  @Expiryta32
  Scenario: Verify mail gets cancel on delete from second ellipses
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user click on First mail mail should get open
    And On Hover on second ellipses it should show Tooltip on Click it should open popup
    And On click on Delete It should Confirmation popup
    Then On clikc on Cancel the mail should not get Deleted

  @Expiryta33
  Scenario: Verify when user right click on mail it should open popup
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user right click on any Mail
    Then It should show popup with all options present

  @Expiryta34
  Scenario: Verify report spam on right click
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user right click on any Mail
    And user select Report spam
    Then it should not let user to move Expiring mail to spam

  @Expiryta35
  Scenario: Verify Delete mail on right click
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user right click on any Mail
    And Click on Delete After rightClick it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @Expiryta36
  Scenario: Verify Cancel Deleted mail on right click
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user right click on any Mail
    And Click on Delete After rightClick it should open a Popup with confirmation messgae
    Then On clikc on Cancel the mail should not get Deleted

  @Expiryta37
  Scenario: Verify Mark as read on right click
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user right click on any Mail
    Then on Clikc on Mark as read mail should mark as read

  @Expiryta38
  Scenario: verify Add label without any value select after right click
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user right click on any Mail
    And User Select Add label after right click and it should open popup
    Then create new label

  @Expiryta39
  Scenario: Select Label from List after right click
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user right click on any Mail
    And User Select Add label after right click and it should open popup
    And Select label From List
    Then Close the Popup

  @Expiryta40
  Scenario: Search and apply or remove labels in list
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user right click on any Mail
    And User Select Add label after right click and it should open popup
    And Search Label
    And Select label From List
    Then Close the Popup
    
    @Expiryta41
  Scenario: Verify Reply with all options from Reply button
   Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
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
    
    
    @Expiryta42
  Scenario: Verify Reply After open mail from icon with attachment
    Given the user is logged in
    When User Click on Expiring Tab it should navigate to expiring Page
    And user click on First mail mail should get open
    And On Click on Reply iocn user should be able to send reply
    And Enter the Body
    And Scroll page
    And On click on Attachment icon system Files Popup should get open
    And User Should be able to add attachmetns
    Then the user clicks on the Send button without entering any content
