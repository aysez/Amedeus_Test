package stepdefinitions;

import io.cucumber.java.en.When;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class FlighAppAPI01 {
    @When("User verify status code is {int} and content type")
    public void user_verify_status_code_is_and_content_type(Integer int1) {
        String url = "https://flights-api.buraky.workers.dev/";
        Response response = given().when().get(url);
        response.prettyPrint();
        response.then().statusCode(200).contentType("application/json").statusLine("HTTP/1.1 200 OK");
    }
}
