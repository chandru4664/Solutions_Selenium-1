package selenium1.exam1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductAndStoresMain {

	public static void main(String[] args) {
		
		//SAMS Store inventory
		Product product1 = new Product(001, "laptop", 399.99d, 200);
		Product product2 = new Product(002, "cellphone", 699.99d, 500);
		Product product3 = new Product(003, "iPad", 599.99d, 300);
		
		List<Product> samsProductList = new ArrayList<Product>();
		
		samsProductList.add(product1);
		samsProductList.add(product2);
		samsProductList.add(product3);
		
		Stores sams = new Stores(samsProductList);
		
		try {
			System.out.println("----Sell iPads----"+ sams.sellItem(003, 100));
		} catch (ProductNotFoundException e) {
			e.printStackTrace();
		} catch (InsufficientQuantityException e) {
			e.printStackTrace();
		}
		
		try {
			sams.updateStock(002,  200);
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\nPrint products from the list");
		for(Product product : samsProductList) {
			System.out.println(product);
		}
		
		 System.out.println("\nSorted by price");
		 PriceCompare priceCompare = new PriceCompare();
		 Collections.sort(samsProductList, priceCompare);
		 for(Product product : samsProductList) {
				System.out.println(product);
		 }
	}

}
