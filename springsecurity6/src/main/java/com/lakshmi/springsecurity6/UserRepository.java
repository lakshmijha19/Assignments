package com.lakshmi.springsecurity6;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Credentials, Integer> 
{
	Credentials  findByUsername(String username);
}
