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
Feature: Verify Emails Page

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

  @Emailstag28
  Scenario: Verify Reply After open mail from icon
    Given the user is logged in
     When On click on Emails Tab it should navigate to emails page
    And user Click on first tile it should Open mail or message
    And On Click on Reply iocn user should be able to send reply
    And Enter the Body
    Then the user clicks on the Send button without entering any content

  @Emailstag29
  Scenario: Verify Reply After open mail from button with multiple recipient
    Given the user is logged in
     When On click on Emails Tab it should navigate to emails page
    And user Click on first tile it should Open mail or message
    And On Click on Reply button user should be able to send reply
    And Enter another Recipient
    And Enter the Body
    Then the user clicks on the Send button without entering any content

  @Emailstag30
  Scenario: Verify Forward After open mail from icon
    Given the user is logged in
     When On click on Emails Tab it should navigate to emails page
    And user Click on first tile it should Open mail or message
    And On Click on Forward iocn user should be able to forward mail
    And Enter Recipient
    And Enter the Body
    Then the user clicks on the Send button without entering any content

  @Emailstag31
  Scenario: Verify Forward After open mail from button
    Given the user is logged in
     When On click on Emails Tab it should navigate to emails page
    And user Click on first tile it should Open mail or message
    And On Click on Forward button user should be able to forward mail
    And Enter Recipient
    And Enter the Body
    Then the user clicks on the Send button without entering any content
    
    
    @Emailstag32
     Scenario: Verify no mail in list
    Given the user is logged in
     When On click on Emails Tab it should navigate to emails page
    And if there is no mail in list it should show message
      

    @Emailstag33
    Scenario: Load All mails and sent to spam
    Given the user is logged in
     When On click on Emails Tab it should navigate to emails page
     And Load all mail 
     #And user select global chekbox all mail shoul get selected
    #And On click on Spam icon it should open a Popup with confirmation messgae
    #Then On click on Ok the mail should move to spam
     
    
    
    
    
    
    
    
    
