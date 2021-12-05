package treeMapEx;

import java.util.Comparator;
import java.util.TreeMap;
//Fourth Constructor:TreeMap(Comparator c)
//In TreeMap,the data is in natural sorting ordered but if We dontn't want natural sorting order,
//then we have our own comparator,for my own sorting,pass that comparator to TreeMap comparator 
//is called customized sorting order

public class Test4
{
      public static void main(String[] args)
    {
     	TreeMap<Integer,String>t1=new TreeMap<Integer,String>(new MyComp());//
     	t1.put(1, "ratan");
   	    t1.put(10, "anu");
   	    t1.put(2, "durga");
   	    t1.put(20, "surya");
   	    System.out.println(t1);//{20=surya, 10=anu, 2=durga, 1=ratan}
	}
}
class MyComp implements Comparator<Integer>//my own comparator paasing to TreeMap
{ @Override
	public int compare(Integer i1, Integer i2) 
    {
		return -i1.compareTo(i2);
	}
}