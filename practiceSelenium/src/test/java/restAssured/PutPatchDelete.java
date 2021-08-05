package restAssured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutPatchDelete {
@Test
public void put() 
{
	

	JSONObject req= new JSONObject();
	req.put("name", "Uday");
	req.put("job", "Hello");
	
	baseURI="https://reqres.in";
	given().headers("Content-Type","application/json").body(req.toJSONString()).when().put("/api/users/2")
	.then().statusCode(200).log().all();
	
}
//https://reqres.in/api/users/2


@Test
public void patch()
{

	JSONObject req= new JSONObject();
	req.put("name", "Uday");
	req.put("job", "Hello");
	
	baseURI="https://reqres.in";
	given().headers("Content-Type","application/json").body(req.toJSONString()).when().patch("/api/users/2")
	.then().statusCode(200).log().all();
	
	}
@Test
public void delete()
{
	

	baseURI="https://reqres.in";
  given().when().delete("/api/users/2")
	.then().statusCode(204).log().all();
	}


}
