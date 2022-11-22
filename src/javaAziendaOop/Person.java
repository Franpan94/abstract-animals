package javaAziendaOop;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String code;
    public abstract int getYearIncome();
    
    public Person(String name, String surname, LocalDate dateOfBirth, String code){
    	setName(name);
    	setSurname(surname);
    	setDateOfBirth(dateOfBirth);
    	setCode(code);
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
		return name + " " + surname + " " + code;
	}
	
	@Override
	public String toString() {
		return "Nominativo: " + getFullName() + "\nData di nascita: " + getDateOfBirth()
		       + "\nReddito annuo: " + getYearIncome() + " €";
	}
}
