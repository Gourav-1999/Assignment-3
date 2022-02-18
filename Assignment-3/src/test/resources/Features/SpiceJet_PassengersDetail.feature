Feature: fill passenger details

  Background: 
    Given user is on spiceJet welcome board page
    When user select from and to cities
    And user select Departure date from calender
    And user click on search flight
    Then user nevigate to flights page
    Given user is on spiceJet flight search page
    When user select any flight
    And user select spicemax radio button and fetch flight number and price
    And user click on continue button
    Then user navigate to passengers page

  Scenario: validate spiceJet passengers page
    Given user is on spiceJet passengers page
    When user fill contact details and passenger information
    And click on continue button
    Then user navigate to next page
