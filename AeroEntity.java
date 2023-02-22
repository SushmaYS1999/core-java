package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="a_table")
public class AeroEntity {

	@Id
	@Column(name="a_id")
	private int id;
	@Column(name="a_cname")
	private String companyName;
	@Column(name="a_pname")
	private String pasangerName;
	@Column(name="a_cost")
	private int cost;
	@Column(name="a_type")
	private String type;
	@Column(name="a_country")
	private String country;
}
