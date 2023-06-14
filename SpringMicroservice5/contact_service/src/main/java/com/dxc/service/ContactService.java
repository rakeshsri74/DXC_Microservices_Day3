package com.dxc.service;

import java.util.List;

import com.dxc.model.Contact;

public interface ContactService {

	public List<Contact> getContactOfUser(Long userId);
}
