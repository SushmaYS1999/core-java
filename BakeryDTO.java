package com.xworkz.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="java_cls")
public class BakeryDTO {

	@Column(name="b_id")
	@Id
	private int id;
	@Column(name="b_name")
	private String bname;
	@Column(name="b_owner")
	private String owner;
	@Column(name="b_wifename")
	private String wife;
	@Column(name="b_married")
	private boolean married;
	@Column(name="b_sweet")
	private String sweet;
	@Column(name="b_since")
	private String since;
}
