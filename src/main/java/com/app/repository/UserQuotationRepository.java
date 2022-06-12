package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.UserQuotation;

public class UserQuotationRepository {

	public interface UserRepository extends JpaRepository<UserQuotation, Integer>
	{

	}

}
