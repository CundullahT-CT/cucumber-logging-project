Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search anything and see relevant results

  @googlesearch
  Scenario: Search result title verification
    Given user is on the Google search page
    When user enters "apple" in the Google search box
    Then user clicks on the search button
    Then user should see "apple" in the title
