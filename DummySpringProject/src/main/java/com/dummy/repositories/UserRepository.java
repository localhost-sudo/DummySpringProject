package com.dummy.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dummy.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	

}
