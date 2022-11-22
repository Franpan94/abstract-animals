package javaAziendaOop;

import java.time.LocalDate;
import java.util.Random;

public abstract class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String code;
    public abstract int getYearIncome();
    
    public Person(String name, String surname, LocalDate dateOfBirth){
    	setName(name);
    	setSurname(surname);
    	setDateOfBirth(dateOfBirth);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getFullName() {
		return getName() + " " + getSurname() + " " + generateCode();
	}
	
	public String generateCode(){
		Random rnd = new Random();
		int agencyCode = rnd.nextInt(10000, 100000);
		String strCode = String.valueOf(agencyCode);
		return strCode;
	}
	
	@Override
	public String toString() {
		return "Nominativo: " + getFullName() + "\nData di nascita: " + getDateOfBirth()
		       + "\nReddito annuo: " + getYearIncome() + " €";
	}
}
