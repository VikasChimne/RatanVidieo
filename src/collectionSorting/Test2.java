package collectionSorting;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 
{    public static void main(String[] args) 
    {
		ArrayList<Emp>al=new ArrayList<Emp>();
		al.add(new Emp(111,"ratan"));
		al.add(new Emp(444,"anu"));
		al.add(new Emp(333,"durga"));
		al.add(new Emp(222,"surya"));
		Collections.sort(al);
		for(Emp e:al)
		{System.out.println(e.eid+" "+e.ename);
		
		}
	}

}
