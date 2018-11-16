package com.MorePractice.SpringDemo100918;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Integer> {
	
	Person findByFName(String name);

}
