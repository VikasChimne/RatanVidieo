package collectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

//To perform sorting 1)Data must be homogeneous. 2)must implements comparable interface
//in entire java only String & All Wrapper classes implements comparable interface
public class Test1 
{      public static void main(String[] args)
    {//Case 1
		ArrayList<String>al = new ArrayList<String>();
		al.add("ratan");
		al.add("anu");
		al.add("durga");
		al.add("surya");
        System.out.println("Before Sorting:"+al);//[ratan, anu, durga, surya]
        Collections.sort(al);
        System.out.println("After Sorting:"+al);//[anu, durga, ratan, surya]
        LinkedList<Integer>l = new LinkedList<Integer>();
        l.add(10);
        l.add(3);
        l.add(20);
        l.add(5);
        System.out.println("Before Sorting:"+l);//[10, 3, 20, 5]
        Collections.sort(l);
        System.out.println("After Sorting:"+l);//[3, 5, 10, 20]
//Case 2: ClassCastException-->comparison of integer object to string will get this exception
        ArrayList a2 = new ArrayList();
        a2.add(10);
        a2.add("ratan");
        Collections.sort(a2);
//Case3:NullPointerException -->comparison of any object to null will get this exception
        Vector v =new Vector();
        v.add(10);
        v.add(20);
        v.add(null);
        Collections.sort(v);//internally its implements compareTo()
	}

}
