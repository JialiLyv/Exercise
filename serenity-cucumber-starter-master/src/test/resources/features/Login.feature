Feature: Login

  Scenario: login as a user (TC-001)
    Given User is looking at the Buggy Cars Rating
    When User logs into the app with userName "abcd_1234" and password "Qwer1234!"
    Then User can sees the welcome message with name "asdfasdf"
