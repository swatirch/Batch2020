package com.app.pojo;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "notifications")
public class Notifications {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private long id;

	@NotNull
	private String type;

	@NotNull
	@Column(name = "notifiable_type")
	private String notifiableType;

	@NotNull
	@Column(name = "notifiable_id", columnDefinition = "BIGINT UNSIGNED")
	private long notifiableId;

	@NotNull
	private String data;

	@Column(name = "read_at")
	private Timestamp readAt;

	@Column(name = "created_at")
	private Timestamp createdAt;

	@Column(name = "updated_at")
	private Timestamp updatedAt;

	public Notifications() {
		Date date = new Date();
		this.createdAt = new Timestamp(date.getTime());
		this.updatedAt = new Timestamp(date.getTime());
	}

	public Notifications(@NotNull long id, @NotNull String type, @NotNull String notifiableType,
			@NotNull long notifiableId, @NotNull String data, Timestamp readAt, Timestamp createdAt,
			Timestamp updatedAt) {
		this.id = id;
		this.type = type;
		this.notifiableType = notifiableType;
		this.notifiableId = notifiableId;
		this.data = data;
		this.readAt = readAt;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNotifiableType() {
		return notifiableType;
	}

	public void setNotifiableType(String notifiableType) {
		this.notifiableType = notifiableType;
	}

	public long getNotifiableId() {
		return notifiableId;
	}

	public void setNotifiableId(long notifiableId) {
		this.notifiableId = notifiableId;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Timestamp getReadAt() {
		return readAt;
	}

	public void setReadAt(Timestamp readAt) {
		this.readAt = readAt;
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
		return "Notifications [id=" + id + ", type=" + type + ", notifiableType=" + notifiableType + ", notifiableId="
				+ notifiableId + ", data=" + data + ", readAt=" + readAt + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + "]";
	}

}
