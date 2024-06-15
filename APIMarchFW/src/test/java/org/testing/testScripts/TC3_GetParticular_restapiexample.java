package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC3_GetParticular_restapiexample {
	@Test
	public void tc3() throws IOException {
		
		String path_1 = "..//APIMarchFW/URI.properties.restapiexample";
		String uriKeyName = "RAE_GETp_URI";
		
		Properties prop = PropertiesHandle.loadProperties(path_1);
		
		HTTPMethods http = new HTTPMethods(prop);
		
//		System.out.println("Enter 'id' Value: ");
//		Scanner s = new Scanner(System.in);
//		Integer IdValue = s.nextInt();
		
		Integer IdValue = 8;
		
		if (IdValue >= 1 && IdValue <= 24) {
			http.getParticulartMethod(uriKeyName, IdValue.toString());
		}
		else {System.out.println("Inserted ID value is not correct.");}
		
		
		
		
	}
}
