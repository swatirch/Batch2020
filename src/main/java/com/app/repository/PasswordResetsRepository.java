package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.PasswordResets;

public class PasswordResetsRepository {
	
	public interface UserRepository extends JpaRepository<PasswordResets, Integer>
	{

	}


}
