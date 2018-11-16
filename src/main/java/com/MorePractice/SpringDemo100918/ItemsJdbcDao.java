package com.MorePractice.SpringDemo100918;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class ItemsJdbcDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Items> findAllItems(){
		return jdbcTemplate.query("select * from Items", new BeanPropertyRowMapper<Items>(Items.class));
		
	}
	
	public List<Items> findById(int id){
		return jdbcTemplate.query("select * from Items where category like '%" + id + "%'", new BeanPropertyRowMapper<Items>(Items.class));

		
	}
	
	public int addItems(String name, String description, int quantity, double price) {
		String addQuery = "insert into Items(name, description, quantitiy, price) values(?, ?, ?, ?)";
		return jdbcTemplate.update(addQuery, name, description, quantity, price);
	}
	
	public int updateItems(String name, String description, int quantity, double price) {
		String updateQuery = "name=?, description=?, quantitiy=?, price=? where id=?";
		return jdbcTemplate.update(updateQuery, name, description, quantity, price);
	}
	
	public int deleteItems(int id) {
		String deleteQuery = "delete from Items where id=?";
		return jdbcTemplate.update(deleteQuery, id);
	}
	
}



