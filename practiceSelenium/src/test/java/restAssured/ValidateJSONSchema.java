package restAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
//import static io.restassured.module.jsv.JsonSchemaValidaton.matchesJsonSchemaInClasspath;

import org.testng.annotations.Test;

public class ValidateJSONSchema {
	@Test
	public void get()
	{
		https://reqres.in/api/users?page=2
		baseURI="https://reqres.in/";
		//given().get("api/users?page=2").then().assertThat().body(JsonSchemaValidaton.matchesJsonSchemaInClasspath("Schema.json"));
	}

}
