package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.User;

@Repository
public interface Userrepo extends JpaRepository<User, Integer>{
	
	 public User findByEmailid(String emailid);

}
