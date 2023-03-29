Feature: Dashboard
  Background:
    Given User is looking at the Buggy Cars Rating

  Scenario: View Popular Make (TC-004)
      When user clicks "Popular Make" item
      Then user can see "Alfa Romeo" as the popular make

  Scenario: View Popular Model (TC-005)
    When user clicks "Popular Model" item
    Then user can see "Guilia Quadrifoglio" as the popular model

  Scenario: View Overall Rating (TC-006)
    When user clicks "Overall Rating" item
    Then user can see the Model "Guilia Quadrifoglio" from the Make "Alfa Romeo" has the most votes
