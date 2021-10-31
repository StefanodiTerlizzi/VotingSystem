package it.unimi;

public class BirthDate {
	
	int day;
	int month;
	int year;
	
	public BirthDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return day+"/"+month+"/"+year;
	}
}