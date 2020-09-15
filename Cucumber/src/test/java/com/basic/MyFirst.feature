Feature: Create acc of FB
Background:
Given User need to be on FB login page
Scenario: Validate First Name field

When Enter following data
|userName |UserSurName |Mobile|
|Tom      |Jerry       | 1234 |
Then User checks first name is present

#Scenario: Validate multiple fields
#Given User need to be on FB login page
#When User enters  first name 
#And user enters sure name
#Then User checks first name is present
#But User mobile should be blank

