package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.Manufacturings;

public class ManufacturingsRepository {
	
	public interface UserRepository extends JpaRepository<Manufacturings, Integer>
	{

	}


}
