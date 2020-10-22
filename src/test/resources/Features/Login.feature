Feature: Validate The C2TA Appliation

Scenario Outline: Validate The Login Opeation of C2TA Appliation

Given you are on the Homepage "https://c2ta.co.in/"
Then click on the login
Then Enter the "<username>" and "<password>"
Then Click submit button
And User able to see the message "Your are logged in as"

Examples:
|username|password|
| rudrika@gmail.com | rudrika1234|
|namitha.h@gmail.com | Change2@123 |


