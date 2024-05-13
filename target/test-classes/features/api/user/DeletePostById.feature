Feature: Delete Post By ID
  As a admin
  I want to delete post by ID
  So that post is deleted

  Scenario: As a admin I want to delete post by ID
    Given I set api endpoint to delete post by ID
    When I send request to delete post by ID
    Then I receive status code 200
    And I receive empty data