package collectionFramework;

import java.util.ArrayList;

public class Test8 
{
      public static void main(String[] args)
      {
		Emp e1 = new Emp(111,"ratan");
        Emp e2 = new Emp(222,"anu");
        Emp e3 = new Emp(333,"durga");
        Emp e4 = new Emp(444,"surya");
     ArrayList<Emp>a1 = new ArrayList<Emp>();
        a1.add(e1);
        a1.add(e2);	 
     ArrayList<Emp>a2 = new ArrayList<Emp>();
        a2.addAll(a1);
        a2.add(e3);
        a2.add(e4);
     System.out.println(a2.contains(e2));//to check single object
     System.out.println(a2.containsAll(a1));//to check collection data
        a2.remove(e1);
     System.out.println(a2.contains(e1));
     System.out.println(a2.containsAll(a1));
     
     a2.removeAll(a1);//All a1 object are Removed
     a2.retainAll(a1);//remove a2 object by keeping a1 object
     for(Emp e : a1)
     {
    	 System.out.println(e.eid +" "+e.ename);
     }
     }

}
