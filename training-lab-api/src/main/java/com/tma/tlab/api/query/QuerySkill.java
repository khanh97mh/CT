package com.tma.tlab.api.query;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({@NamedQuery(name = "Skill.findAllWithDescription", query = QuerySkill.FIND_SKILL_WITH_DESCRIPTION)})
@Entity
@Table(name = "skill")
public class QuerySkill {
	public static final String FIND_SKILL_WITH_DESCRIPTION = " SELECT sub FROM Skill as sub WHERE sub.description like :description  ";
	
	@Id
	private Integer id;
}
