package com.ecommerce.flipkart.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.flipkart.entity.Product;
import com.ecommerce.flipkart.repo.FlipkartRepo;

@Service
public class FlipkartServiceImp implements FlipkartService{

	@Autowired
	FlipkartRepo flipkartRepo;
	
	@Override
	public String appName() {
		return "FLipkart";
		
	}

	@Override
	public List<String> productList() {
		ArrayList<String> al = new ArrayList();
		al.add("Shoes");
		al.add("Jewellery");
		al.add("Clothes");
		al.add("Gadgets");
		return al;
		
	}

	@Override
	public Map<String, String> productListQuantity() {
		HashMap<String, String> hm = new HashMap();
		hm.put("Shoes", "4");
		hm.put("Jewellery", "10");
		hm.put("Clothes","50");
		hm.put("Gadgets","6");
		return hm;
		
		
	}

	@Override
	public void saveProduct(Product product) {
		flipkartRepo.save(product);
	}

	@Override
	public Optional<Product> findProductById(Integer productId) {
	  return flipkartRepo.findById(productId);
		
	}

	@Override
	public void deleteProductById(Integer productId) {
		flipkartRepo.deleteById(productId);
		
	}

	@Override
	public List<Product> getAllProducts() {
		
		return flipkartRepo.findAll();
	}

	@Override
	public void updateProduct(Integer productId, Product product) {
		Product p = flipkartRepo.findById(productId).get();
		p.setProductName(product.getProductName());
		p.setProductQuantity(product.getProductQuantity());
		flipkartRepo.save(p);
		
	}
	
	

}
