package treeMapEx;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Test5
{
    public static void main(String[] args)
	{
     	TreeMap<Product,Integer>tm=new TreeMap<Product,Integer>(new MyComp1());//
        tm.put(new Product(111,"ratan"),1);
        tm.put(new Product(222,"anu"),2);
        tm.put(new Product(333,"durga"),3);
        tm.put(new Product(444,"surya"),4);
        Set<Product>s=tm.keySet();
        for(Product p:s)
        {
        	System.out.println(p.id+" "+p.name);
        }
	}
}
class MyComp1 implements Comparator<Product>
{  @Override
	public int compare(Product p1, Product p2)
    {
		return -p1.id.compareTo(p2.id);//(-) for descending order
	}
}
