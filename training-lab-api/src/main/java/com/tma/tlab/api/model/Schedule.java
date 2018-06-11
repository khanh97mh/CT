package com.tma.tlab.api.model;

import java.io.Serializable;
import javax.persistence.*;

import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiRelation;
import io.katharsis.resource.annotations.JsonApiResource;

@JsonApiResource(type = "schedules")
@Entity
@Table(name = "schedule")
public class Schedule implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonApiId
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "schedule_id", unique = true, nullable = false)
	private Long scheduleId;

	@Column(name = "fri_a", length = 1)
	private String friA;

	@Column(name = "fri_m", length = 1)
	private String friM;

	@Column(name = "mon_a", length = 1)
	private String monA;

	@Column(name = "mon_m", length = 1)
	private String monM;

	@Column(name = "thu_a", length = 1)
	private String thuA;

	@Column(name = "thu_m", length = 1)
	private String thuM;

	@Column(name = "tue_a", length = 1)
	private String tueA;

	@Column(name = "tue_m", length = 1)
	private String tueM;

	@JsonApiRelation
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@Column(name = "wed_a", length = 1)
	private String wedA;

	@Column(name = "wed_m", length = 1)
	private String wedM;

	@Column(name = "week_id", length = 20)
	private String weekId;

	public Schedule() {
	}

	public Long getScheduleId() {
		return this.scheduleId;
	}

	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getFriA() {
		return this.friA;
	}

	public void setFriA(String friA) {
		this.friA = friA;
	}

	public String getFriM() {
		return this.friM;
	}

	public void setFriM(String friM) {
		this.friM = friM;
	}

	public String getMonA() {
		return this.monA;
	}

	public void setMonA(String monA) {
		this.monA = monA;
	}

	public String getMonM() {
		return this.monM;
	}

	public void setMonM(String monM) {
		this.monM = monM;
	}

	public String getThuA() {
		return this.thuA;
	}

	public void setThuA(String thuA) {
		this.thuA = thuA;
	}

	public String getThuM() {
		return this.thuM;
	}

	public void setThuM(String thuM) {
		this.thuM = thuM;
	}

	public String getTueA() {
		return this.tueA;
	}

	public void setTueA(String tueA) {
		this.tueA = tueA;
	}

	public String getTueM() {
		return this.tueM;
	}

	public void setTueM(String tueM) {
		this.tueM = tueM;
	}

	public String getWedA() {
		return this.wedA;
	}

	public void setWedA(String wedA) {
		this.wedA = wedA;
	}

	public String getWedM() {
		return this.wedM;
	}

	public void setWedM(String wedM) {
		this.wedM = wedM;
	}

	public String getWeekId() {
		return this.weekId;
	}

	public void setWeekId(String weekId) {
		this.weekId = weekId;
	}

}