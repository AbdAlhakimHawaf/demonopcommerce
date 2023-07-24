@smoke
Feature: F08_Wishlist | users could add item to wishlist
  Scenario: user can add HTC mobile to wishlist
    Given user go to home page for wish list
    And click on HTC mobile wishlist
    Then Message of The product has been added to your wishlist will appear
  Scenario: user can add HTC mobile to wishlist
    Given user go to home page for wish list
    And click on HTC mobile wishlist
    And click on Wishlist Button
    Then he will find that Qty more than zero