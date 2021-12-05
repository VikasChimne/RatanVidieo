package setExample;

import java.util.Iterator;
import java.util.LinkedHashSet;
//Adding Employee object in LinkedHashset
public class Test2
{      public static void main(String[] args) 
    {
		LinkedHashSet<Emp>h = new LinkedHashSet<Emp>();
		h.add(new Emp(111,"ratan"));
		h.add(new Emp(222,"anu"));
		h.add(new Emp(333,"durga"));
		
		Iterator<Emp>itr = h.iterator();
		while(itr.hasNext())//Check the data is available or not
		{
			Emp e = itr.next();//Read the data
			//System.out.println(e.eid+" "+e.ename);
			if(e.eid==111)
			  itr.remove();
			if(e.ename.equals(("durga")))
					itr.remove();}
		for(Emp e : h)
		{
			System.out.println(e.eid+" "+e.ename);
				
			
		}
	}

}
