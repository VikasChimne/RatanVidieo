package mapEx;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test3 
{
      public static void main(String[] args) 
    {
       LinkedHashMap<Integer,Product>h=new LinkedHashMap<Integer,Product>();
       h.put(1, new Product(111,"pen",10.5)); 
       h.put(2, new Product(222,"bottle",500.4)); 
       h.put(3, new Product(333,"phone",10000.5)); 
       h.put(4, new Product(444,"chair",1000.5)); 
       Set<Entry<Integer,Product>>s=h.entrySet();
       Iterator<Entry<Integer,Product>>itr=s.iterator();
       while(itr.hasNext())
       {
    	   Entry<Integer,Product>e=itr.next();
    	   Product p = e.getValue();
    	   if(p.id==111)
    		   itr.remove();
    	   if(p.name.equals("phone"))
    		   itr.remove();
       }
       //Print the data using for each loop
       for(Entry<Integer,Product>e:h.entrySet())
       {
    	   Product p = e.getValue();
    	   System.out.println(p.id+" "+p.name+" "+p.cost);
       }
	}

}
