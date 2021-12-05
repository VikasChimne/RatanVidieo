package treeSetEx;

import java.util.Comparator;
import java.util.TreeSet;

public class Test2 
{
       public static void main(String[] args) 
    {
	   TreeSet<String>t=new TreeSet<String>(new MyComp());
	    t.add("ratan");
		t.add("anu");
		t.add("durga");
		t.add("surya");
        System.out.println(t);//[surya, ratan, durga, anu]Descending orde
        TreeSet<Integer>t1=new TreeSet<Integer>(new MyComp1());
        t1.add(10);
        t1.add(3);
        t1.add(7);
        t1.add(20);
        System.out.println(t1);//[20, 10, 7, 3]Descending order
    }
}
class MyComp implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		
		return -s1.compareTo(s2);//[surya, ratan, durga, anu]Descending order
	}
}
class MyComp1 implements Comparator<Integer>
{

	@Override
	public int compare(Integer i1, Integer i2) {
		
		return -i1.compareTo(i2);//[20, 10, 7, 3]Descending order
	}
	
}
