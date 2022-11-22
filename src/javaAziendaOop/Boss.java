package javaAziendaOop;

import java.time.LocalDate;

public class Boss extends Person{
      int salary;
      int bonus;
      
      public Boss(String name, String surname, LocalDate dateOfBirth, 
    		  String code, int salary, int bonus) {
    	  
    	  super(name, surname, dateOfBirth, code);
    	  setSalary(salary);
    	  setBonus(bonus);
      }

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public int getYearIncome() {
		return salary *12 + bonus;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
