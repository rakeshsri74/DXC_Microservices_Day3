package com.dxc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dxc.model.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> list = List.of(
			new User(1311L,"Rakesh Srivastaw","98725666"),
			new User(1312L,"Satyam Srivastaw","78655666"),
			new User(1314L,"Swati Srivastaw","87625666")
			);
	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return list.stream()
				.filter(user->user.getUserId().equals(id))
				.findAny()
				.orElse(null);
	}

}
