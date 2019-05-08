package testClasses;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Home_API
{
@Test(enabled=false)
public void a_get()
{
	RestAssured.baseURI = "http://172.16.147.168:8000";
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.request(Method.GET, "/graphql");
	
	System.out.println("Response Body is => " + response.asString());
	
	for (Header header : response.headers())
	{
		System.out.println(" Key: " + header.getName() + " | " + " Value: " + header.getValue());
	}
	
	Assert.assertEquals(response.getStatusCode(), 200);
	Assert.assertEquals(response.header("Content-type"), "application/json; charset=utf-8");
	Assert.assertEquals(response.header("Server"), "Cowboy");
	Assert.assertEquals(response.header("Connection"), "keep-alive");
	Assert.assertEquals(response.header("Transfer-Encoding"), "chunked");
	Assert.assertEquals(response.header("Vary"), "Origin");
	
	System.out.println(response.getBody().asString());
	String body = response.getBody().asString();
	
	Assert.assertEquals(body.contains("record_type") && body.contains("record_id"), true);	
	Assert.assertEquals(response.jsonPath().get("record_type"), "Franchisee");
}

@Test(enabled=true)
public void b_post()
{
	RestAssured.baseURI = "http://gms-qa-api-2122169473.us-east-2.elb.amazonaws.com/";
	RequestSpecification httprequest = RestAssured.given().log().all();
	httprequest.header("Content-Type","application/json");
	httprequest.body("");
	Response response = httprequest.request(Method.POST, "/graphql/");
	
	// JsonObject requestParams = new JsonObject();
	
	System.out.println(response.getBody().asString());
}
}