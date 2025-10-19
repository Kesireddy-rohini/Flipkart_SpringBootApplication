package com.ecommerce.flipkart.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.flipkart.entity.Product;

public interface FlipkartRepo extends JpaRepository<Product, Integer> {
	
	

}
