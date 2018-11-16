#Author: your.email@your.domain.com
Feature: Payment
Scenario: Verify card holder name for null inputs
Given User is on payment page
When User does not enter card holder name
Then prompt user to fill in card holder name

Scenario: Verify debit card number for null inputs
Given User is on payment page
When User does not enter debit card number
Then prompt user to enter debit card number

Scenario: Verify card cvv for null inputs
Given User is on payment page
When User does not enter card cvv
Then prompt user to enter card cvv

Scenario: Verify card expiration year for null inputs
Given User is on payment page
When User does not enter card expiration year
Then prompt user to enter card expiration year

Scenario: Verify Confirmpayment button
Given User is on payment page
When User clicks on confirmpayment button
Then display payment successful


Scenario: Verify card expiration month for null inputs
Given User is on payment page
When User does not enter card expiration month
Then prompt user to enter card expiration month