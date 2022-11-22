package org.animals;

public class Delfino extends Animale implements INuotante {

	@Override
	public void verse() {
		System.out.println("Mmmmmmmmm");
	}

	@Override
	public void eat() {
		System.out.println("Pesci");
	}

	@Override
	public void swim() {
		System.out.println("Sto nuotando!!!");
	}

}
