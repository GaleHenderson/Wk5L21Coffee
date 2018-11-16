//package com.MorePractice.SpringDemo100918;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//
//@Repository
//public class PersonJdbcDao {
//	
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//
//	public List<Person> findAllPersons(){
//		return jdbcTemplate.query("select * from BeanBarMembers", new BeanPropertyRowMapper<Person>(Person.class));
//		
//	}
//	
//	public List<Person> findByCategory(int id){
//		return jdbcTemplate.query("select * from BeanBarMembers where category like '%" + id + "%'", new BeanPropertyRowMapper<Person>(Person.class));
//
//		
//	}
//	
//	public int addPerson(String fName, String lName, String email, String pw, String phone) {
//		String addQuery = "insert into BeanBarMembers(First Name, Last Name, Email, PW, Phone) values(?, ?, ?, ?, ?)";
//		return jdbcTemplate.update(addQuery, fName, lName, email, pw, phone);
//	}
//	
//	public int updatePerson(int id, String fName, String lName, String email, String pw, String phone) {
//		String updateQuery = "update BeanBarMembers set fName=?, lName=?, email=?, pw=?, phone=? where id=?";
//		return jdbcTemplate.update(updateQuery, fName, lName, email, pw, phone);
//	}
//	
//	public int deletePerson(int id) {
//		String deleteQuery = "delete from BeanBarMembers where id=?";
//		return jdbcTemplate.update(deleteQuery, id);
//	}
//	
//}
//
//
//
