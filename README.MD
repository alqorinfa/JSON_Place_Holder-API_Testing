# JSONPlaceHolder API Testing

This repository contains automated tests for JSONPlaceHolder API using Rest Assured.
Link: https://jsonplaceholder.typicode.com/

## Test Cases
There are 7 test cases in total, including 2 error scenarios.

### Error Scenarios
1. **Scenario:** As an admin, I cannot change post by ID with empty inputs.
    - **Expected Behavior:** Admin should not be able to change a post with empty inputs.
    - **Actual Behavior:** Admin can change a post with empty inputs (Error).
2. **Scenario:** As an admin, I cannot create a new post with empty inputs.
    - **Expected Behavior:** Admin should not be able to create a new post with empty inputs.
    - **Actual Behavior:** Admin can create a new post with empty inputs (Error).

## Getting Started
To run these tests locally, follow these steps:
1. Clone this repository to your local machine.
2. Make sure you have Java and Maven installed.
3. Navigate to the project directory in your terminal.
4. Run `mvn clean verify` command to execute the tests.

## Dependencies
- JUnit
- Maven# JSON_Place_Holder-API_Testing
