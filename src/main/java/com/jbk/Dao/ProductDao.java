package com.jbk.Dao;

import java.util.List;

import com.jbk.Entity.Product;

public interface ProductDao {
	public boolean ProductSave(Product product);
	 
	public List<Product> getAllProduct();
	public Product getProductById(String productId);
	public boolean deleteProductById(String product);

	public boolean updateProductById(Product product);
	
}
