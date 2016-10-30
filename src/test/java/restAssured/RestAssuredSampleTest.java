package restAssured;

import static com.jayway.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
public class RestAssuredSampleTest {
 public static void main(String[] args) {
	 //get Example
	 Response resp = given().when().get("resource");
	 //post example
	 Map map = new HashMap<String,String>();
	 map.put("contenttype", "application/xml");
	 given().headers(map).contentType(ContentType.JSON).body("Sample Request".toString()).when().post("URL");
	 resp = given().when().body("REquest xml").get("url");
	String	responseBody = resp.asString();
		System.out.println(resp.getStatusCode());
		System.out.println(resp.asString());
			JsonPath.from(responseBody.toString()).get("transactionRates[0].value").toString();
}
}
