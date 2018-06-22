package com.tma.tlab.api.query;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({ @NamedQuery(name = "Area.findAllWithDescription", query = QueryArea.FIND_AREA_WITH_DESCRIPTION) })

@Entity
@Table(name = "area")
public class QueryArea {
	public static final String FIND_AREA_WITH_DESCRIPTION = " SELECT a FROM Area as a WHERE a.description like :description ";

	@Id
	private Integer id;
}