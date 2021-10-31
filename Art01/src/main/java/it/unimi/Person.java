package it.unimi;

public class Person {
	private String name;
	private String surname;
	private String cf;
	private BirthDate birthDate;
	
	public Person(String name, String surname, String cf, BirthDate birthDate) {
		this.name = name;
		this.surname = surname;
		this.cf = cf;
		this.birthDate = birthDate;
	}
	
	

	public String getName() {
		return name;
	}



	public String getSurname() {
		return surname;
	}



	public String getCf() {
		return cf;
	}



	public BirthDate getBirthDate() {
		return birthDate;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", cf=" + cf + ", birthDate=" + birthDate + "]";
	}
	


}
