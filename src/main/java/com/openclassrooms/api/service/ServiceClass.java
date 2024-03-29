package com.openclassrooms.api.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.openclassrooms.api.dto.ChildAlertDTO;
import com.openclassrooms.api.dto.CountDTO;
import com.openclassrooms.api.dto.FireDTO;
import com.openclassrooms.api.dto.HomeFloodDTO;
import com.openclassrooms.api.dto.PersonMedicalRecordDTO;
import com.openclassrooms.api.model.Firestation;
import com.openclassrooms.api.model.Person;

public interface ServiceClass {

	
	 List<PersonMedicalRecordDTO> getPersonInfo(String firstName, String lastName) throws ParseException;
	 
	 List<String> getEmailByCity(String city);
	 
	 List<ChildAlertDTO> getChildByAddress(String address) throws ParseException;
	 
	 Map<String, List<HomeFloodDTO>> GetListHomeByCasern(String firestationNum) throws ParseException;
	 
	 List<String> getPhoneListByCasern(String numberFirestation);
	 
	 FireDTO getListPersonByAddressStation(String address) throws ParseException ;
	 
	 CountDTO getCountPersonBystation(String stationNumber) throws ParseException;
	 
	 int calculteAge(String birthdate) throws ParseException;
	 
	 
}
