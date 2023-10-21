package com.yuri.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuri.test.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
