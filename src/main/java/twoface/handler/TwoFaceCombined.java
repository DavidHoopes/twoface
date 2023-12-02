package twoface.handler;

import java.util.ArrayList;
import java.util.Arrays;

import twoface.abstractModel.AAA;
import twoface.abstractModel.Combined;
import twoface.factory.CombinedFactory;
import twoface.model.AandB;
import twoface.model.Response;

public class TwoFaceCombined {

	// injected
	CombinedFactory factory = new CombinedFactory();
	
	ArrayList<String> combines = new ArrayList<String> (
			Arrays.asList("1", "2"));
	
	public void combinedTest() {
		System.out.println("**** combinedTest()");
		for (String name: combines) {
			Combined combined = factory.getCombined(name);
			simpleCombinedTest(combined);
		}
	}

	
	private void simpleCombinedTest(Combined com) {
		System.out.println("== ssimpleCombinedTest " + com.getClass().getSimpleName());
		com.doSomething();
		Response response = com.getResponse();
		if ("200".equals(response.getStatus())) {
			System.out.println(response.toString());
		}
		
		/*
		 * Alternate method to handle a function that is 
		 * not universally supported. 
		 */
		if(com.isResponseSupported()) {
			Response response2 = com.getResponse();
			System.out.println(response2.toString());
		}
		
		/*
		 * Handle methods not part of the base
		 */
		try {
			com.doSomethingBBBOnly();
			
		} catch(Exception ex) {
			System.out.println("FAILED BBBonly call: " + ex.getMessage());
		}
	}
}
