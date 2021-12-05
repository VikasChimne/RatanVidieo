package productSorting;

import java.util.Comparator;

public class NameComp implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		
		return p1.name.compareTo(p2.name);//for Ascending order
	}//for Descending order->return p2.name.compareTo(p1.name)

}
