package twoface.abstractModel;

import twoface.model.Response;

public abstract class Combined {
	public abstract void doSomething();
	
	public Response getResponse() {
		System.out.println(this.getClass().getSimpleName() + " getResponse (abstract)");
		return new Response("400", "This is Not a response");
	}

	public boolean isResponseSupported() {
		return false;
	};
	
	public void doSomethingBBBOnly() throws Exception {
		throw new Exception();
		
	};
}
