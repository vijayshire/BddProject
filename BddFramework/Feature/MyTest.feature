Feature: Login To Flipkart
  Scenario: I want to Login to flipkart
    Given Open Flipkart
    And click on Login button
    When I enter username 
    And i enter password
    Then I click on ok button
    Then i am able to login