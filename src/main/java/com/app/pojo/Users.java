package com.app.pojo;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "users")
public class Users {

	@Id
	@Column(columnDefinition = "BIGINT UNSIGNED")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private long id;

	@NotNull
	private String name;

	@Column(name = "is_admin")
	private boolean isAdmin;

	@NotNull
	private String email;

	@Column(name = "email_verified_at")
	private Timestamp emailVerifiedAt;

	@NotNull
	private String password;

	@Column(name = "remember_token")
	private String rememberToken;

	@Column(name = "created_at")
	private Timestamp createdAt;

	@Column(name = "updated_at")
	private Timestamp updatedAt;

	public Users() {
		Date date = new Date();
		this.isAdmin = false;
		this.createdAt = new Timestamp(date.getTime());
		this.updatedAt = new Timestamp(date.getTime());
	}

	public Users(@NotNull long id, @NotNull String name, boolean isAdmin, @NotNull String email, Timestamp emailVerifiedAt,
			@NotNull String password, String rememberToken, Timestamp createdAt, Timestamp updatedAt) {
		this.id = id;
		this.name = name;
		this.isAdmin = isAdmin;
		this.email = email;
		this.emailVerifiedAt = emailVerifiedAt;
		this.password = password;
		this.rememberToken = rememberToken;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getEmailVerifiedAt() {
		return emailVerifiedAt;
	}

	public void setEmailVerifiedAt(Timestamp emailVerifiedAt) {
		this.emailVerifiedAt = emailVerifiedAt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRememberToken() {
		return rememberToken;
	}

	public void setRememberToken(String rememberToken) {
		this.rememberToken = rememberToken;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", isAdmin=" + isAdmin + ", email=" + email + ", emailVerifiedAt="
				+ emailVerifiedAt + ", password=" + password + ", rememberToken=" + rememberToken + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + "]";
	}

}
