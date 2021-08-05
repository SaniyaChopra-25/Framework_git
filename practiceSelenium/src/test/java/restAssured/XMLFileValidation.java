package restAssured;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import static io.restassured.RestAssured.*;

import org.apache.commons.io.IOUtils;

import io.restassured.http.ContentType;

public class XMLFileValidation {
	public void soapXMLValidation() throws IOException
	{
		File file = new File("./src/test/resources.SOAP.xml");
		FileInputStream fileinputstream=new FileInputStream(file);
		String requestBody= IOUtils.toString(fileinputstream,"UTF-8");
		baseURI="https://reqres.in/";
		given().contentType("text/xml").accept(ContentType.XML).body(requestBody)
		.when().post("api/users").then().statusCode(200).log().all();
		
		
		
	}

}
