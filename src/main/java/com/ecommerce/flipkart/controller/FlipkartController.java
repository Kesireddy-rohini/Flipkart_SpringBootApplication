package com.ecommerce.flipkart.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.flipkart.entity.Product;
import com.ecommerce.flipkart.service.FlipkartService;

@RestController
public class FlipkartController {
	@Autowired
	private FlipkartService flipkartService;

	@GetMapping("/appName")
	public String appName() {
		return flipkartService.appName();

	}

	@GetMapping("/productList")
	public List<String> productList() {
		return flipkartService.productList();

	}

	@GetMapping("/productListQuantity")
	public Map<String, String> productListQuantity() {
		return flipkartService.productListQuantity();

	}
	

	@PostMapping("/saveProduct")
	public void saveProduct(@RequestBody  Product product) {
		
		flipkartService.saveProduct(product);
		
	}
	
	@GetMapping("/findProductById/{productId}")
	public Optional<Product> findProductById(@PathVariable Integer productId) {
		
		 return flipkartService.findProductById(productId);
		
	}
	
	@DeleteMapping("/deleteProductById/{productId}")
	public void deleteProductById(@PathVariable Integer productId) {
		
		flipkartService.deleteProductById(productId);
		
	}
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts(){
		
		return flipkartService.getAllProducts();
		
	}
	
	
	@PutMapping("/updateProduct/{productId}")
	public void updateProduct(@PathVariable Integer productId, @RequestBody Product product) {
	    flipkartService.updateProduct(productId, product);
	}

	
	}


