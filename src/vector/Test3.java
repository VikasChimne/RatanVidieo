package vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test3
{
     public static void main(String[] args)
    {
		Vector<Product>products=new Vector<Product>();
        products.add(new Product(111,"pen",20));
        products.add(new Product(222,"fan",20));
        products.add(new Product(333,"light",20));
   //Print the data using Enumeration cursor
        Enumeration<Product>e=products.elements();
        while(e.hasMoreElements())//Check the data available or not
        {
        	Product p =e.nextElement();//Read the data
        	System.out.println(p.id+" "+p.name+" "+p.cost);
        }
   // Print the data using Iterator cursor
        Iterator<Product>itr=products.iterator();
        while(itr.hasNext())//Check the data available or not
        {
        	Product p = itr.next();//Read the data
        	System.out.println(p.id+" "+p.name+" "+p.cost);
        }
  //   Print the data using ListIterator cursor
        ListIterator<Product>lstr = products.listIterator();
        while(lstr.hasNext())//Check the data available or not
        {
        	Product p = lstr.next();//Read the data
        	System.out.println(p.id+" "+p.name+" "+p.cost);
        }
	}

}
