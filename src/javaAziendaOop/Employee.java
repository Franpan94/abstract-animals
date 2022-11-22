package javaAziendaOop;

import java.time.LocalDate;

public class Employee extends Person {
   private int salary;
   private int monthlyCount;
   
   public Employee(String name, String surname, 
		   LocalDate dateOfBirth, int salary, int monthlyCount){
	   
	   super(name, surname, dateOfBirth);
	   setSalary(salary);
	   setMonthlyCount(monthlyCount);
   }

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public int getMonthlyCount() {
	return monthlyCount;
}

public void setMonthlyCount(int monthlyCount) {
	this.monthlyCount = monthlyCount;
}

@Override
public int getYearIncome() {
	return salary * monthlyCount;
}

@Override
	public String toString() {
		return super.toString();
	}

}
