package twoface.interfaces;

import twoface.model.Response;

public interface CombinedInterface {
	public void doSomething();
	public Response getResponse();
	public boolean isResponseSupported();
	public void doSomethingBBBOnly();
}
