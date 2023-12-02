package twoface.factory;

import twoface.abstractModel.AAA;
import twoface.model.AOnly;
import twoface.model.AOnlyNoResponse;
import twoface.model.AandB;

public class InterfaceFactory {
	private AOnly aOnly = new AOnly();
	private AOnlyNoResponse aNoResp = new AOnlyNoResponse();
	private AandB aAndB = new AandB();
	
	public AAA getAAA(String aaaId) {
		
		switch(aaaId) {
			case "AOnly":
				return aOnly;
			case "AOnlyNoResponse":
				return aNoResp;
			case "AandB":
				return aAndB;
			default:
				// Need to figure out what to do here
				return null;
			
		}
	}
	
}
