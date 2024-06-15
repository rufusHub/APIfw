package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonParsing;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_Post_restapiexample {

//	public static String returnIdValue;
	@Test
	public void tc1() throws IOException {
		
		String path_1 = "..//APIMarchFW/URI.properties.restapiexample";
		String path_2 = "..//APIMarchFW/src/test/java/org/testing/resources/requestBody_restapiexample.json";
		String uriKeyName = "RAE_POST_URI";
		String variableName = "name";
		
		
		Properties prop = PropertiesHandle.loadProperties(path_1);
		
		String requestBody = JsonHandle.readJsonData(path_2);
		
//		System.out.println("Enter 'name' Value: ");
//		Scanner s = new Scanner(System.in);
//		String IdValue = s.next();
		
		String IdValue = "Rufonte";
		requestBody = JsonReplacement.assignJsonValue(requestBody, variableName , IdValue);
		
		HTTPMethods http = new HTTPMethods(prop);
		Response res = http.postMethod(requestBody, uriKeyName);
		
		System.out.println(res.asString());
		
//		returnIdValue = JsonParsing.doParsing(res, "salary");
//		System.out.println(returnIdValue);
	}
}

