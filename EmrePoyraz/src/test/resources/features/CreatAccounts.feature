Feature: Create  verify account
  @test2
  Scenario Outline: Create new accounts and verify account has been created
    Given user is navigated to salesforce application
    When user enters valid credentials
    And user clicks on login button
    And user clicks on Accounts button
    And user clics on new button
    And user enter "<Name>","<Phone>" details
    And user clicks save button
    Then user verify your account has been created "<Name>"
    Examples:
    |Name|Phone|
    |Emre|0000000001|


