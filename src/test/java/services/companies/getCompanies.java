package services.companies;

import config.APIConfig;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertNotNull;

public class getCompanies {
    @Test
    public void getCompanyID() {
        RestAssured.baseURI = APIConfig.FakerAPI.BASE_URL;

        String responseBody =
                given().
                    get(APIConfig.FakerAPIEndpoints.COMPANIES).
                then().
                    assertThat().
                    statusCode(200).
                    body(JsonSchemaValidator.matchesJsonSchemaInClasspath("jsonSchema/getCompany.json")).
                    extract().asString();

        JsonPath jsonPath = new JsonPath(responseBody);
        List<Map<String, Object>> companyIDS = jsonPath.getList("data");
        for (Map<String, Object> company : companyIDS) {
            assertNotNull(company.get("id").toString(), "ID is not null");
        }


    }
}
