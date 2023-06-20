package com.jbk.ServicesIMPL;


import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.ProductDao;

import com.jbk.Entity.Product;
import com.jbk.Services.ProductService;
@Service
public class serviceIMPL implements ProductService {
	@Autowired
	private ProductDao dao;
	@Override
	public boolean ProductSave(Product product) {


      String productId = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
      product.setProductId(productId);
      
       boolean isExist = dao.ProductSave(product);
	    
		return isExist;
	}

	@Override
	public Product getProductById(String productId) {
		
		 return  dao.getProductById(productId);
		
		
	
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> list = dao.getAllProduct();
		return list;
	}

	@Override
	public boolean deleteProductById(String productId) {
		return	dao.deleteProductById( productId);
	
	}

	
	@Override
	public boolean updateProductById(Product product) {
	return	dao.updateProductById(product);
	
	
		
	}

	@Override
	public List<Product> sortProductByName_Dec() {
		 List<Product> list = getAllProduct();
		Collections.sort(getAllProduct(), 
			   Comparator.comparing(Product::getProductName).reversed());
		//Collections.sort(list, new ProductNameComparator().reversed());
		return list;
	}

	@Override
	public Product getMaxPriceProduct() {
		       List<Product>list  = getAllProduct();
		 Product product = list.stream().max(Comparator.comparingDouble(Product::getProductPrice)).get();
		return product;
	}

	@Override
	public double sumOfAllProduct() {
	  List<Product> list = getAllProduct();
	  Double sumofproduct = list.stream().map(product -> product.getProductPrice()).reduce(0d, (sum, price)-> sum+price);

		return  sumofproduct ;
	}

	@Override
	public int sizeOfProducts() {
	 List<Product> list = getAllProduct();
	 int size = list.size();
		return size;
	}
	
     
}
