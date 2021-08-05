package restAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class AllMethodWithLocalAPI {
	@Test
	public void get()
	{
		baseURI="http://localhost:3000/";	
		given().get("/resources").then().log().all();
		
	}
	@Test
	public void post()
	{
		baseURI="http://localhost:3000/";
		JSONObject resp =new JSONObject();
		resp.put("id","4");
		resp.put("title", "CE");
		resp.put("author", "sid");
		given().headers("Content-Type","application/json").body(resp.toJSONString()).when().post("resources").then().log().all();
	}

	@Test
	public void put()
	{
		baseURI="http://localhost:3000/";
		JSONObject resp =new JSONObject();
		resp.put("id",4);
		resp.put("title", "CivilE");
		resp.put("author", "sid");
		given().headers("Content-Type","application/json").body(resp.toJSONString()).when().put("resources/4").then().log().all();
	}
	@Test
	public void patch()
	{
		baseURI="http://localhost:3000/";
		JSONObject resp =new JSONObject();
		resp.put("title", "CivilEngineer");
		
				given().headers("Content-Type","application/json").body(resp.toJSONString()).when().patch("resources/4").then().log().all();
	}
	@Test
	public void delete()
	{
		baseURI="http://localhost:3000/";
	    when().delete("resources/4").then().log().all();
	}

}
