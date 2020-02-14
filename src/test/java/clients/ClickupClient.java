package clients;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import javax.ws.rs.core.Response;

import static io.restassured.RestAssured.given;

public class ClickupClient
{
    private static final String API_TOKEN = "pk_4532455_G60YUEMMKWBBHGOOFVU2PR4I8UHZHBTY";
    private static final String CLICKUPSPACE_ID = "2493387";
    private static final String CLICKUPFOLDER_ID = "6858138";
    private static final String CLICKUPSPACE = "/space/";
    private static final String CLICKUPFOLDER = "/folder/";
    private static final String CLICKUPBASE_URL = "https://api.clickup.com/api/v2";

    public ValidatableResponse createClickupFolder()
    {
        return given()
                .header("Authorization", API_TOKEN)
                .contentType(ContentType.JSON)
                .body("{\n\"name\": \"NewFolder\" } ")
                .when()
                .post(CLICKUPBASE_URL + CLICKUPSPACE + CLICKUPSPACE_ID + CLICKUPFOLDER)
                .then()
                .log()
                .ifValidationFails()
                .statusCode(Response.Status.OK.getStatusCode());
    }

    public ValidatableResponse fetchFolder()
    {
        return given()
                .header("Authorization", API_TOKEN)
                .when()
                .post(CLICKUPBASE_URL + CLICKUPFOLDER + CLICKUPFOLDER_ID)
                .then()
                .log()
                .ifValidationFails()
                .statusCode(Response.Status.OK.getStatusCode());
    }

    public static void deleteFolder()
    {
        given()
                .header("Authorization", API_TOKEN)
                .when()
                .delete(CLICKUPBASE_URL + CLICKUPFOLDER + CLICKUPFOLDER_ID)
                .then()
                .log()
                .ifValidationFails()
                .statusCode(Response.Status.OK.getStatusCode());
    }


}
