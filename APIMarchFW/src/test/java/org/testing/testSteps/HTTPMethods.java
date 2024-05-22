package org.testing.testSteps;

import static io.restassured.RestAssured.*;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HTTPMethods {
	
	Properties pr;
	
	public HTTPMethods(Properties pr) {
		this.pr = pr;
	}
	
	public Response postMethod(String jsonBody, String uriKeyName) {
		String uriValue = pr.getProperty(uriKeyName);
		Response res =
		given()
		.contentType(ContentType.JSON)
		.body(jsonBody)
		.when()
		.post(uriValue);
		
		System.out.println("Status code is " + res.statusCode());
		return res;
	}
	
	public void getAlltMethod(String uriKeyName) {
		String uriValue = pr.getProperty(uriKeyName);
		Response res =
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uriValue);
		
		System.out.println("Status code is " + res.statusCode());
		System.out.println("Response data is: ");
		System.out.println(res.asString());
	}
	
	public void getParticulartMethod(String uriKeyName, String endPointValue) {
		String uriValue = pr.getProperty(uriKeyName) + "/" + endPointValue;
		Response res =
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uriValue);
		
		System.out.println("Status code is " + res.statusCode());
		System.out.println("Response data is: ");
		System.out.println(res.asString());
	}
	
}
