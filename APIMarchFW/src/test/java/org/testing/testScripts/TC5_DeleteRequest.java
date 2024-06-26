package org.testing.testScripts;


import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;


public class TC5_DeleteRequest {

	@Test
	public void testCase5() throws IOException {
		Properties p = PropertiesHandle.loadProperties("..//APIMarchFW/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		http.deleteMethod("QA_URI", TC1_PostRequest.returnIdValue);
	}
}
