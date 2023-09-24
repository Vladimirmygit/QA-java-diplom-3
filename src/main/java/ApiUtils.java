import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.is;

public class ApiUtils extends BaseTest {
    private String accessToken;
    String randomUsername = TestData.VALID_NAME;
    String randomEmail = TestData.VALID_EMAIL;
    String randomPassword = TestData.VALID_PASSWORD;

    public String createNewUser() {
        Response response = given()
                .contentType("application/json")
                .body("{\"email\": \"" + randomEmail + "\", \"password\": \"" + randomPassword + "\", \"name\": \"" + randomUsername + "\"}")
                .when()
                .post("/api/auth/register")
                .then()
                .statusCode(200)
                .body("success", is(true))
                .extract()
                .response();

        accessToken = response.path("accessToken");
        System.out.println("accessToken: " + accessToken); // Вывести accessToken в консоль
        return accessToken;

    }
public String LoginAccount() {
    Response response = given()
            .contentType("application/json")
            .body("{\"email\": \"" + randomEmail + "\", \"password\": \"" + randomPassword + "\", \"name\": \"" + randomUsername + "\"}")
            .when()
            .post("/api/auth/login")
            .then()
            .statusCode(200)
            .body("success", is(true))
            .extract()
            .response();

    accessToken = response.path("accessToken");
    System.out.println("accessToken: " + accessToken); // Вывести accessToken в консоль
    return accessToken;
}
    public void deleteUser() {
        given()
                .contentType("application/json")
                .header("Authorization", accessToken)
                .when()
                .delete("/api/auth/user")
                .then()
                .statusCode(202)
                .body("success", is(true));
    }

}
