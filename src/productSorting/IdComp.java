package productSorting;

import java.util.Comparator;

public class IdComp implements Comparator<Product> {


	public int compare(Product p1, Product p2) {
		
			if(p1.id==p2.id)//For Ascending order of product id//If you want Descending order p2.id==p1.id
			return 0;
			else if (p1.id>p2.id)//For Ascending order//for Descending order p2.id>p1.id
				return 1;
			else
				return -1;
		}
		
	}

	

	


