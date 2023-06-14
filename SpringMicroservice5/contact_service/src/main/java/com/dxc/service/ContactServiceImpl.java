package com.dxc.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.dxc.model.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> list = List.of(
			new Contact(1L,"Rakesh.Srivastaw@niit.com","Anil",1311L),
			new Contact(2L,"Satyam.Srivastaw@niit.com","Vijay",1312L),
			new Contact(3L,"Swati.Srivastaw@niit.com","Anup",1312L)
			);
	
	@Override
	public List<Contact> getContactOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream()
				.filter(contact->contact.getUserId().equals(userId))
				.collect(Collectors.toList());
	}

}
