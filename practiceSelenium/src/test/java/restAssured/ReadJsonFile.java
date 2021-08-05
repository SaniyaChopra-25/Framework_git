package restAssured;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReadJsonFile {
	
	@Test
	
	public void readJson() throws FileNotFoundException, IOException, ParseException
	{
		
		File file = new File("src/test/resources/JSONExample.json");
		//Parsing the Json File
		Object o = new JSONParser().parse(new FileReader(file));
		//Typecast Obj to JSON Object
		JSONObject obj=(JSONObject)o;
		String firstName= (String) obj.get("firstName");
		String lastName= (String) obj.get("lastName");
		System.out.println(firstName);
		System.out.println(lastName);
		
	    Map address= ((Map)obj.get("address"));
	    
	    Iterator<Map.Entry> itr=address.entrySet().iterator();
	    while(itr.hasNext())
	    {
	    	Map.Entry addresspair= itr.next();
	    	System.out.println(addresspair.getKey() + ":" + addresspair.getValue());
	    	
	    }
	    
        JSONArray ja=(JSONArray) obj.get("phoneNumbers");
        Iterator itr2=ja.iterator();
        while(itr2.hasNext())
        {
        	itr= ((Map)itr2.next()).entrySet().iterator();
        	Map.Entry tel = itr.next();
        	System.out.println(tel.getKey() + ":" + tel.getValue());
        	
        }
	}
	
	
		
		
		
	}


