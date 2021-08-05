package restAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

//Consumer API keys,consumer secret
//Access token and Access token secret
public class RestAssuredOath1 {

	public void oAuth1() {
		
		// y putting down 4 parameters for authorization we get the response
	Response resp=RestAssured.given().auth().oauth(null, null, null, null).post();
	//We are getting the response body
	resp.getBody().toString();
	//We are getting the status code
	resp.getStatusCode();
	//We are getting response in json Format and we are prettifying it
	resp.getBody().jsonPath().prettify();
	JsonPath json =resp.jsonPath();
	String newID=json.get("id");
	System.out.println(newID);
	
	}
}
