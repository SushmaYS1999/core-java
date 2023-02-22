package com.xworkz.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="e_table")
public class EggDTO {
	
	@Id
	@Column(name="e_id")
	private int id;
	@Column(name="e_dname")
	private String dname;
	@Column(name="e_price")
	private Double price;
	@Column(name="e_type")
	private String type;
	@Column(name="e_take")
	private String take;
	@Column(name="e_area")
	private String area;
	@Column(name="e_region")
	private String region;
	@Column(name="e_servers")
	private Integer servers;
	@Column(name="e_owner")
	private String owner;
	@Column(name="e_hname")
	private String hname;
	@Column(name="e_noofpartners")
	private Integer noofpartners;
	@Column(name="e_dishes")
	private Integer dishes;
	
}

