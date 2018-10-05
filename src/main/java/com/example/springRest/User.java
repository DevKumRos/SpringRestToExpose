package com.example.springRest;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String email;
	private Integer phoneNumber;
	private String topics;
	private String timePreference;
	private Boolean promotionalOffer;
	private Address address;
	
	public User() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getTopics() {
		return topics;
	}

	public void setTopics(String topics) {
		this.topics = topics;
	}

	public String getTimePreference() {
		return timePreference;
	}

	public void setTimePreference(String timePreference) {
		this.timePreference = timePreference;
	}

	public Boolean getPromotionalOffer() {
		return promotionalOffer;
	}

	public void setPromotionalOffer(Boolean promotionalOffer) {
		this.promotionalOffer = promotionalOffer;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", topics=" + topics
				+ ", timePreference=" + timePreference + ", promotionalOffer="
				+ promotionalOffer + ", address=" + address + "]";
	} 
	
	
}
