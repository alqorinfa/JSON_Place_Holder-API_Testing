package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.ChangePostById;

public class ChangePostByIdSteps {
    @Steps
    ChangePostById changePostById;

    @Given("I set api endpoint to change post by ID")
    public void setApiEndpoint() {
            changePostById.setApiEndpoint(1);
        }

    @When("I send request to change post by ID")
    public void sendChangePostByIdRequest() {
        changePostById.sendChangePostByIdRequest(1);
    }
    @Then("I receive status code 200 of changed post")
    public void receiveStatusCode200() {
        changePostById.receiveStatusCode200();
    }
    @And("I receive a valid changed post data by ID")
    public void receiveValidChangedPostData() {
        changePostById.receiveValidChangedPostData();
    }

    @When("I send request to change post with empty inputs")
    public void sendChangeToEmptyPostRequest() {
        changePostById.sendChangedToEmptyPostRequest(1);
    }

    @Then("I receive status code error 400 of changed post")
    public void receiveStatusCodeError400() {
        changePostById.receiveStatusCode400();
    }

}


