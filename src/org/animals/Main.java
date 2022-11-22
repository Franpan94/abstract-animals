package org.animals;

public class Main {
   public static void main(String[] args) {
	Cane c = new Cane();
	System.out.println("Cane");
	System.out.print("Di cosa si nutre: "); 
	c.eat();
	System.out.print("Verso appartenente: "); 
	c.verse();
	System.out.println("-----------------------");
	
	Passerotto p = new Passerotto();
	System.out.println("Passerotto");
	System.out.print("Di cosa si nutre: ");
	p.eat();
	System.out.print("Verso appartenente: ");
	p.verse();
	System.out.println("-----------------------");
	
	Aquila a = new Aquila();
	System.out.println("Aquila");
	System.out.print("Di cosa si nutre: ");
	a.eat();
	System.out.print("Verso appartenente: ");
	a.verse();
	System.out.println("-----------------------");
	
	Delfino d = new Delfino();
	System.out.println("Delfino");
	System.out.print("Di cosa si nutre: ");
	d.eat();
	System.out.print("Verso appartenente: ");
	d.verse();
	System.out.println("-----------------------");
}
}
