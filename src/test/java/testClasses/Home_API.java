package testClasses;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Home_API
{
@Test
public void a()
{
	RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.request(Method.GET, "/Hyderabad");
	System.out.println(response.statusCode());
	Assert.assertEquals(response.statusCode(), 200);
	String responseBody = response.getBody().asString();
	System.out.println("Response Body is =>  " + responseBody);
}
}
