package setExample;

import java.util.HashSet;
import java.util.LinkedHashSet;
//Case 1=Adding one Collection data into Another Collection
//a)Constructor Approach only one Collection.b)addAll()=multiple collection to another
//Case 2=parent can hold child object. parent p = new child()
//Case 3=//Eliminating duplicates from List data Using set
public class Test3 
{       public static void main(String[] args) 
    {
		LinkedHashSet<String>h1 = new LinkedHashSet<String>();
		h1.add("ratan");
		h1.add("anu");
		HashSet<String>h2 = new HashSet<String>(h1);
		h2.add("aaa");
		System.out.println(h2);//[aaa, ratan, anu]
		LinkedHashSet<String>h11 = new LinkedHashSet<String>();
		h11.add("ratan");
		LinkedHashSet<String>h12 = new LinkedHashSet<String>();
		h12.add("durga");
		LinkedHashSet<String>h13 = new LinkedHashSet<String>();
		h13.addAll(h11);
		h13.addAll(h12);
		h13.add("aaa");
		System.out.println(h13);//[ratan, durga, aaa]
	}

}
