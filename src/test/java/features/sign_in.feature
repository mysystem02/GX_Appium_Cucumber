Feature: Mobile Login Functionality

  Scenario: Login with valid credentials
    Given User launches the app on "Android"
    When User enters "arifraza" and "1234567"
    Then User should see the homepage

  Scenario Outline: Verify login with multiple credentials
    Given The app is launched on "Android"
    When I enter username "<username>" and password "<password>"
    And I click the login button
    Then I should see the home screen

    Examples:
      | username       | password |
      | user1@test.com | pass123  |
      | user2@test.com | pass456  |
      | user3@test.com | pass789  |