package starter.user;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class ChangePostById {
    private static String url ="https://jsonplaceholder.typicode.com/posts/";

    @Step("I set api endpoint to change post by ID")
    public String setApiEndpoint(int postId) {
        return url + postId;
    }

    @Step("I send request to change post by id")
    public void sendChangePostByIdRequest(int postId) {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Mengubah post");
        requestBody.put("body", "Ini contoh saat mengubah isi post");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(requestBody.toString())
                .put(setApiEndpoint(postId)); // Menggunakan postId sebagai argumen
    }

    @Step("I receive status code 200")
    public void receiveStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive a valid changed post data by ID")
    public void receiveValidChangedPostData() {
        restAssuredThat(response -> response.body("'title'", equalTo("Mengubah post")));
        restAssuredThat(response -> response.body("'body'", equalTo("Ini contoh saat mengubah isi post")));
    }

    @Step("I send request to change post with empty inputs")
    public void sendChangedToEmptyPostRequest(int postId) {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "");
        requestBody.put("body", "");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(requestBody.toString())
                .put(setApiEndpoint(postId)); // Menggunakan postId sebagai argumen
    }

    @Step("I receive status code error 400")
    public void receiveStatusCode400() { restAssuredThat(response -> response.statusCode(400)); }
}
