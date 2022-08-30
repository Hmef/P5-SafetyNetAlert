package com.openclassrooms.api.dto;



public class FirestationDTO { // FireDTO

	private String address;

	private String station;

	
	public FirestationDTO() {

	}

	
	public FirestationDTO(String address, String station) {

		this.address = address;
		this.station = station;

	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getStation() {
		return station;
	}


	public void setStation(String station) {
		this.station = station;
	}
	
	
	

}
