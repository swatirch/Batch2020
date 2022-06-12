package com.app.pojo;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "manufacturings")
public class Manufacturings {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "BIGINT UNSIGNED")
	@NotNull
	private int id;

	@NotNull
	private String name;

	@NotNull
	private String bname;

	@NotNull
	private String address;

	@NotNull
	private String email;

	@NotNull
	private String file;

	@NotNull
	private String mobile;

	@NotNull
	private String mode;

	@NotNull
	private String requirement;

	@Column(name = "created_at")
	private Timestamp createdAt;

	@Column(name = "updated_at")
	private Timestamp updatedAt;

	private String status;

	public Manufacturings() {
		Date date = new Date();
		this.createdAt = new Timestamp(date.getTime());
		this.updatedAt = new Timestamp(date.getTime());
	}

	public Manufacturings(@NotNull int id, @NotNull String name, @NotNull String bname, @NotNull String address,
			@NotNull String email, @NotNull String file, @NotNull String mobile, @NotNull String mode,
			@NotNull String requirement, Timestamp createdAt, Timestamp updatedAt, String status) {
		this.id = id;
		this.name = name;
		this.bname = bname;
		this.address = address;
		this.email = email;
		this.file = file;
		this.mobile = mobile;
		this.mode = mode;
		this.requirement = requirement;
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

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getRequirement() {
		return requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
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
		return "Manufacturings [id=" + id + ", name=" + name + ", bname=" + bname + ", address=" + address + ", email="
				+ email + ", file=" + file + ", mobile=" + mobile + ", mode=" + mode + ", requirement=" + requirement
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", status=" + status + "]";
	}

}
