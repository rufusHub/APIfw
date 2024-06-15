package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC5_Delete_restapiexample {
	@Test
	public void tc5() throws IOException {
		
		String path_1 = "..//APIMarchFW/URI.properties.restapiexample";
		String urikeyName = "RAE_DELETE_URI";
		
		Properties prop = PropertiesHandle.loadProperties(path_1);
		
		HTTPMethods http = new HTTPMethods(prop);
		
//		System.out.println("Enter 'id' Value: ");
//		Scanner s = new Scanner(System.in);
//		Integer IdValue = s.nextInt();
		
		Integer IdValue = 2;
		
		if (IdValue == 2) {
			http.deleteMethod(urikeyName, IdValue.toString());
		}
		else {
			System.out.println("Wrong Id value, only 2 works.");
		}
		
	}
}
