package com.gvfs.userapi.services.impl;

import java.util.List;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.gvfs.userapi.domain.User;
import com.gvfs.userapi.repositories.UserRepository;
import com.gvfs.userapi.services.UserService;
import com.gvfs.userapi.services.exceptions.ObjectNotFoundException;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j //log.info
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
	
	
	private final UserRepository repository; //substitui a anotação @autowired (precisa haver um construtor)
	private final Environment env;

	@Override
	public User findById(Long id) {
		log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port");
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found."));
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

}
