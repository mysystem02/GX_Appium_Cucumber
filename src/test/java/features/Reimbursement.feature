Feature: Reimbursement

  Scenario: Driver can send Reimbursement to the admin 
    Given User launches the app on "Android"
    When User enters "arifraza" and "1234567"
    Then User should see the homepage
    And User click hamburger menu
    When User click Reimbursement menu
    Then User should see reimbursement Page
    When User enter "dateField" 
    And user enter "Amount"
    And User enter send message
    And User enter file 
    Then User click Send New Request
    
