package com.gvfs.userapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gvfs.userapi.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
