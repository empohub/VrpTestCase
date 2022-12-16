Feature: Login scenarios
  @test1
  Scenario:Success login
    Given user is navigated to salesforce application
    When user enters valid credentials
    And user clicks on login button
    Then  user is successfully logged in



