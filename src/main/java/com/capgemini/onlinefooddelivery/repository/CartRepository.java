package com.capgemini.onlinefooddelivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.onlinefooddelivery.model.FoodCart;

public interface CartRepository extends JpaRepository<FoodCart,Integer>{

	public default FoodCart removeCategory(String categoryName) {
	return new FoodCart();
	
	/*
	 * @Query("from foodcart inner Join item.product p inner Join item.customer c where c.customerId=:custId"
	 * ) public List<Cart> getCartItems(@Param("custId") Integer customerId);
	 */
}
	
}
