package com.jbk.ServicesIMPL;
import java.util.Comparator;

import com.jbk.Entity.Product;

public class ProductNameComparator implements Comparator {

	public int compare(Product p1, Product p2) {
		
		return p1.getProductName().compareTo(p2.getProductName());
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
