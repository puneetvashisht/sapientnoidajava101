package com.sapient.day3;

public class Address {
	
	private int houseNumber;
	private String locality;
	private String city;
	public Address(int houseNumber, String locality, String city) {
		super();
		this.houseNumber = houseNumber;
		this.locality = locality;
		this.city = city;
	}
	
	
	public int getHouseNumber() {
		return houseNumber;
	}


	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}


	public String getLocality() {
		return locality;
	}


	public void setLocality(String locality) {
		this.locality = locality;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", locality=" + locality + ", city=" + city + "]";
	};
	
	public void changeAddress(int houseNumber, String locality, String city){
		if(houseNumber !=0) this.houseNumber = houseNumber;
		if(locality !=null) this.locality = locality;
		if(city !=null)this.city = city;
	}
	
	

}
