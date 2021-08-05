package restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAssuredAuthentication extends BaseClass{
	@Test
	public void preemetiveAut()
	{
		
		int code = RestAssured.given().auth().preemptive().basic("ToolsQA", "TestPassword").when().get("https://restapi.demoqa.com/authentication/CheckForAuthentication/").getStatusCode();
		System.out.println(code);
		
	}
	
	public void preemetiveAutSecond()
	{
		
		int code = RestAssured.given().get().getStatusCode();
		System.out.println(code);
		
	}

}
