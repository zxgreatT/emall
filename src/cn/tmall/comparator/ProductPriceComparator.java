package cn.tmall.comparator;

import java.util.Comparator;

import cn.tmall.bean.Product;

public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		
		return Math.round(p1.getPromotePrice() - p2.getPromotePrice());
	}

}
