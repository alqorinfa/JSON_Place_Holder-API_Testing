package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.GetAllPost;

public class GetAllPostSteps {

    @Steps
    GetAllPost getAllPost;

    @Given("I set api endpoint for get all post")
    public void setApiEndpoint() {
        getAllPost.setApiEndpoint();
    }

    @When("I send request to get all post")
    public void sendGetAllUserRequest() {
        getAllPost.sendGetAllPostRequest();
    }

    @Then("I receive status code 200")
    public void receiveStatusCode() {
        getAllPost.receiveStatusCode();
    }

    @And("I receive valid data of all post")
    public void receiveValidAllUserData() {
        getAllPost.receiveValidPostData();
    }
}
