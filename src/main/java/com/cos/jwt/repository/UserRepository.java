package com.cos.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.jwt.model.User;

// CRUD 함수를 JpaRepository가 들고 있음
// @Repository라는 어노테이션이 없어도 IoC가 됨
public interface UserRepository extends JpaRepository<User, Long>{
	
	// select * from user where username = 1?;
	public User findByUsername(String username); // Jpa Query methods
}
