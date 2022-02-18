Feature: select any flight and choose spicemax radio button

Background: user is on spiceJet flight search page
Given user is on spiceJet welcome board page
When user select from and to cities
And user select Departure date from calender
And user click on search flight
Then user nevigate to flights page

Scenario: validate spiceJet flight search page

Given user is on spiceJet flight search page
When user select any flight
And user select spicemax radio button and fetch flight number and price
And user click on continue button
Then user navigate to passengers page
