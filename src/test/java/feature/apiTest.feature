Feature: Gift Cards feature of Amazon website
  This will test eGift Cards functionality from Amazon website

  Scenario: Select eGift Card from Amazon website

    Given User should be logged in and should be present on Amazon Home page
    And User clicks on eGift Cards Button
    When User select eGift Card
    And User enter the details and clicks on Add to cart button
    Then eGift Card should be added to the Cart for payment