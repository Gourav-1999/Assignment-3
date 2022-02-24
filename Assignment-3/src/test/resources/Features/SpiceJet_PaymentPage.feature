Feature: verify selected cities are displayed correctly and flight prices are same or not

  Background: user is on payment page
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
     Given user is on spiceJet passengers page
    When user fill contact details "Mr","Balle","Balle","9876543210","asd@gmail.com","Mirzapur"
    Then user fill passenger details "Balle", "Balle" ,"9876543210"
    And click on continue button
    Then user navigate to next page
     Given user already fill passenger details and user is on Add-on page
    When user first select "1A"
    And user book private row or extra seat for extra comfort and safety
    And user accept terms and conditions for extra seat
    And click on continue button and user click on meals button
    And user select meals and click on done button
    Then user nevigate to Add-on page
    And click on continue button again
    Then user nevigate to payment page

  Scenario: validate selected cities are displayed correctly and flight prices are same or not
    Given user is on payment page
    When user fetch data from payment page
    And verify the prices and cities name are same or not
    And verify prices without adding convenience fee
    Then user print message all test cases are correctlly done
