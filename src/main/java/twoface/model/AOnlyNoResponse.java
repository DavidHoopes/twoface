package twoface.model;

import twoface.abstractModel.AAA;
import twoface.interfaces.AAAInterface;

public class AOnlyNoResponse extends AAA {

	@Override
	public void doSomething() {
		System.out.println(this.getClass().getSimpleName() + " doSomething");

	}

	@Override
	public Response getResponse() {
		System.out.println(this.getClass().getSimpleName() + " getResponse");
		return new Response("400", "This is Not a response");

	}

	@Override
	public boolean isResponseSupported() {
		System.out.println(this.getClass().getSimpleName() + " isResponseSupported");
		return false;
	}

}
