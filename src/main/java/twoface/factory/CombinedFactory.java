/**
 * 
 */
package twoface.factory;

import twoface.abstractModel.Combined;
import twoface.combined.Combined1;
import twoface.combined.Combined2;

/**
 * Factory for the combined classes
 * @author david
 *
 */




public class CombinedFactory {
	/*
	 * In an spring app I would think these would need
	 * to be injected.
	 */
	private Combined1 combined1 = new Combined1();
	private Combined2 combined2 = new Combined2();
	
	public Combined getCombined(String combinedId) {
		
		switch(combinedId) {
			case "1":
				return combined1;
			case "2":
				return combined2;
			default:
				// Need to figure out what to do here
				return null;
		}
	}
}
