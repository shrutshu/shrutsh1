#Author: your.email@your.domain.com

Feature: Conference Registration

Scenario: Verify title of page
Given User is on registration page
Then check the heading of page

Scenario: Verify first  name for blank input
Given User is on registration page
When User does not enter firstname 
Then prompt user to fill in details

Scenario: Verify  last name for blank input
Given User is on registration page
When User does not enter  lastname
Then prompt user to fill last name

Scenario: Verify email in  the correct format
Given User is on registration page
When User does not enter email in correct format
Then prompt user to write email correctly

Scenario: Verify contact number for null input
Given User is on registration page
When User does not enter contact number
Then prompt user to enter contact number

Scenario: Verify valid contact number
Given User is on registration page
When User enters invalid contactNo format and clicks the button
|900987656789|
|8456745|
|5465763232|
|0983236768|
| |
Then display alert msg



Scenario: Verify Building name and room no for null inputs
Given User is on registration page
When User does not address
Then prompt user to fill in the building & room no


Scenario: Verify area name for null input
Given  User is on registration page
When User does not fill area name
Then prompt user to fill in the area name



Scenario: Verify city for null inputs
Given User is on registration page
When User does not select city
Then prompt user to select city

Scenario: Verify state for null inputs
Given User is on registration page
When User does not select state
Then prompt user to select state


Scenario: Verify no of people
Given User is on registration page
When User does not select no of people
Then Prompt user to select