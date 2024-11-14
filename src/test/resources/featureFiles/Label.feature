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
@Labels
Feature: Label CURD

  @Labeltag1
  Scenario: Verify Cretae New label if there is no label present
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User Hover on Cretae Label should show Tooltip message
    Then On click on create Label it should show Create Label popup

  @Labeltag2
  Scenario: Verify Cretae New simple label
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And On click on create Label it should show Create Label popup
    Then User Create New Label and it should get added in List

  @Labeltag3
  Scenario: Verify Create Label with custom color
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And On click on create Label it should show Create Label popup
    And On click on custom color it should open color selector popup
    And User select backgroung color
    And User select text color
    And On click on Add custom color should get added
    Then click on Create CTA it will Create New Label and it should get added in List

  @Labeltag4
  Scenario: Verify Cancel custom color
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And On click on create Label it should show Create Label popup
    And On click on custom color it should open color selector popup
    And User select backgroung color
    And User select text color
    Then click on Cancel CTA it will Not Create New color and it should not get added in List

  @Labeltag5
  Scenario: Verify Cancel create Label
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And On click on create Label it should show Create Label popup
    Then click on Cancel button it will Not Create New Label and it should not get added in List

  @Labeltag6
  Scenario: Verify Cretae sublabel
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And On click on create Label it should show Create Label popup
    And User Enter Label Name
    And User select Nest label it should show all lables and User Select any one label from dropdown
    Then User Create New Label

  @Labeltag7
  Scenario: Verify View sublabel
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    Then User Open Parent Label new sub label should be present

  @Labeltag8
  Scenario: Select Label and view email of selected label
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User select label
    Then it will show labels otherwise show messages

  @Labeltag9
  Scenario: Remove Label from List
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User select label
    Then User Should be able to remove label from list and It should show confirmation popup

  @Labeltag10
  Scenario: Remove Label from ThirdPane
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User select label
    And user click on First mail mail should get open
    Then User Should be able to remove label from Third Pane and It should show confirmation popup

  @Labeltag11
  Scenario: Sent single mail to spam From Header
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User select label
    And On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message
    And On click on Spam icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should move to spam

  @Labeltag12
  Scenario: Cancel mail to spam
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User select label
    And On click on checkbox mail it should select mail
    And On click on Spam icon it should open a Popup with confirmation messgae
    Then On click on Cancel the mail should not move to spam

  @Labeltag13
  Scenario: Delete single mail to spam From Header
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User select label
    And On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message for Delete
    And On click on Delete icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @Labeltag14
  Scenario: Cancel mail to get Delete
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User select label
    And On click on checkbox mail it should select mail
    And On click on Delete icon it should open a Popup with confirmation messgae
    Then On clikc on Cancel the mail should not get Deleted

  @Labeltag15
  Scenario: verify Mark as read from Header
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User select label
    And On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message for mark as read/unread
    Then On click On Mailbox icon The email shoudld mark as read or unread

  @Labeltag16
  Scenario: verify remove label from checkbox
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User select label
    And On click on checkbox mail it should select mail
    And On Hover it should show tooltip with message for Add Lable
    And On click On Add Lable it should open popup
    And Select label From List
    Then Click on Apply Lable

  @Labeltag17
  Scenario: verify Add label from popup
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User select label
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    And create new label

  @Labeltag18
  Scenario: Search and remove label in list
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User select label
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    And Search Label
    And Select label From List
    Then Click on Apply Lable

  @Labeltag19
  Scenario: Cancel labelPopup
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User select label
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    Then Close the Popup

  @Labeltag20
  Scenario: Verify Label from ThirdPane
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User select label
    And user click on First mail mail should get open
    And On Hover it should show Tooltip Ellipses on Click it should open popup
    And Clikc Lables and Add from ellipses
    Then it should show Tooltip message label is already added

  @Labeltag21
  Scenario: Verify Create Label from RightClick
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User select label
    And user right click on any Mail
    And User Select Add label after right click and it should open popup
    And On click on create Label it should show Create Label popup
    Then User Create New Label and it should get added in List
    
    @Labeltag22
  Scenario: Remove Label from RightClick
  Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User select label
    And user right click on any Mail
    And User Select Add label after right click and it should open popup
    And Select label From List
    Then Close the Popup
    
    
   @Labeltag23
  Scenario: Add another Label from RightClick
  Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User select label
    And user right click on any Mail
    And User Select Add label after right click and it should open popup
    And user select next Checkbox on List and Label should get added
    Then User Click on Cancel to close popup
    
    
    @Labeltag24
    Scenario: Open Label Ellipsis
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User select label
    And User Hover on ellipsis it shows tooltip More
    Then On Click on Ellipsis it shows all options
    
    @Labeltag25
  Scenario: Verify Hover on email and delete mail
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User select label
    And User Hover on email tile it should show Delete icon and On click on Delete icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @Labeltag26
  Scenario: Verify Hover on email and Mark as Read mail
    Given the user is logged in
    When On click on Emails Tab it should navigate to emails page
    And User select label
    Then User Hover on email tile it should show Mail icon and On click on mail icon mail should mark as read or unread
    
    
    
    
    
