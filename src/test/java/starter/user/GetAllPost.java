package starter.user;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetAllPost {
    private static String url ="https://jsonplaceholder.typicode.com/posts/";

    @Step("I set api endpoint for get all post")
    public String setApiEndpoint() {
        return url;
    }

    @Step("I send request to get all post")
    public void sendGetAllPostRequest() {
        SerenityRest.given()
                .get(setApiEndpoint());
    }

    @Step("I receive status code 200")
    public void receiveStatusCode() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data of all post")
    public void receiveValidPostData() {
        //TODO: JSON Schema for validation
        restAssuredThat(response -> response.body("'userId'", notNullValue()));
        restAssuredThat(response -> response.body("'id'", notNullValue()));
        restAssuredThat(response -> response.body("'title'", notNullValue()));
        restAssuredThat(response -> response.body("'body'", notNullValue()));
    }
}
