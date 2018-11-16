package com.MorePractice.SpringDemo100918;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beanbaritems")
public class Items {
	
	@Id // referring to the primary key for our table
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer itemid;
	
	private String itemname;
	private String description;
	private int quantity;
	private double price;	
	
	public Items() {
		
	}
	


	public Items(Integer itemid, String itemname, String description, int quantity, double price) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Items(String itemname, String description, int quantity, double price) {
		super();
		this.itemname = itemname;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	


	public Integer getItemid() {
		return itemid;
	}



	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}



	public String getItemname() {
		return itemname;
	}



	public void setItemname(String itemname) {
		this.itemname = itemname;
	}



	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "Items [id=" + itemid + ", name=" + itemname + ", description=" + description + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}

	

}
