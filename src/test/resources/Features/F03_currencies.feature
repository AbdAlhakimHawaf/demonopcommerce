@smoke
Feature: F03_currencies | users could use home page functionality to change currencies of products
  Scenario: user could change currencies to Euro
    Given user go to home page
    When user click on currency drop down and choose Euro currency
    Then user can see price in Euro currency