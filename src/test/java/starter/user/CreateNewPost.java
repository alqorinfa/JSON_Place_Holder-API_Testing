package starter.user;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateNewPost {
    private static String url ="https://jsonplaceholder.typicode.com/posts";

    @Step("I set api endpoint to create a new post")
    public String setApiEndpoint() {
        return url ;
    }

    @Step("I send request to create a new post")
    public void sendCreatePostRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Tugas REST API");
        requestBody.put("body", "Ini jawaban untuk latihan bagian REST API");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(requestBody.toString())
                .post(setApiEndpoint());
    }

    @Step("I receive status code 201")
    public void receiveStatusCode201() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I receive valid data of created new post")
    public void receiveValidCreatedPostData() {
        //TODO: JSON Schema for validation
        restAssuredThat(response -> response.body("'title'", equalTo("Tugas REST API")));
        restAssuredThat(response -> response.body("'body'", equalTo("Ini jawaban untuk latihan bagian REST API")));
    }

    @Step("I send request to create a new post with empty inputs")
    public void sendRequestWithEmptyInputs() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "");
        requestBody.put("body", "");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(requestBody.toString())
                .post(setApiEndpoint());
    }

    @Step("I receive status code error 400")
    public void receiveStatusCode400() { restAssuredThat(response -> response.statusCode(400)); }
}
