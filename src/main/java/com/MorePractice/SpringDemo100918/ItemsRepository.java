package com.MorePractice.SpringDemo100918;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemsRepository extends JpaRepository<Items, Integer> {
	
	Items findByitemname(String itemname);

}
