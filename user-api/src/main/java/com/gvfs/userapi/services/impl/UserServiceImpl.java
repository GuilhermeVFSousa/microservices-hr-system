package com.gvfs.userapi.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gvfs.userapi.domain.User;
import com.gvfs.userapi.repositories.UserRepository;
import com.gvfs.userapi.services.UserService;
import com.gvfs.userapi.services.exceptions.ObjectNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
	
	
	private final UserRepository repository; //substitui a anotação @autowired (precisa haver um construtor)

	@Override
	public User findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found."));
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

}
