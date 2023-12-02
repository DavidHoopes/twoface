package twoface.combined;

import twoface.abstractModel.Combined;
import twoface.model.Response;

public class Combined2 extends Combined {

	@Override
	public void doSomething() {
		System.out.println(this.getClass().getSimpleName() + " doSomething");
	}
	
	@Override
	public Response getResponse() {
		System.out.println(this.getClass().getSimpleName() + " getResponse");
		return new Response("200", "This is a valid response");
	}
	
	@Override
	public boolean isResponseSupported() {
		return true;
	};
	
	@Override
	public void doSomethingBBBOnly() throws Exception {
		System.out.println(this.getClass().getSimpleName() + " doSomethingBBBOnly() (Abstact)");		
	};
	

}
