package com.app.pojo;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "password_resets")
public class PasswordResets {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "BIGINT UNSIGNED")
	@NotNull
	private long id;

	@NotNull
	private String email;

	@NotNull
	private String token;

	@Column(name = "created_at")
	private Timestamp createdAt;

	public PasswordResets() {
		Date date = new Date();
		this.createdAt = new Timestamp(date.getTime());
	}

	public PasswordResets(@NotNull long id, @NotNull String email, @NotNull String token, Timestamp createdAt) {
		super();
		this.id = id;
		this.email = email;
		this.token = token;
		this.createdAt = createdAt;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "PasswordResets [id=" + id + ", email=" + email + ", token=" + token + ", createdAt=" + createdAt + "]";
	}

}
