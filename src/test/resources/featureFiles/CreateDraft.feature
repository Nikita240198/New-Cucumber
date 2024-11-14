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
    Then User Open First Draft in list
    Then Subject should be present
    Then Body should be present

  @Drafttag3
  Scenario: Create draft with recipient in Cc Field
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the email compose editor should open
    And the user clicks on the CC field
    And the user enters an email address in the CC field
    And On click on Enter email id should get enter
    And Enter the subject
    And Enter the Body
    And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    And the user clicks on the CC field
    Then Email should be present in Cc Field

  @Drafttag4
  Scenario: Create draft with recipient in BCc Field
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the email compose editor should open
    And the user clicks on the Bcc field
    And the user enters an email address in the Bcc field
    And On click on Enter email id should get enter
    And Enter the subject
    And Enter the Body
    And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    And the user clicks on the Bcc field
    Then Email should be present in BCc Field

  @Drafttag5
  Scenario: Create draft with Schedule date and time
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the email compose editor should open
    And Enter the subject
    And Enter the Body
    And Verify schedule send dropdown gets open on click
    And the user should be able to Save
    And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    Then Saved schedule save date and time should be present

  @Drafttag6
  Scenario: Create draft with Expiration time
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the email compose editor should open
    And Enter the subject
    And Enter the Body
    And The User click on Set to Expire button a popup should get Open
    And the User Clicks on Expiration Time Filed a list should get open
    And User Should be able to select expiration time for one hour
    And user should be able to Save
    And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    Then Saved Expiration time should be present

  @Drafttag7
  Scenario: Create draft with VC Enabled
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the email compose editor should open
    And the user enters an email address in the To field
    And Enter the subject
    And The User click on VC icon the icon should get enabled
    And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    Then VC should be Enabled with notification

  @Drafttag8
  Scenario: Create draft with D2I Enabled
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the email compose editor should open
    And Enter the subject
    And The User click on D2I icon the icon should get enabled
    And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    Then D2I should be enbled with notification

  @Drafttag9
  Scenario: It should not Create draft when user close compose without enterig any value in compose
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the email compose editor should open
    And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    Then User Open First Draft in list

  @Drafttag10
  Scenario: Create draft with Text Format Option with Font Type
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the email compose editor should open
    And Enter the Body
    And On Click on text Format it should Open a popup
    And Select Conetent in Mail
    And On Click on Font Type a dropdown should get open and on select any option font type should get changed
    And On Click on text Format it should Open a popup
    And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    Then On Click on Font Type a dropdown font type should be selected

  @Drafttag11
  Scenario: Create draft with Text Format Option with Font size
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the email compose editor should open
    And Enter the Body
    And On Click on text Format it should Open a popup
    And Select Conetent in Mail
    And On Click on Font size a dropdown should get open and  on select any option font size should get changed
    And On Click on text Format it should Open a popup
    And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    Then On Click on Font Size a dropdown font size should be selected

  @Drafttag12
  Scenario: Create draft with Text Format Option with Font size
    Given the user is logged in
    When the user clicks on the Compose Email button
    And On Click on text Format it should Open a popup
    And Enter the Body
    And Select Conetent in Mail
    And On Click on B Icon  text should change to Bold
    And On Click on I icon the text should change to Italic
    And On Click on U icon the text should change to Underline
    And On Click on S icon the text should change to StrikeThrough
    And On Click on Bullet List icon it should add bullets
    And On Click on Number List icon it should add Number
    And On Click on indent  icon it should add moves toward right
    And On Click on outdent List icon it should moves toward left
    And On Click on BLockquote icon it should add BlockQuote
    And On Click on text Format it should Open a popup
    And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    Then User Open First Draft in list

  @Drafttag13
  Scenario: Create draft with Link
    Given the user is logged in
    When the user clicks on the Compose Email button
    And Enter the subject
    And Hover on link it should show tooltip with message
    And user can create new link on empty compose
    And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    Then Link should be present

  @Drafttag14
  Scenario: Edit and created draft
    Given the user is logged in
    #When the user clicks on the Compose Email button
    #And the email compose editor should open
    #And the user enters an email address in the To field
    #And On click on Enter email id should get enter
    #And Enter the subject
    #And Enter the Body
    #And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    And the user enters another recipient
    And the user clicks on the CC field
    And the user enters an email address in the CC field
    And On click on Enter email id should get enter
    And Edit Subject
    And Edit Body
    And Verify schedule send dropdown gets open on click
    And the user should be able to Save
    And The User click on Set to Expire button a popup should get Open
    And the User Clicks on Expiration Time Filed a list should get open
    And User Should be able to select expiration time for one hour
    And user should be able to Save
    And The User click on VC icon the icon should get enabled
    And On click on Cross Compose box should get closed
    Then User Open First Draft in list

  @Drafttag15
  Scenario: Delete draft mail
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    Then On click on Delete icon Compose box should get closed

  @Drafttag16
  Scenario: close draft mail
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    Then On click on Cross Compose box should get closed

  @Drafttag17
  Scenario: Sent draft mail
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    Then the user clicks on the Send button without entering any content

  @Drafttag18
  Scenario: Maximize Draft mail
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    And On click on Maximize Compose should reopen
    And On click on Maximize Compose should reopen
    Then Verify Compose gets minimize

  @Drafttag19
  Scenario: minimize and maximize draft list
    When On click on Drafts user should navigate to draft screen
    Then User Minimize and maximize Draft list

  @Drafttag20
  Scenario: Remove Schedule date and time in Draft
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the email compose editor should open
    And Enter the subject
    And Enter the Body
    And Verify schedule send dropdown gets open on click
    And the user should be able to Save
    And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    And On click on cancel schedule date and time it should get removed
    Then User Open First Draft in list

  @Drafttag21
  Scenario: Edit Schedule date and time in Draft
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the email compose editor should open
    And Enter the subject
    And Enter the Body
    And Verify schedule send dropdown gets open on click
    And the user should be able to Save
    And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    And On Click on Edit the schedule box should reopen
    And Open date picker
    And the user should be able to select any future date from the date picker
    And Open Time picker
    And the user should be able to select any future Time from the Calendar
    Then the user should be able to Save

  @Drafttag22
  Scenario: Edit Expiration time in Draft
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the email compose editor should open
    And Enter the subject
    And Enter the Body
    And The User click on Set to Expire button a popup should get Open
    And the User Clicks on Expiration Time Filed a list should get open
    And User Should be able to select expiration time for one hour
    And User should be able Enter Password
    And user should be able to Save
    And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    And On Click Edit The same Set to expiry popup should get open with saved value
    And the User Clicks on Expiration Time Filed a list should get open
    And User Should be able to select expiration time for one week
    And User should be able Change Password
    Then user should be able to Save

  @Drafttag23
  Scenario: Cancel Expiration time in Draft
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the email compose editor should open
    And Enter the subject
    And Enter the Body
    And The User click on Set to Expire button a popup should get Open
    And the User Clicks on Expiration Time Filed a list should get open
    And User Should be able to select expiration time for one hour
    And User should be able Enter Password
    And user should be able to Save
    And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    Then On click on cross icon saved expiring time should get removed

  @Drafttag24
  Scenario: Remove Vc from Draft
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the email compose editor should open
    And Enter the subject
    And Enter the Body
    And The User click on VC icon the icon should get enabled
    And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    And Click on Cancel buttton Of Vc
    Then User Open First Draft in list

  @Drafttag25
  Scenario: Remove D2I from Draft
    Given the user is logged in
    When the user clicks on the Compose Email button
    And the email compose editor should open
    And Enter the subject
    And Enter the Body
    And The User click on D2I icon the icon should get enabled
    And On click on Cross Compose box should get closed
    And On click on Drafts user should navigate to draft screen
    And User Open First Draft in list
    And Click on Cancel buttton Of D2I
    Then User Open First Draft in list

  @Drafttag26
  Scenario: Collapse Draft List
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And User clicks on collapse icon draft list should get collpase or expand
    Then User clicks on collapse icon draft list should get collpase or expand

  @Drafttag26
  Scenario: Select all and sent draft to spam it should not let user to sent draft mail ti spam
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen

  @Drafttag27
  Scenario: Verify Scroll in draft
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    Then Scroll page to Bottom

  # acions from header for single draft
  @Drafttag28
  Scenario: Verify User should not able to sent Sent single mail to spam From Header
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    When On click on checkbox mail it should select mail
    Then On click on Spam icon it should show validation message

  @Drafttag29
  Scenario: Verify Delete Draft mail From Header
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On click on checkbox mail it should select mail
    And On click on Delete icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @Drafttag30
  Scenario: Verify Cancel Delete Draft mail From Header
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On click on checkbox mail it should select mail
    And On click on Delete icon it should open a Popup with confirmation messgae
    Then On clikc on Cancel the mail should not get Deleted

  @Drafttag31
  Scenario: Verify Mark as read unread Draft mail From Header
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On click on checkbox mail it should select mail
    Then On click On Mailbox icon The email shoudld mark as read or unread

  @Drafttag32
  Scenario: verify Add label without any value select for draft mail
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    And Click on Apply Lable
    Then It should show validation message

  @Drafttag33
  Scenario: verify Add label from popup for draft mail
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    Then create new label

  @Drafttag34
  Scenario: Select Label from List for draft mail
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    And Select label From List
    Then Click on Apply Lable

  @Drafttag35
  Scenario: Search and apply with or without labels in list
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    And Search Label
    And Select label From List
    Then Click on Apply Lable

  @Drafttag36
  Scenario: Cancel labelPopup
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And On click on checkbox mail it should select mail
    And On click On Add Lable it should open popup
    Then Close the Popup

  @Drafttag37
  Scenario: Verify Select All and sent to spam
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message
    Then On click on Spam icon it should show validation message

  @Drafttag38
  Scenario: Verify Select All and Mark As Read Unread
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message for mark as read/unread
    Then On click On Mailbox icon The email shoudld mark as read or unread

  @Drafttag39
  Scenario: Verify Select All and Add label
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message for Add Lable
    And On click On Add Lable it should open popup
    And Select label From List
    Then Click on Apply Lable

  @Drafttag40
  Scenario: Verify Select All and sent to Delete
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And user select global chekbox all mail shoul get selected
    And On Hover it should show tooltip with message for Delete
    And On click on Delete icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @Drafttag41
  Scenario: Verify Hover on email and delete mail
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And User Hover on email tile it should show Delete icon and On click on Delete icon it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @Drafttag42
  Scenario: Verify Hover on email and Mark as Read mail
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    Then User Hover on email tile it should show Mail icon and On click on mail icon mail should mark as read or unread

  @Drafttag43
  Scenario: Verify when user right click on mail it should open popup
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And user right click on any Mail
    Then It should show popup with all options present

  @Drafttag44
  Scenario: Verify when user right click on mail and select move to inbox
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And user right click on any Mail
    Then Select Move to inbox

  @Drafttag45
  Scenario: Verify Deleet mail on right click
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And user right click on any Mail
    And Click on Delete After rightClick it should open a Popup with confirmation messgae
    Then On click on Ok the mail should get Delete

  @Drafttag46
  Scenario: Verify Cancel Deleted mail on right click
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And user right click on any Mail
    And Click on Delete After rightClick it should open a Popup with confirmation messgae
    Then On clikc on Cancel the mail should not get Deleted

  @Drafttag47
  Scenario: Verify Mark as read on right click
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And user right click on any Mail
    Then on Clikc on Mark as read mail should mark as read
    
    
    @Drafttag48
  Scenario: verify Add label without any value select for draft mail
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
     And user right click on any Mail
    And On click On Add Lable it should open popup
    And Click on Apply Lable
    Then It should show validation message

  @Drafttag49
  Scenario: verify Add label from popup for draft mail
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
     And user right click on any Mail
    And On click On Add Lable it should open popup
    Then create new label

  @Drafttag50
  Scenario: Select Label from List for draft mail
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And user right click on any Mail
    And On click On Add Lable it should open popup
    And Select label From List
    Then Click on Apply Lable

  @Drafttag51
  Scenario: Search and apply with or without labels in list
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And user right click on any Mail
    And On click On Add Lable it should open popup
    And Search Label
    And Select label From List
    Then Click on Apply Lable

  @Drafttag52
  Scenario: Cancel labelPopup
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
     And user right click on any Mail
    And On click On Add Lable it should open popup
    Then Close the Popup
    
    
    
    
    @Drafttag53
  Scenario: Verify close Draft mail list dropdown
    Given the user is logged in
    When On click on Drafts user should navigate to draft screen
    And User click on dropdown icon in draft list
    Then Click on dropdown icon again in draft list
    
    
    
    
    
    
    
