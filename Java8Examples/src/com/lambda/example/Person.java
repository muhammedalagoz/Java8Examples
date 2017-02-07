package com.lambda.example;

import java.time.LocalDate;

public class Person {

    private Integer number;
    private String firstName;
    private String lastName;
    private LocalDate date;
	
    public Person(Integer number, String firstName, String lastName,
			LocalDate date) {
		super();
		this.number = number;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
	}

    public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Person [number=" + number + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", date=" + date + "]";
	}

    
}