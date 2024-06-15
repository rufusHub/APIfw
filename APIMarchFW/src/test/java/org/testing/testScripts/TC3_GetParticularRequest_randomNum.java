



package org.testing.testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC3_GetParticularRequest_randomNum {

	@Test
	public void testCase3() throws IOException {
		Properties p = PropertiesHandle.loadProperties("..//APIMarchFW/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		http.getParticulartMethod("QA_URI", TC1_PostRequest_randomNum.returnIdValue);
	}
}