Feature: Edit Account
  @test3
  Scenario: Edit Account you just created
    Given user is navigated to salesforce application
    When user enters valid credentials
    And user clicks on login button
    And user clicks on Accounts button
    And user cliks on NameLabel
    And user cliks on Name Pencil for edit name
    And user send new Account Name "<GoodTesterEmre>"
    And user click Save Button
    Then verify it was edit "<GoodTesterEmre>"

