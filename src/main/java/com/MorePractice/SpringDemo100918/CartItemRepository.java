package com.MorePractice.SpringDemo100918;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
	
	CartItem findBycartitemname(String cartitemname);

}
