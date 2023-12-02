package twoface.handler;

import java.util.ArrayList;
import java.util.Arrays;

import twoface.abstractModel.AAA;
import twoface.factory.InterfaceFactory;
import twoface.model.AOnly;
import twoface.model.AOnlyNoResponse;
import twoface.model.AandB;
import twoface.model.Response;

public class TwoFaceInterface {
	
	// In a spring app this would be injected.
	InterfaceFactory factory = new InterfaceFactory();
	
	ArrayList<String> interfaces = new ArrayList<String>(
			Arrays.asList("AOnly", "AOnlyNoResponse", "AandB"));

	public void interfaceTest() {
		System.out.println("**** interfaceTest()");
		for (String name: interfaces) {
			AAA aaa = factory.getAAA(name);
			simpleAAATest(aaa);
		}
		
		
	}
	
	private void simpleAAATest(AAA aaa) {
		System.out.println("== simpleAAATest " + aaa.getClass().getSimpleName());
		aaa.doSomething();
		Response response = aaa.getResponse();
		if ("200".equals(response.getStatus())) {
			System.out.println(response.toString());
		}
		
		/*
		 * Alternate method to handle a function that is 
		 * not universally supported. 
		 */
		if(aaa.isResponseSupported()) {
			Response response2 = aaa.getResponse();
			System.out.println(response2.toString());
		}
		
		/*
		 * Handle methods not part of the base
		 */
		try {
			((AandB) aaa).doSomethingBBBOnly();
			
		} catch(Exception ex) {
			System.out.println("FAILED BBBonly call: " + ex.getMessage());
		}
	}
	
	

}
