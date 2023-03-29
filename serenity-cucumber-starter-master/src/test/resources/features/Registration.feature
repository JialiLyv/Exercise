Feature: Registration
  Background:
    Given User is looking at the Buggy Cars Rating

  Scenario: register as a new user (TC-003)
    When user clicks register
    And user fills the form:
      | Login          | First Name     | Last Name     | Password  | Confirm Password |
      | TEXT_FIRSTNAME | TEXT_FIRSTNAME | TEXT_LASTNAME | Qwer1234! | Qwer1234!        |
    And user confirms register
    Then user should see the success message
