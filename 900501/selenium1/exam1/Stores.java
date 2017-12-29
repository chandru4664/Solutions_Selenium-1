package selenium1.exam1;

import java.util.List;

public class Stores {

	List<Product> productList;

	public Stores(List<Product> list) {
		super();
		this.productList = list;
	}
	
	public double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException,
										InsufficientQuantityException{
		boolean productFound = false;
		for(Product product: productList) {
			if(product.getProductId() == productCode) {
				productFound = true; 
				if(qtyRequired > product.getQuantityOnHand()) {
					throw new InsufficientQuantityException("Required product quantity is not available "+ qtyRequired);
				}
				product.setQuantityOnHand(product.getQuantityOnHand()-qtyRequired);
				if(product.getQuantityOnHand() <= product.reorderLevel ) {
					System.out.println("Purchase order is made");
				}
				return qtyRequired*product.getPrice();
			}
		}
		
		if(productFound == false) {
			throw new ProductNotFoundException("Product with given code is not Found in the list "+productCode);
		}
		
		return 0d;
		
	}
	
	public void updateStock(int productCode, int arrivedQty) throws ProductNotFoundException{
		boolean productFound = false;
		for(Product product: productList) {
			if(product.getProductId() == productCode) {
				productFound = true; 
				product.setQuantityOnHand(product.getQuantityOnHand()+arrivedQty);
				System.out.println("------Updated Product Quantity--------"+product.getQuantityOnHand());
			}
		}
		
		if(productFound == false) {
			throw new ProductNotFoundException("Product with given code is not Found in the list "+productCode);
		}
	}
	
}
