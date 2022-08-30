package com.openclassrooms.api.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.openclassrooms.api.model.Firestation;
import com.openclassrooms.api.model.Medicalrecord;
import com.openclassrooms.api.model.Person;

public class PersonDTO {

	
	private String firstName;
	
	private String lastName;
	
	private String address;
	
	private String email;
	
	private List<String> medications;

	private List<String> allergies;
	
	
	
	 //il faut ajouter la classe Mapper ( entre person et personDTO ) 


	public PersonDTO() {
		
	}
	

	public PersonDTO(String firstName, String lastName, String address, String email, List<String> medications,
			List<String> allergies) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.medications = medications;
		this.allergies = allergies;
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



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}


	public List<String> getMedications() {
		return medications;
	}


	public void setMedications(List<String> medications) {
		this.medications = medications;
	}


	public List<String> getAllergies() {
		return allergies;
	}


	public void setAllergies(List<String> allergies) {
		this.allergies = allergies;
	}



	
	
}