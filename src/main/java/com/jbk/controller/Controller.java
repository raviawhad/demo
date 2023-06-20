package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.Entity.Product;
import com.jbk.Services.ProductService;

@RestController  
@RequestMapping("/product")
public class Controller {
	@Autowired
	 private ProductService service;
	@PostMapping("/save-product")
  public String SaveProduct(@RequestBody Product product) {
		
	boolean isAdded = service.ProductSave(product);
	if(isAdded) {
		return "saved";
	}else {
		return "alrady exist";
	}

	
}
	
	@GetMapping("/getallProduct")
	public Object getAllProduct() {
		List<Product> list = service.getAllProduct();
		if(list.isEmpty()) {
			return "product does not Exist";
		}else {
			return list;
		}
		
	}
	
	@GetMapping("/getById/{id}")
	public Object getById(@PathVariable("id") String id) {
		
		  Product product = service.getProductById(id);
		  if(product!=null) {
			  return product;
		  }else {
			  return "product not found";
		  }
	}
	
	@GetMapping("/deleteProductById/{id}")
	public Object deleteProductById(@PathVariable("id")String id) {
             boolean isdeleted = service.deleteProductById(id);
             
            	 if (isdeleted) {
      			   return "peoduct sucsessfully deleted"+id;
      			   
      		   }else{
      			   return"product not deleted"+id;
      		   }
      		 }
	
	 @PutMapping("/updateProduct")
	 public String updateProductById(@RequestBody Product product) {
		 boolean isUpdate = service.updateProductById(product);
		 if (isUpdate) {
			 return "product id updated sucessfully";
			 
		 }else {
		      return "not updated";
		      }
	 }
	 
	 
	 @GetMapping("/sortProduct")
	 public  List<Product> sortProductByName_Dec(){
		 List<Product> list = service.sortProductByName_Dec();
		return list;
		 
	 }
	 
	 
	 @GetMapping("/MaxProceProduct")
	 public Product getMaxPriceProduct() {
		 Product product = service.getMaxPriceProduct();
		return product;
		 
	 }
	 
	 @GetMapping("/sumOfAllProductPrice")
	 public double sumOfAllProduct() {
		 double sum = service.sumOfAllProduct();
		return sum;
		 
	 }
	 
	 @GetMapping(ठठ)
	 public int sizeOfProducts() {
		 int size = service.sizeOfProducts();
		return size ;
		 
	 }
}






