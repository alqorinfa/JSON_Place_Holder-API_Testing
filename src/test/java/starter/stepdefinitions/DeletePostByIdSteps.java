package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.DeletePostById;

public class DeletePostByIdSteps {
    @Steps(shared=true)
    DeletePostById deletePostById;

    @Given("I set api endpoint to delete post by ID")
    public void setApiEndpoint() {
        deletePostById.setApiEndpoint(1);
    }

    @When("I send request to delete post by ID")
    public void sendDeleteRequest() {
        deletePostById.sendDeletePostByIdRequest(1);
    }

    @And("I receive empty data")
    public void receiveEmptyData() {
        deletePostById.receiveEmptyPostData();
    }
}
