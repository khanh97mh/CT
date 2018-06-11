package com.tma.tlab.api.model;

import java.io.Serializable;
import javax.persistence.*;

import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiResource;

@JsonApiResource(type = "csv_candidates")
@Entity
@Table(name="csv_candidate")
@NamedQuery(name="CsvCandidate.findAll", query="SELECT c FROM CsvCandidate c")
public class CsvCandidate implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonApiId
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="csv_candidate_id", unique=true, nullable=false)
	private Long csvCandidateId;

	@Column(name="csv_id", nullable=false, length=100)
	private String csvId;

	@Column(length=255)
	private String description;

	@Column(length=45)
	private String email;

	@Column(length=45)
	private String faculty;

	@Column(name="full_name", length=45)
	private String fullName;

	@Column(name="graduation_year", length=45)
	private String graduationYear;

	@Column(length=45)
	private String phone;

	@Column(length=45)
	private String position;

	@Column(nullable=false, length=1)
	private String status;

	@Column(length=45)
	private String university;

	public CsvCandidate() {
	}

	public Long getCsvCandidateId() {
		return this.csvCandidateId;
	}

	public void setCsvCandidateId(Long csvCandidateId) {
		this.csvCandidateId = csvCandidateId;
	}

	public String getCsvId() {
		return this.csvId;
	}

	public void setCsvId(String csvId) {
		this.csvId = csvId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFaculty() {
		return this.faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGraduationYear() {
		return this.graduationYear;
	}

	public void setGraduationYear(String graduationYear) {
		this.graduationYear = graduationYear;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUniversity() {
		return this.university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

}