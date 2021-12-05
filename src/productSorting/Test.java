package productSorting;

import java.util.Collections;
import java.util.LinkedList;

public class Test 
{    public static void main(String[] args) 
    {
		LinkedList<Product>l = new LinkedList<Product>();
		l.add(new Product(11,"pen",50.5));
		l.add(new Product(44,"fan",500.5));
		l.add(new Product(22,"bottle",100.5));
		l.add(new Product(33,"chair",1089.5));
    Collections.sort(l,new IdComp());//NameComp()->sorting by Name
    for(Product p :l)
    {
    	System.out.println(p.id+" "+p.name+" "+p.cost);
    }
	}


}
