package com.jbk.DaoIMPL;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jbk.Dao.ProductDao;
import com.jbk.Entity.Product;
@Repository
public class ProductDaoIMPL implements ProductDao {
	List<Product> list = new ArrayList<Product>();
	

	public ProductDaoIMPL() {
		list.add(new Product("1", "aaa", 101, 101, 10, 50));
		list.add(new Product("2", "bbb", 101, 101, 12, 60));
		list.add(new Product("3", "ccc", 101, 102, 100, 500));
	}
	

	@Override
	public boolean ProductSave(Product product) {
		boolean isExist =false;
		 for (Product dbproduct : list) {
			if (dbproduct.getProductName().equalsIgnoreCase(product.getProductName())) {
			isExist=true;
			break;
			}	
		}
		 if(isExist) {
	    
	    return false;
	
	
		 }else {
			  list.add(product);
			  return true;
		 }
	}

	@Override
	
	public Product getProductById(String productId) {
		Product product = null;
		 for (Product productdb : list) {
			if(productdb.getProductId().equals(productId)) {
			 product = productdb;
				break;
			}
			
		}
		return product;
	}

	@Override
	public List<Product> getAllProduct() {
		
		return list;
	}


	@Override
	public boolean deleteProductById(String productId) {
		boolean isdeleted =false;
	   for (Product productdb : list) {
		
		if(productdb.getProductId().equals(productId)) {
			  list.remove(productId);
			  isdeleted=true;
			  break;
		 }
		   
	}
		return isdeleted;
	}


	@Override
	public boolean updateProductById(Product product) {
		boolean isUpdate =false;
	for (Product productdb : list) {
		
		if(productdb.getProductId().equals(product.getProductId())) {
			list.set(list.indexOf(productdb), product);
			isUpdate = true;
			break;
		}
		
	}
	
	return isUpdate;
		
	}




}
