Feature: Create Login

@Test
Scenario: Create a new login

    Given I am on the login page
    When I enter the login details
    Then a new login account is created successfully