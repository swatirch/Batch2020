package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.Notifications;

public class NotificationsRepsoitory {
	public interface UserRepository extends JpaRepository<Notifications, Integer> {

	}

}
