package services.companies;

import config.APIConfig;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.AssertJUnit.assertNotNull;

public class getCompaniesQuantity {

    @Test
    public void getCompanyQuantityReturned() {
        //test data company
        int[] testData = {20, 5, 1};

        for (int quantity : testData) {
            getCompanyQuantity(quantity);
        }

    }
    public void getCompanyQuantity(int quantity) {
        RestAssured.baseURI = APIConfig.FakerAPI.BASE_URL;

        given().
            queryParam("_quantity", quantity).
        when().
            get(APIConfig.FakerAPIEndpoints.COMPANIES).
        then().
            assertThat().
            statusCode(200).
            body("total", equalTo(quantity)).
            body("data.size", equalTo(quantity));
    }


}
