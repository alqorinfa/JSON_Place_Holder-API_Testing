Feature: Change Post by ID
  As a admin
  I can change post by ID
  So that the post is updated

  Scenario: As a admin I can change post by ID with valid inputs
    Given I set api endpoint to change post by ID
    When I send request to change post by ID
    Then I receive status code 200 of changed post
    And I receive a valid changed post data by ID

  Scenario: As a admin I cannot change post by ID with empty inputs
    Given I set api endpoint to change post by ID
    When I send request to change post with empty inputs
    Then I receive status code error 400 of changed post