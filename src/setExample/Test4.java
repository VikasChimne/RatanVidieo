package setExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test4 
{      public static void main(String[] args) 
    {
		Set<String>s=new HashSet<String>();//Case 2=parent can hold child object. parent p = new child()
		s.add("ratan");
		s.add("durga");
		System.out.println(s);//[durga, ratan]//HashSet -insertion order not follow
        ArrayList<String> al = new ArrayList<String>();
        al.add("ratan");
        al.add("anu");
        al.add("ratan");
        HashSet<String>h=new HashSet<String>(al);////Case 3=//Eliminating duplicates from List data Using set
        System.out.println(h);//[ratan, anu]
	}

}
