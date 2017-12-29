package selenium1.exam1;

import java.util.Comparator;

public class PriceCompare implements Comparator<Product>{

	public PriceCompare(){
		super();
	}

	@Override
	public int compare(Product p1, Product p2) {
		if (p1.getPrice() < p2.getPrice())
			return -1;
		if (p1.getPrice() > p2.getPrice())
			return 1;
		else
			return 0;
	}

}
