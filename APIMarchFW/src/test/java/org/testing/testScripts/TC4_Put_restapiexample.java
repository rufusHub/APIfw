package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_Put_restapiexample {
	@Test
	public void tc4() throws IOException {
		
		String path_1 = "..//APIMarchFW/URI.properties.restapiexample";
		String path_2 = "..//APIMarchFW/src/test/java/org/testing/resources/updaterequestBody_restapiexample.json";
		String variableName = "id";
		String urikeyName = "RAE_UPDATE_URI";
		
		Properties prop = PropertiesHandle.loadProperties(path_1);
		
		String requestBody = JsonHandle.readJsonData(path_2); 
		
//		System.out.println("Enter 'id' Value: ");
//		Scanner s = new Scanner(System.in);
//		Integer IdValue = s.nextInt();
		
		Integer IdValue = 25;
		
		HTTPMethods http = new HTTPMethods(prop);
		
		if (IdValue == 25) {
			http.putMethod(requestBody, urikeyName, IdValue.toString());
		}
		else {
			System.out.println("Value is not valid, only Id = 25 works.");
		}
		
		
		
		
		
	}
}
