Feature: Get All Post
  As a admin
  I want to get all post
  So that i can view list of post

  Scenario: As a admin, I can get all post
    Given I set api endpoint for get all post
    When I send request to get all post
    Then I receive status code 200
    And I receive valid data of all post

