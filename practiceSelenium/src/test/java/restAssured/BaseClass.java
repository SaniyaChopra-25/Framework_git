package restAssured;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;

public class BaseClass {

	@BeforeClass
	public void setup()
	{
		
RestAssured.authentication=(AuthenticationScheme) RestAssured.given().auth().preemptive().basic("ToolsQA", "TestPassword");
RestAssured.baseURI="https://restapi.demoqa.com/authentication/CheckForAuthentication/";
	}
}
