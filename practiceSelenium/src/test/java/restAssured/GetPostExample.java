package restAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetPostExample {
	@Test
	public void get()
	
	{
		https://reqres.in/api/users
		  baseURI="http://localhost:3000/"; 
		 // given().get("api/users").then().statusCode(201).body("data[0].id",equalTo(7)); 
		 		  
			Response name= given().get("users");
             System.out.println(name.asString());
              
			// First get the JsonPath object instance from the Response interface
             JsonPath responseJsonPath = new JsonPath(name.asString());
            String namef = responseJsonPath.getString("name");
            Integer id = responseJsonPath.getInt("postId");
            		 System.out.println(namef);
            		 System.out.println(id);
   
	}

	@DataProvider(name = "DataForPost")
	public Object[][] dataForPost(){
		return new Object[][]
				{
			{"Saniya","Chemistry",5},
			{"Uday","Physics",6}
		};
		
	}
	@Test(dataProvider = "DataForPost")
	public void post(String name,String subjectname,int postId)
	
	{
	//	System.out.println(name + ":" + subjectname + ":" + postId);
		
		
		  JSONObject req= new JSONObject(); req.put("name", name);
		  req.put("subjectname", subjectname); req.put("postId", postId);
		  System.out.println(req.toJSONString());
			/*
			 * baseURI="http://localhost:3000/";
			 * given().headers("Content-Type","application/json").body(req.toJSONString()).
			 * when().post("users") .then().log().all();
			 */
		  
		 
		
	}
	@Test(enabled=false)
	public void put() 
	{
		

		JSONObject req= new JSONObject();
		req.put("name", "Uday");
		req.put("job", "Hello");
		
		baseURI="http://localhost:3000/";
		given().headers("Content-Type","application/json").body(req.toJSONString()).when().put("users")
		.then().statusCode(200).log().all();
		
	}

}
