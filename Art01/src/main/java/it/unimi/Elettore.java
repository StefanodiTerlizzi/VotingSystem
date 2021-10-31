package it.unimi;

public class Elettore extends Person {
	String electionCard;

	public Elettore(String name, String surname, String cf, BirthDate birthDate, String electionCard) {
		super(name, surname, cf, birthDate);
		this.electionCard = electionCard;
	}

}
