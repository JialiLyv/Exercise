Feature: Logout
  Background:
    Given user is logged in

  Scenario: logout as a user (TC-002)
    When User logs out
    Then User can sees the login button
