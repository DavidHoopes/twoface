package twoface.abstractModel;

import twoface.interfaces.AAAInterface;
import twoface.model.Response;

public abstract class AAA implements AAAInterface {

	public abstract void doSomething();
	public abstract Response getResponse();

	public abstract boolean isResponseSupported();

}
