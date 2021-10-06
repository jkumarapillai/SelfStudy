//This is a sample test
Feature: User tries to login to website

  Scenario Outline: User login
    Given user has opened the login page
    And typed in <username> and <password>
    When user clicks the login button
    Then home page should be loaded

    Examples: 
      | username | password |
      | jaya     |    12345 |
      | aaaa     |    12345 |
