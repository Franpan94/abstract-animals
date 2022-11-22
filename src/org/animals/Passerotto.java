package org.animals;

public class Passerotto extends Animale implements IVolante {

	@Override
	public void verse() {
		System.out.println("Cip cip");
	}

	@Override
	public void eat() {
	   System.out.println("Insetti");
	}

	@Override
	public void fly() {
		System.out.println("Sto volando!!!");
	}

}
