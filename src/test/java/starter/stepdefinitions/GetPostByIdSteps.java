package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.GetPostById;

public class GetPostByIdSteps {
    @Steps
    GetPostById getPostById;

    @Given("I set api endpoint to get post by ID")
    public void setApiEndpoint() {
        getPostById.setApiEndpoint(1);
    }
    @When("I send request to get post by id")
    public void sendGetPostByIdRequest() {
        getPostById.sendGetPostByIdRequest(1);
    }

    @And("I receive valid data of post data by ID")
    public void receiveValidPostDataByID() {
        getPostById.receiveValidPostData();
    }

    }


