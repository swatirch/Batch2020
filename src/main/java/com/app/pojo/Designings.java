package com.app.pojo;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity(name = "designings")
public class Designings {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "BIGINT UNSIGNED")
	@NotNull
	private int id;

	@NotNull
	private String name;

	@NotNull
	private String address;

	@NotNull
	private String mobile;

	@NotNull
	private String idea;

	@NotNull
	private String email;

	@NotNull
	private String file;

	@Column(name = "created_at")
	private Timestamp createdAt;

	@Column(name = "updated_at")
	private Timestamp updatedAt;

	private String status;

	public Designings() {
		Date date = new Date();
		this.createdAt = new Timestamp(date.getTime());
		this.updatedAt = new Timestamp(date.getTime());
	}

	public Designings(@NotNull int id, @NotNull String name, @NotNull String address, @NotNull String mobile,
			@NotNull String idea, @NotNull String email, @NotNull String file, Timestamp createdAt, Timestamp updatedAt,
			String status) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.idea = idea;
		this.email = email;
		this.file = file;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Designings [id=" + id + ", name=" + name + ", address=" + address + ", mobile=" + mobile + ", idea="
				+ idea + ", email=" + email + ", file=" + file + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", status=" + status + "]";
	}

}
