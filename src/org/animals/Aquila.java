package org.animals;

public class Aquila extends Animale implements IVolante {

	@Override
	public void verse() {
		System.out.println("Aaaaaaaaaaaaaaa");
	}

	@Override
	public void eat() {
		System.out.println("Mammiferi e uccelli");
	}

	@Override
	public void fly() {
		System.out.println("Sto volando!!!");
	}

}
