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

import io.restassured.response.Response;

public class TC1_PostRequest {
	
	public static String returnIdValue;
	
	@Test
	public void testCase1() throws IOException {
		
		Properties p = PropertiesHandle.loadProperties("..//APIMarchFW/URI.properties");
		String requestBody = JsonHandle.readJsonData("..//APIMarchFW/src/test/java/org/testing/resources/requestBody.json"); 
		System.out.println("Please enter 'id' value.");
		Scanner s = new Scanner(System.in);
		Integer idValue = s.nextInt();
		requestBody = JsonReplacement.assignJsonValue(requestBody, "id", idValue.toString());
		HTTPMethods http = new HTTPMethods(p);
		Response resobj =  http.postMethod(requestBody, "QA_URI");
		returnIdValue = JsonParsing.doParsing(resobj, "id");
	}
}
