package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.CreateNewPost;

public class CreateNewPostSteps {
    @Steps
    CreateNewPost createNewPost;

    @Given("I set api endpoint to create a new post")
    public void setApiEndpoint() {
        createNewPost.setApiEndpoint();
    }

    @When("I send request to create a new post")
    public void sendRequestCreateNewPost() {
        createNewPost.sendCreatePostRequest();
    }

    @Then("I receive status code 201")
    public void receiveStatusCode201() {
        createNewPost.receiveStatusCode201();
    }

    @And("I receive valid data of created new post")
    public void receiveValidDataOfNewPost() {
        createNewPost.receiveValidCreatedPostData();
    }

    @When("I send request to create a new post with empty inputs")
    public void sendRequestCreateNewEmptyPost() {
        createNewPost.sendRequestWithEmptyInputs();
    }

    @Then("I receive status code error 400")
    public void receiveStatusCode400() {
        createNewPost.receiveStatusCode400();
    }
}
