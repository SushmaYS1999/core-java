package com.xworkz;

import java.time.LocalDate;

public class WeponDTO implements Comparable<WeponDTO>{
	private String name;
	private String madeBy;
	private LocalDate madeOn;
	private double price;
	private Type type;
	public WeponDTO() {
		super();
	}
	@Override
	public int hashCode() {
			return 30;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null)
		{
			if(obj instanceof WeponDTO)
			{
				WeponDTO dto=(WeponDTO)obj;
				if(dto.name.equals(this.name))
				{
					System.out.println("maching:"+dto);
				}
			}
		}
		return false;
		}
	
	@Override
	public String toString() {
		return "WeponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMadeBy() {
		return madeBy;
	}
	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}
	public LocalDate getMadeOn() {
		return madeOn;
	}
	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public WeponDTO(String name, String madeBy, LocalDate madeOn, double price, Type type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}
	@Override
	public int compareTo(WeponDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
