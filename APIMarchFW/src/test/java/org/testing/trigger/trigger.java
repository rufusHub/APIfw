package org.testing.trigger;

import java.io.IOException;

import org.testing.testScripts.TC1_PostRequest;
import org.testing.testScripts.TC2_GetAllRequest;
import org.testing.testScripts.TC3_GetParticularRequest;
import org.testing.testScripts.TC4_PutRequest;
import org.testing.testScripts.TC5_DeleteRequest;

public class trigger {
	
	public static void main(String[] args) throws IOException {
		System.out.println("#################################################");
		System.out.println("TC1_PostRequest");
		TC1_PostRequest tc1 = new TC1_PostRequest();
		tc1.testCase1();
		
		System.out.println("#################################################");
		System.out.println("TC2_GetAllRequest");
		TC2_GetAllRequest tc2 = new TC2_GetAllRequest();
		tc2.testCase2();
		
		System.out.println("#################################################");
		System.out.println("TC3_GetParticularRequest");
		TC3_GetParticularRequest tc3 = new TC3_GetParticularRequest();
		tc3.testCase3();
		
		System.out.println("#################################################");
		System.out.println("TC4_PutRequest");
		TC4_PutRequest tc4 = new TC4_PutRequest();
		tc4.testCase4();
		
		System.out.println("#################################################");
		System.out.println("TC5_DeleteRequest");
		TC5_DeleteRequest tc5 = new TC5_DeleteRequest();
		tc5.testCase5();
				
				
	}
}
