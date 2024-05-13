Feature: Create New Post
  As a admin
  I want to create new post
  So that my post is saved

  Scenario: As a admin I can create a new post with valid inputs
    Given I set api endpoint to create a new post
    When I send request to create a new post
    Then I receive status code 201
    And I receive valid data of created new post

  Scenario: As a admin I cannot create a new post with empty inputs
    Given I set api endpoint to create a new post
    When I send request to create a new post with empty inputs
    Then I receive status code error 400
