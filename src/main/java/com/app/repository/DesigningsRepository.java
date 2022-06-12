package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.Designings;

public class DesigningsRepository {

	public interface UserRepository extends JpaRepository<Designings, Integer>
	{

	}

}

