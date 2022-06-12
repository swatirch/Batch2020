package com.app.pojo;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "user_quotation")
public class UserQuotation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "BIGINT UNSIGNED")
	@NotNull
	private long id;

	@NotNull
	private String payment;

	@NotNull
	private String file;

	@Column(name = "created_at")
	private Timestamp createdAt;

	@Column(name = "updated_at")
	private Timestamp updatedAt;

	@NotNull
	private String email;

	public UserQuotation() {
		Date date = new Date();
		this.createdAt = new Timestamp(date.getTime());
		this.updatedAt = new Timestamp(date.getTime());
	}

	public UserQuotation(@NotNull long id, @NotNull String payment, @NotNull String file, Timestamp createdAt,
			Timestamp updatedAt, @NotNull String email) {
		this.id = id;
		this.payment = payment;
		this.file = file;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserCotation [id=" + id + ", payment=" + payment + ", file=" + file + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + ", email=" + email + "]";
	}

}
