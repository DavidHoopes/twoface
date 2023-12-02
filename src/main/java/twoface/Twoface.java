/**
 * 
 */
package twoface;

import twoface.handler.TwoFaceCombined;
import twoface.handler.TwoFaceInterface;

/**
 * Test harness for examples
 * @author david
 *
 */
public class Twoface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Twoface me = new Twoface();
		me.runInterfaces();
		me.runCombined();
	}

	private void runInterfaces() {
		TwoFaceInterface handler = new TwoFaceInterface();
		handler.interfaceTest();
	}
	
	private void runCombined() {
		TwoFaceCombined handler = new TwoFaceCombined();
		handler.combinedTest();
		
	}
}
