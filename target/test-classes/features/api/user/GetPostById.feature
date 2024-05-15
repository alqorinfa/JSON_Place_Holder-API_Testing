Feature: Get post by ID
  As a admin
  I want to get post by ID
  So that the post is showed

  Scenario: As a admin I want to get post by ID
    Given I set api endpoint to get post by ID
    When I send request to get post by id
    Then I receive status code 200
    And I receive valid data of post data by ID

  Scenario: As a admin I want to get post by unexisted ID
    Given I set api endpoint to get post by ID
    When I send request to get post by unexisted id
    Then I receive status code error 400