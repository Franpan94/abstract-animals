package org.animals;

public class Main {
   public static void main(String[] args) {
	Cane c = new Cane();
	System.out.println("Cane");
	System.out.print("Di cosa si nutre: "); 
	c.eat();
	System.out.print("Verso appartenente: "); 
	c.verse();
	c.sleep();
	System.out.println("-----------------------");
	
	Passerotto p = new Passerotto();
	System.out.println("Passerotto");
	System.out.print("Di cosa si nutre: ");
	p.eat();
	System.out.print("Verso appartenente: ");
	p.verse();
	p.sleep();
	System.out.println("-----------------------");
	
	Aquila a = new Aquila();
	System.out.println("Aquila");
	System.out.print("Di cosa si nutre: ");
	a.eat();
	System.out.print("Verso appartenente: ");
	a.verse();
	a.sleep();
	System.out.println("-----------------------");
	
	Delfino d = new Delfino();
	System.out.println("Delfino");
	System.out.print("Di cosa si nutre: ");
	d.eat();
	System.out.print("Verso appartenente: ");
	d.verse();
	d.sleep();
	System.out.println("-----------------------");
	
	System.out.print("Passerotto: ");
	faiVolare(p);
	
	System.out.print("Aquila: ");
	faiVolare(a);
	
	System.out.print("Delfino: ");
	faiNuotare(d);
}
   
   static void faiVolare(IVolante animale) {
		animale.fly();
  	}
   
   static void faiNuotare(INuotante animale) {
		animale.swim();
 	}
}
