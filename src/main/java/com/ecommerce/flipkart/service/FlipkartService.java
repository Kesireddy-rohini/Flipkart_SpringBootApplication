package com.ecommerce.flipkart.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.ecommerce.flipkart.entity.Product;

public interface FlipkartService {
	
	public String appName();
	public List<String> productList();
	public Map<String, String> productListQuantity();
	public void saveProduct(Product product);
	
	public Optional<Product> findProductById(Integer productId);

	public void deleteProductById(Integer productId);
	
	public List<Product> getAllProducts();
	
	public void updateProduct(Integer productId, Product product);
	
}
