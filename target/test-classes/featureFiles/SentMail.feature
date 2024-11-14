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
@sentMail
Feature: Sent Mail Functionality

  @sentMail1
  Scenario: Verify Redirectione to sent page
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    Then it should show all mails sent by user

  @sentMail2
  Scenario: User Open sent email
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    Then user click on First mail mail should get open

  @sentMail3
  Scenario: Sent single mail to spam From Header
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message
    And On click on Spam icon
    Then it should not let user to move sent mail to spam

  @sentMail4
  Scenario: Delete single mail From Header
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message for Delete
    And On click on Delete icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @sentMail5
  Scenario: Cancel mail to get Delete
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And On click on checkbox mail it should select mail
    And On click on Delete icon it should open a Popup with confirmation messgae
    Then On clikc on Cancel the mail should not get Deleted

  @sentMail6
  Scenario: verify Mark as read from Header
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message for mark as read/unread
    Then On click On Mailbox icon The email shoudld mark as read or unread

  @sentMail7
  Scenario: verify Add label without any value select
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message for Add Lable
    And On click On Add Lable it should open popup
    And Click on Apply Lable
    Then It should show validation message

  @sentMail8
  Scenario: verify Add label from popup
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    Then create new label

  @sentMail9
  Scenario: Select Label from List
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    And Select label From List
    Then Click on Apply Lable

  @sentMail10
  Scenario: Search and apply with or without labels in list
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    And Search Label
    And Select label From List
    Then Click on Apply Lable

  @sentMail11
  Scenario: Cancel labelPopup
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    Then Close the Popup

  @sentMail12
  Scenario: Verify Select All and sent to spam
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message
    And On click on Spam icon
    Then it should not let user to move sent mail to spam

  @sentMail13
  Scenario: Verify Select All and sent to Delete
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message for Delete
    And On click on Delete icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @sentMail14
  Scenario: Verify Select All and Mark As Read Unread
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message for mark as read/unread
    Then On click On Mailbox icon The email shoudld mark as read or unread

  @sentMail15
  Scenario: Verify Select All and Add label
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message for Add Lable
    And On click On Add Lable it should open popup
    And Select label From List
    Then Click on Apply Lable

  @sentMail16
  Scenario: Verify Hover on email and delete mail
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And User Hover on email tile it should show Delete icon and On click on Delete icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

	  @sentMail17
	  Scenario: Verify Hover on email and Mark as Read mail
	    Given the user is logged in
	    When On click on Emails Tab it should navigate to emails page
	    And user click on Sent
	    Then User Hover on email tile it should show Mail icon and On click on mail icon mail should mark as read or unread


  @sentMail18
  Scenario: Verify Expand Mail on Open mail
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user Click on first tile it should Open mail or message
    Then On Hover it should show Tooltip Expand or Collapseand on Click it should expand mail or collapse mail

  @sentMail19
  Scenario: Verify Print on Open mail
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    Then user click on First mail mail should get open
    Then On Hover it should show Tooltip Print on Click it should open new page

  @sentMail20
  Scenario: Verify New Window on Open mail
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    Then user click on First mail mail should get open
    And On Hover it should show Tooltip NewWindow
    Then On Click On newindow it should navigate to next tab

  @sentMail21
  Scenario: Verify ellipses on Open mail and send mail to spam
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
     Then user click on First mail mail should get open
    And On Hover it should show Tooltip Ellipses on Click it should open popup
     And Click Report Spam
    Then it should not let user to move sent mail to spam

  @sentMail22
  Scenario: Verify list view
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user Click on list view it should convert to list view
    Then user Click on list view it should convert to list view

  @sentMail23
  Scenario: Verify Delete from ellipses
     Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user Click on first tile it should Open mail or message
    And On Hover it should show Tooltip Ellipses on Click it should open popup
    And On Click Delete
    Then On click on Ok the mail should get Delete

  @sentMail24
  Scenario: Verify mark as read unread  from ellipses
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user Click on first tile it should Open mail or message
    And On Hover it should show Tooltip Ellipses on Click it should open popup
    Then On Click Mark as read or unread mail should mark as read/unread

  @sentMail26
  Scenario: Verify Add Labels from ellipses
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user Click on first tile it should Open mail or message
    And On Hover it should show Tooltip Ellipses on Click it should open popup
    Then Clikc Lables and Add from ellipses

  @sentMail25
  Scenario: Verify Reply After open mail from icon
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user click on First mail mail should get open
    And On Click on Reply iocn user should be able to send reply
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content

  @sentMail26
  Scenario: Verify Reply After open mail from button with multiple recipient from Reply icon
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user click on First mail mail should get open
    And On Click on Reply iocn user should be able to send reply
    And Enter another Recipient
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content

  @sentMail27
  Scenario: Verify no mail in list
    Given the user is logged in
    And On click on Emails Tab it should navigate to emails page
    And user click on Sent
    Then if there is no mail in list it should show message

  @sentMail28
  Scenario: Verify Report spam from second ellipses
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user Click on first tile it should Open mail or message
    And On Hover on second ellipses it should show Tooltip on Click it should open popup
    And on Click on report spam 
    Then it should not let user to move sent mail to spam


  @sentMail29
  Scenario: Verify Print from second ellipses
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user click on First mail mail should get open
    And On Hover on second ellipses it should show Tooltip on Click it should open popup
    Then On click on print It should open Popup

  @sentMail30
  Scenario: Verify Original get downloaded from second ellipses
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user click on First mail mail should get open
    And On Hover on second ellipses it should show Tooltip on Click it should open popup
    Then On click on Original It should open save Popup

  @sentMail31
  Scenario: Verify mail gets Deleted from second ellipses
     Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user click on First mail mail should get open
    And On Hover on second ellipses it should show Tooltip on Click it should open popup
    And On click on Delete It should Confirmation popup
    Then On click on Ok the mail should get Delete

  @sentMail32
  Scenario: Verify mail gets cancel on delete from second ellipses
     Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user click on First mail mail should get open
    And On Hover on second ellipses it should show Tooltip on Click it should open popup
    And On click on Delete It should Confirmation popup
    Then On clikc on Cancel the mail should not get Deleted

  # Right click
  @sentMail33
  Scenario: Verify when user right click on mail it should open popup
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user right click on any Mail
    Then It should show popup with all options present

  @sentMail34
  Scenario: Verify report spam on right click
     Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user right click on any Mail
   And user select Report spam
   Then it should not let user to move sent mail to spam

  

  @sentMail35
  Scenario: Verify Delete mail on right click
     Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user right click on any Mail
    And Click on Delete After rightClick it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @sentMail36
  Scenario: Verify Cancel Deleted mail on right click
     Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user right click on any Mail
    And Click on Delete After rightClick it should open a Popup with confirmation messgae
    Then On clikc on Cancel the mail should not get Deleted

  @sentMail37
  Scenario: Verify Mark as read on right click
     Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user right click on any Mail
    Then on Clikc on Mark as read mail should mark as read

  @sentMail38
  Scenario: verify Add label without any value select after right click
   Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user right click on any Mail
    And User Select Add label after right click and it should open popup
    Then create new label

  @sentMail39
  Scenario: Select Label from List after right click
     Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user right click on any Mail
    And User Select Add label after right click and it should open popup
    And Select label From List
    Then Close the Popup

  @sentMail40
  Scenario: Search and apply or remove labels in list
     Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user right click on any Mail
    And User Select Add label after right click and it should open popup
    And Search Label
    And Select label From List
    Then Close the Popup

  @sentMail41
  Scenario: Open First Mail
     Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    Then user click on First mail mail should get open

  #reply and forward
  @sentMail42
  Scenario: Verify Reply After open mail from Reply button
     Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user click on First mail mail should get open
    And On Click on Reply button
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content

  @sentMail43
  Scenario: Verify Reply After open mail from button with multiple recipient
     Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user click on First mail mail should get open
    And On Click on Reply button
    And Enter another Recipient
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content

  @sentMail44
  Scenario: Verify Reply with all options from Reply button
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
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

  @sentMail45
  Scenario: Verify forward After open mail from button with multiple recipient
     Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user click on First mail mail should get open
    And On Click on Forward icon
    And the user enters an email address in the To field
    And On click on Enter email id should get enter
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content

  @sentMail46
  Scenario: Verify Forward After open mail from button with multiple recipient with Forward button
     Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
    And user click on First mail mail should get open
    And On Click on Forward button
    And user enters multiple email address in TO field
    And Enter the Body
    And Scroll page
    Then the user clicks on the Send button without entering any content

  @sentMail47
  Scenario: Verify Forward with all options from Reply button
     Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And user click on Sent
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
