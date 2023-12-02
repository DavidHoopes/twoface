package twoface.model;

import twoface.abstractModel.AAA;
import twoface.interfaces.BBBInterface;

public class AandB extends AAA implements BBBInterface {

	public void doSomethingBBBOnly() {
		System.out.println(this.getClass().getSimpleName() + " doSomethingBBBOnly");

	}

	public void doSomething() {
		System.out.println(this.getClass().getSimpleName() + " doSomething");

	}

	public Response getResponse() {
		System.out.println(this.getClass().getSimpleName() + " getResponse");
		return new Response("200", "This is a response");
	}

	public boolean isResponseSupported() {
		System.out.println(this.getClass().getSimpleName() + " isResponseSupported");
		return true;
	}

}
