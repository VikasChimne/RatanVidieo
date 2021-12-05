package treeSetEx;//1.2 version

import java.util.TreeSet;

//Not allow homogeneous data#Parent Interface is soredSet
//If we allow Heterogeneous data it internally call compareTo()//ClassCastException occur
//It allow default sorting order
public class Test1
{    public static void main(String[] args) 
    {
		TreeSet<String>t = new TreeSet<String>();
		t.add("ratan");
		t.add("anu");
		t.add("durga");
		t.add("surya");
		System.out.println(t);//[anu, durga, ratan, surya]Natural sorting order
		TreeSet<Integer>t1 = new TreeSet<Integer>();
		t1.add(10);
		t1.add(2);
		t1.add(3);
		t1.add(20);
		System.out.println(t1);//[2, 3, 10, 20]
		TreeSet t2 = new TreeSet();
		t2.add(10);
		//t2.add(("ratan");//java.lang.ClassCastException
		TreeSet t3 = new TreeSet();
		t3.add("ratan");
		t3.add(null);//java.lang.NullPointerException
	}

}
