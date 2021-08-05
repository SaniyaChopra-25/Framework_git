package restAssured;

import org.testng.annotations.Test;
import io.restassured.response.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class RestAssuredOAuth2 {
	@Test
	
	public void oauth2()
	{
		Response resp=RestAssured.given().auth().oauth2("504947fe295b5b2368a2c9616fb2dd96ebddf156").post("http://coop.apps.symfonycasts.com/api/USER_ID/chickens-feed");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getBody().asString());
		
	}
	@Test
	public void generateToken()
	//We need to use Form parameters
	{
	Response resp=	RestAssured.given().formParam("client_id", "SaniyaAPP").formParam("client_secret", "e01797de881d728cb4d00d2e97933194")
			.formParam("grant_type", "authorization_code").post("http://coop.apps.symfonycasts.com");
System.out.println(resp.getStatusCode());
	 JsonPath responseJsonPath = new JsonPath(resp.asString());
     String namef = responseJsonPath.getString("access_token");
		 //String tok=resp.jsonPath().get("access_token");
			/*
			 * Response resp1=RestAssured.given().auth().oauth2(
			 * "504947fe295b5b2368a2c9616fb2dd96ebddf156").post(
			 * "http://coop.apps.symfonycasts.com/api/2089/eggs-collect");
			 * System.out.println(resp1.getStatusCode());
			 * System.out.println(resp1.getBody().asString());
			 */
		
	}

}
