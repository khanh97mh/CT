package com.tma.tlab.api.model;

import java.io.Serializable;
import javax.persistence.*;

import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiRelation;
import io.katharsis.resource.annotations.JsonApiResource;

@JsonApiResource(type = "task_details")
@Entity
@Table(name = "task_detail")
public class TaskDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonApiId
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "task_detail_id", unique = true, nullable = false)
	private Long taskDetailId;

	@Column(nullable = false, length = 255)
	private String description;

	@Column(nullable = false)
	private float estimate;

	@Column(nullable = false, length = 45)
	private String name;

	@Column(nullable = false, length = 1)
	private String status;

	@JsonApiRelation
	@ManyToOne
	@JoinColumn(name = "task_assignment_id")
	private TaskAssignment taskAssignment;

	public TaskDetail() {
	}

	public Long getTaskDetailId() {
		return this.taskDetailId;
	}

	public void setTaskDetailId(Long taskDetailId) {
		this.taskDetailId = taskDetailId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getEstimate() {
		return this.estimate;
	}

	public void setEstimate(float estimate) {
		this.estimate = estimate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}