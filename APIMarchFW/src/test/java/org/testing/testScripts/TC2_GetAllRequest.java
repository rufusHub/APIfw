package org.testing.testScripts;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;


public class TC2_GetAllRequest {
	
	@Test
	public void testCase2() throws IOException {
		Properties p = PropertiesHandle.loadProperties("..//APIMarchFW/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		http.getAlltMethod("QA_URI");
	}
}
