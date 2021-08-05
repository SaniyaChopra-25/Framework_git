package restAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class CheckMethods {
@Test
	public void getStatusCode()
	
	{
		Response resp= get("https://reqres.in/api/users?page=1");
		long time=get("https://reqres.in/api/users?page=1").getTime();
		int code=resp.getStatusCode();
		//String data =resp.asString();
		System.out.println("Status Code is "+ code);
		Assert.assertEquals(code, 200);
	}
	
	@Test
	
	public void getBody()
	{
		String data=get("https://reqres.in/api/users?page=1").asString();
		long time=get().getTime();
		System.out.println(data);
		
	}
	
	@Test
	
	public void checkStatus() {
		
		
		baseURI="https://reqres.in/";
		given().post("api/users").then().statusCode(201).body("data[0].id", equalTo(7));
	}
	

}
