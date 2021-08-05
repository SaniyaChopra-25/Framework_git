package restAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import io.restassured.response.*;
import static io.restassured.RestAssured.*;
public class restAssuredPracticeJSONOBJECT {
	//Json Object is used to send body in Rest Assured
	@Test
	
	public void postRequest()
	{
		RequestSpecification request=RestAssured.given();
		request.headers("Content-Type","application/json");
		
		JSONObject obj=new JSONObject();
		obj.put("id", "3");
		obj.put("title", "json-server");
		obj.put("author", "ud");
		request.body(obj.toJSONString());
		Response res=request.post("http://localhost:3000/posts/2");
		int code=res.getStatusCode();
		System.out.println(code);
		//Assert.assertEquals(code,":404");
	}

}
