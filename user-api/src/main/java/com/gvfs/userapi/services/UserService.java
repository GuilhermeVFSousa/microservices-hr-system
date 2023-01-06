package com.gvfs.userapi.services;

import java.util.List;

import com.gvfs.userapi.domain.User;

public interface UserService {
	
	User findById(Long id);
	
	List<User> findAll();

}
