package org.testing.reporting;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class logsCapture {

	public static void takeLog(String className, String msg) {
		DOMConfigurator.configure("../APIMarchFW/layout.xml");
		Logger L = Logger.getLogger(className);
		L.info(msg);
		
	}
}
