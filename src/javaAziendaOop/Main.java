package javaAziendaOop;

import java.time.LocalDate;

public class Main {
   public static void main(String[] args) {
	   
	System.out.println("Dipendenti"); 
	
	System.out.println("");
	
	Employee e1 = new Employee("Marco", "Rossi", LocalDate.of(1970, 10, 19), "12345", 1200, 14);
	System.out.println(e1);
	
	System.out.println("");
	
	Employee e2 = new Employee("Gianni", "Celeste", LocalDate.of(1967, 12, 21), "13465", 1400, 14);
	System.out.println(e2);
	
	System.out.println("");
	
	Employee e3 = new Employee("Silvio", "Conti", LocalDate.of(1963, 9, 10), "11498", 1300, 14);
	System.out.println(e3);
	
	System.out.println("------------------------------------------");
	
	System.out.println("");
	
	System.out.println("Boss");
	
	System.out.println("");
	
	Boss b1 = new Boss("Giorgio", "Bianchi", LocalDate.of(1955, 8, 16), "22321", 2500, 10000);
	System.out.println(b1);
	
	System.out.println("");
	
	Boss b2 = new Boss("Guido", "Lavespa", LocalDate.of(1974, 4, 5), "23478", 3000, 12000);
	System.out.println(b2);
	
	Person [] persons = {e1,e2,e3,b1,b2};
	
	int maxValue = Integer.MIN_VALUE;
	int minValue = Integer.MAX_VALUE;
	int maxBossValue = Integer.MIN_VALUE;
	int minEmployeeValue = Integer.MAX_VALUE;
	int sum = 0;
    int avg = 0;
	Person personMaxValue = null;
	Person personMinValue = null;
	Person bossMaxValue = null;
	Person employeeMinValue = null;
	
	System.out.println("-------------------------------");
	
	for(int i=0; i<persons.length; i++) {
		Person person = persons[i];
		int valueGetInYearCome = person.getYearIncome();
		
		if(maxValue < valueGetInYearCome) {
			maxValue = valueGetInYearCome;
			personMaxValue = person;
		}
		
		if(minValue > valueGetInYearCome) {
			minValue = valueGetInYearCome;
			personMinValue = person;
		}
		
		if(person.getClass().getSimpleName().equals("Boss")) {
			if(maxBossValue < valueGetInYearCome) {
				maxBossValue = valueGetInYearCome;
				bossMaxValue = person;
			}
		}
		
		if(person.getClass().getSimpleName().equals("Employee")) {
			 if(minEmployeeValue > valueGetInYearCome) {
					minEmployeeValue = valueGetInYearCome;
					employeeMinValue = person;
			 }
		}
		
		sum += valueGetInYearCome;
		avg = sum/persons.length;
	}
	System.out.println("\nPersona con incasso annuale massimo: \n" + personMaxValue);
	
	System.out.println("----------------------------------------");
	System.out.println("\nPersona con incasso annuale minimo: \n" + personMinValue);
	
	System.out.println("----------------------------------------");
	System.out.println("\nCosto annuale dell'intera azienda: " + sum + " €");
	
	System.out.println("----------------------------------------");
	System.out.println("\nCosto medio per ogni dipendente: " + avg + " €");
	
	System.out.println("----------------------------------------");
	System.out.println("\nBoss con incasso annuale maggiore: \n" + bossMaxValue);
	
	System.out.println("----------------------------------------");
	System.out.println("\nDipendente con incasso annuale minore: \n" + employeeMinValue);
}
}
