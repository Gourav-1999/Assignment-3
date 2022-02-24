Feature: Feature to test spice jet welcome board

  Scenario Outline: validate spiceJet welcome board
    Given user is on spiceJet welcome board page
    When user select "<from>" and "<to>" cities
    And user select "<date>" from calender
    And user click on search flight
    Then user nevigate to flights page

    Examples: 
      | from | to    | date |
      | Goa  | Delhi | 16-May-2022 |
