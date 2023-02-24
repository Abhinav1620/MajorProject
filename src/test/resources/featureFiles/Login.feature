Feature: Login using correct credentials
  Scenario: verify login functionality using correct UserName & Password
    Given I navigate to the website
    And I entered correct username and password
    When I clicked login button
    Then I saw Homepage of the website and found my product item
    When I clear all mandatory steps
    Then I will be navigated back to the homepage
    Then I should be logged out from the website