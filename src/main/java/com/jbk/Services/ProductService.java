package com.jbk.Services;

import java.util.List;

import com.jbk.Entity.Product;

public interface ProductService {
public boolean ProductSave(Product product);

public List<Product> getAllProduct();
public Product getProductById(String productId);

public boolean deleteProductById(String id);

public boolean updateProductById(Product product);
public  List<Product> sortProductByName_Dec();
public Product getMaxPriceProduct();
public double sumOfAllProduct();
public int sizeOfProducts();

}
