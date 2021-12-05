package setExample;

import java.util.HashSet;

//HashSet(1.2 version)->1]Heterogeneous data allow.2]Null insertion allow.3]Duplicate not allow.4]insertion not preserved
//5]Non-Synchronized.6]underline data structure Hash table.7]Iterator cursor allow

//Iterable is Parent Interface of All Interface

public class Test1 
{      public static void main(String[] args) 
    {
		HashSet<String>h=new HashSet<String>();
		h.add("ratan");
		h.add("anu");
		h.add("durga");
		h.add("ratan");
		System.out.println(h);//[durga, ratan, anu]
		HashSet<String>h1=new HashSet<String>();
		System.out.println(h1.add("ratan"));//true.first Occurrence inserted
		System.out.println(h1.add("ratan"));//false
		System.out.println(h1);//ratan
	}

}
