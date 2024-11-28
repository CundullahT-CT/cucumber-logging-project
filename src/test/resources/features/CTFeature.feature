Feature: Google search functionality ct
  Agile story: As a user, when I am on the Google search page ct
  I should be able to search anything and see relevant results ct

  @googlesearch
  Scenario: Search result title verification ct
    Given user is on the Google search page ct
    When user enters "apple" in the Google search box ct
    Then user clicks on the search button ct
    Then user should see "apple" in the title ct
