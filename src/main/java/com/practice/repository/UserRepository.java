package com.practice.repository;

import org.springframework.data.repository.CrudRepository;

import com.practice.usermodel.User;


public interface UserRepository extends CrudRepository<User, Long>{
	//public List<User> findAll();
	public User findByKeyw(String keyw);
}
