package restAssured;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import java.util.HashMap;
import java.util.Map;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.path.xml.XmlPath;
import com.jayway.restassured.response.Response;

import cucumber.api.java.en.When;
public class RestAssuredSampleTest {
 public static void main(String[] args) {
	 RestAssured.baseURI="http://dummy.restapiexample.com";
	 RestAssured.port=80;
	 //get Example
	 Response resp = RestAssured.get("/api/v1/employees");
	
	 System.out.println(resp.getStatusCode());
	 System.out.println("The data is");
	 System.out.println(resp.jsonPath().toString());
	 System.out.println(resp.jsonPath().getString("employee_name"));
	 //post example
	 Map map = new HashMap<String,String>();
	 map.put("contenttype", "application/xml");
	 given().headers(map).contentType(ContentType.JSON).body("Sample Request".toString()).when().post("URL");
	 resp = given().when().body("REquest xml").get("url");
	String	responseBody = resp.asString();
		System.out.println(resp.getStatusCode());
		System.out.println(resp.asString());
			JsonPath.from(responseBody.toString()).get("transactionRates[0].value").toString();
			resp.jsonPath().get("Name.id");
			XmlPath.from(responseBody.toString()).get("transactionRates[0].value").toString();
			resp.jsonPath().get("Name.id");
}
}
