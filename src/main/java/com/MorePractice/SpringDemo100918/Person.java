package com.MorePractice.SpringDemo100918;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // this maps us to the table
@Table(name = "BeanBarMembers")
//@NamedQuery(name="find_all_persons", query="select p from Person p")
public class Person {
	 // this is allowing MySQL to auto increment
	// and generate the primary key for us
	@Id // referring to the primary key for our table
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer memberid;

//@Column(name="First Name") 
	private String fName;
//@Column(name="Last Name") 
	private String lName;
//@Column(name="Email") 
	private String email;
//@Column(name="PW") 
	private String pw;
//@Column(name="Phone") 
	private String phone;

	public Person() {

	}

	public Person(Integer id, String fName, String lName, String email, String pw, String phone) {
		super();
		this.memberid = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.pw = pw;
		this.phone = phone;
	}

	public Person(String fName, String lName, String email, String pw, String phone) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.pw = pw;
		this.phone = phone;
	}

	public Person(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}

	public String getFirstName() {
		return fName;
	}

	public void setFirstName(String fName) {
		this.fName = fName;
	}

	public String getLastName() {
		return lName;
	}

	public void setLastName(String lName) {
		this.lName = lName;
	}

	public Integer getId() {
		return memberid;
	}

	public void setId(Integer id) {
		this.memberid = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Welcome " + fName + " " + lName + "!";
	}

}
