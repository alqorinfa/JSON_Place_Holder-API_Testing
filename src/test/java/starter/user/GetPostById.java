package starter.user;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetPostById {
    private static String url ="https://jsonplaceholder.typicode.com/posts/";

    @Step("I set api endpoint to get post by ID")
    public String setApiEndpoint(int postId) {
        return url + postId;
    }

    @Step("I send request to get post by id")
    public void sendGetPostByIdRequest(int postId) {
        SerenityRest.given()
                .get(setApiEndpoint(postId));
    }

    @Step("I receive status code 200")
    public void receiveStatusCode() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data of post")
    public void receiveValidPostData() {
        //TODO: JSON Schema for validation
        restAssuredThat(response -> response.body("'userId'", equalTo(1)));
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
        restAssuredThat(response -> response.body("'title'", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));
        restAssuredThat(response -> response.body("'body'", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto")));
    }
}
