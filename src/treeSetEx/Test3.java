package treeSetEx;

import java.util.Comparator;
import java.util.TreeSet;

public class Test3
{    public static void main(String[] args)
    {
		TreeSet<Product>t1=new TreeSet<Product>(new MyComp2());
		t1.add(new Product(111,"Chair",1000));
		t1.add(new Product(333,"pen",100));
		t1.add(new Product(222,"bottle",1500));
		t1.add(new Product(444,"phone",2000));
		for(Product p: t1)
			System.out.println(p.id+" "+p.name+" "+p.cost);
	}
}
class MyComp2 implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) {
		
		return -p1.name.compareTo(p2.name);//for descending order
	}
	
}
