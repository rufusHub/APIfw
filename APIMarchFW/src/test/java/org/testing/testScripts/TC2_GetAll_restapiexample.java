package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC2_GetAll_restapiexample {
	@Test
	public void tc2() throws IOException {
		
		String path_1 = "..//APIMarchFW/URI.properties.restapiexample";
		String uriKeyName = "RAE_GET_URI";
		
		Properties prop = PropertiesHandle.loadProperties(path_1);
		
		HTTPMethods http = new HTTPMethods(prop);
		
		http.getAlltMethod(uriKeyName);
		
		
		
	}
}
