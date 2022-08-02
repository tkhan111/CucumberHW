@OtherLoginFeature1
Feature: TechFios Login validation

  Background: 
    Given User is on the Techfios login page

  @ExampleScenario1
  Scenario Outline: User should be able to login with correct credential
    When User enters "<username>" and "<password>"
    And User clicks on the Submit button
    Then User should land on dashboard page
    And User clicks on "<bankCash>" and "<newAccount">
    Then User should land of New Account Page
    And user enters "<accountTitle>" and "<description>" and "<initialBalance>" and "<accountNumber>" and "<contactPerson>" and "<contactPhone>" and "<url>"
    And User clicks on the new account submit button
    Then user should land on account created page
    Then validate the account created

    Examples: 
      | username          | password | accountTitle | description | initialBalance | accountNumber | contactPerson | contactPhone | url    |
      | demo@techfios.com | abc123   | 394583049234 | mysavings   |         200000 | xdflskdf      | sldgiueoir    | woeiuoif     | lijdfs |
