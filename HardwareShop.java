package com.xworkz.configuration.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	
	@Autowired
	@Qualifier("identity")
	private int id;
	@Autowired
	@Qualifier("nameofshop")
	private String name;
	@Autowired
	@Qualifier("gstnnumber")
	private String gstNo;
	@Autowired
	@Qualifier("ownerofshopname")
	private String ownerName;
	@Autowired
	@Qualifier("addressofshop")
	private String address;
	
	

	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}

	
	
}
