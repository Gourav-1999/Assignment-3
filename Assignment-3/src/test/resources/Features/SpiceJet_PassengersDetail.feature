Feature: fill passenger details

  Background: 
    Given user is on spiceJet welcome board page
    When user select "DEL" and "BLR" cities
    And user select "18-March-2022" from calender
    And user click on search flight
    Then user nevigate to flights page
    Given user is on spiceJet flight search page
    When user select any flight
    And user select spicemax and fetch flight number and price
    And user click on continue button
    Then user navigate to passengers page

  Scenario Outline: validate spiceJet passengers page
    Given user is on spiceJet passengers page
    When user fill contact details "<title>","<name>","<lastName>","<contact>","<email>","<city>"
    Then user fill passenger details "<name>", "<lastName>" ,"<number>"
    And click on continue button
    Then user navigate to next page

    Examples: 
      | title | name  | lastName | contact    | email         | city          | name  | lastName | number     |
      | Mr    | Balle | Balle    | 9876543210 | abc@gmail.com | Furfuri nagar | Balle | Balle    | 9876543210 |
