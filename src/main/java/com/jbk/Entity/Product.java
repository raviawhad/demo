

package com.jbk.Entity;





public class Product {

private  String productId;
private  String ProductName;
private  int supplyerId;
private  int catagoryId;
 private int productQTY;
 private  double productPrice;
 
 public Product() {
		// TODO Auto-generated constructor stub
	}

 
public Product(String productId, String productName, int supplyerId, int catagoryId, int productQTY,
		double productPrice) {
	super();
	this.productId = productId;
	this.ProductName = productName;
	this.supplyerId = supplyerId;
	this.catagoryId = catagoryId;
	this.productQTY = productQTY;
	this.productPrice = productPrice;
	
}


public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	this.ProductName = productName;
}
public int getSupplyerId() {
	return supplyerId;
}
public void setSupplyerId(int supplyerId) {
	this.supplyerId = supplyerId;
}
public int getCatagoryId() {
	return catagoryId;
}
public void setCatagoryId(int catagoryId) {
	this.catagoryId = catagoryId;
}
public int getProductQTY() {
	return productQTY;
}
public void setProductQTY(int productQTY) {
	this.productQTY = productQTY;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", ProductName=" + ProductName + ", supplyerId=" + supplyerId
			+ ", catagoryId=" + catagoryId + ", productQTY=" + productQTY + ", productPrice=" + productPrice + "]";
}
 
}
