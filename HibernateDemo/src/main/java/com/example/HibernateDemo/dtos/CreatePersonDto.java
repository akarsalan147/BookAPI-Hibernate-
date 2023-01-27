package com.example.HibernateDemo.dtos;

import com.example.HibernateDemo.model.Person;

import lombok.Data;

@Data
public class CreatePersonDto {

	private String firstName;
	private String lastName;
	private String dob;
	
	public Person to() {
		return Person.builder()
				.firstName(firstName)
				.lastName(lastName)
				.dob(dob).build();
	}
	
}
