package com.MorePractice.SpringDemo100918;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "cartitems")
public class CartItem {
	
	@Id // referring to the primary key for our table
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cartitemid;
	
	private String cartitemname;
	private String cartitemdescription;
	private int cartitemquantity;
	private double cartitemprice;	
	
	@ManyToOne
	@JoinColumn(name = "itemid")
	private Items item;

	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartItem(Integer cartitemid, String cartitemname, String cartitemdescription, int cartitemquantity,
			double cartitemprice, Items item) {
		super();
		this.cartitemid = cartitemid;
		this.cartitemname = cartitemname;
		this.cartitemdescription = cartitemdescription;
		this.cartitemquantity = cartitemquantity;
		this.cartitemprice = cartitemprice;
		this.item = item;
	}

	public CartItem(String cartitemname, String cartitemdescription, int cartitemquantity, double cartitemprice,
			Items item) {
		super();
		this.cartitemname = cartitemname;
		this.cartitemdescription = cartitemdescription;
		this.cartitemquantity = cartitemquantity;
		this.cartitemprice = cartitemprice;
		this.item = item;
	}

	public Integer getCartitemid() {
		return cartitemid;
	}

	public void setCartitemid(Integer cartitemid) {
		this.cartitemid = cartitemid;
	}

	public String getCartitemname() {
		return cartitemname;
	}

	public void setCartitemname(String cartitemname) {
		this.cartitemname = cartitemname;
	}

	public String getCartitemdescription() {
		return cartitemdescription;
	}

	public void setCartitemdescription(String cartitemdescription) {
		this.cartitemdescription = cartitemdescription;
	}

	public int getCartitemquantity() {
		return cartitemquantity;
	}

	public void setCartitemquantity(int cartitemquantity) {
		this.cartitemquantity = cartitemquantity;
	}

	public double getCartitemprice() {
		return cartitemprice;
	}

	public void setCartitemprice(double cartitemprice) {
		this.cartitemprice = cartitemprice;
	}

	public Items getItem() {
		return item;
	}

	public void setItem(Items item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "CartItem [cartitemid=" + cartitemid + ", cartitemname=" + cartitemname + ", cartitemdescription="
				+ cartitemdescription + ", cartitemquantity=" + cartitemquantity + ", cartitemprice=" + cartitemprice
				+ ", item=" + item + "]";
	}
	
	

}
