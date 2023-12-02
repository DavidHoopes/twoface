package twoface.combined;

import twoface.abstractModel.Combined;

public class Combined1 extends Combined {

	@Override
	public void doSomething() {
		System.out.println(this.getClass().getSimpleName() + " doSomething");
		
	}

}
