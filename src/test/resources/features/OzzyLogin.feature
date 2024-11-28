Feature: Google login functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search anything and see relevant results

  @login
  Scenario: login result title verification
    Given user is on the cydeo search page
    When user enters "orange" in the Google search box
    Then user clicks on the search button
    Then user should see "orange" in the title
