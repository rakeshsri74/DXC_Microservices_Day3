package com.dxc.model;

import java.util.ArrayList;
import java.util.List;

public class User {

	private Long userId;
	private String user;
	private String phone;
	
	List<Contact> contacts = new ArrayList<>();

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long userId, String user, String phone) {
		super();
		this.userId = userId;
		this.user = user;
		this.phone = phone;
	}

	public User(Long userId, String user, String phone, List<Contact> contacts) {
		super();
		this.userId = userId;
		this.user = user;
		this.phone = phone;
		this.contacts = contacts;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", user=" + user + ", phone=" + phone + ", contacts=" + contacts + "]";
	}
	
	
}
