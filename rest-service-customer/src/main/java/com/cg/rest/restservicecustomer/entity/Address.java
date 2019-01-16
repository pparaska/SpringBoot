package com.cg.rest.restservicecustomer.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {


	private String roomNo;
	private String city;
	private String pincode;
	
	public Address(String roomNo, String city, String pincode) {
		super();
		this.roomNo = roomNo;
		this.city = city;
		this.pincode = pincode;
	}

	public Address() {
		super();
	
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
		result = prime * result + ((roomNo == null) ? 0 : roomNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (pincode == null) {
			if (other.pincode != null)
				return false;
		} else if (!pincode.equals(other.pincode))
			return false;
		if (roomNo == null) {
			if (other.roomNo != null)
				return false;
		} else if (!roomNo.equals(other.roomNo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Address [roomNo=" + roomNo + ", city=" + city + ", pincode=" + pincode + "]";
	}


}
