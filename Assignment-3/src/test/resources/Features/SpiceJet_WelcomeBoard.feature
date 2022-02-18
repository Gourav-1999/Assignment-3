Feature: Feature to test spice jet welcome board

Scenario: validate spiceJet welcome board

Given user is on spiceJet welcome board page
When user select from and to cities
And user select Departure date from calender
And user click on search flight
Then user nevigate to flights page
