package starter.user;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.isEmptyOrNullString;

public class DeletePostById {
    private static String url = "https://jsonplaceholder.typicode.com/posts/";

    @Step("I set api endpoint to delete post by ID")
    public String setApiEndpoint(int postId) {
        return url + postId;
    }

    @Step("I send request to delete post by ID")
    public void sendDeletePostByIdRequest(int postId) {
        SerenityRest.given()
                .delete(setApiEndpoint(postId));
    }

    @Step("I receive empty data")
    public void receiveEmptyPostData() {
        restAssuredThat(response -> response.body("'title'", isEmptyOrNullString()));
        restAssuredThat(response -> response.body("'body'", isEmptyOrNullString()));
    }
}