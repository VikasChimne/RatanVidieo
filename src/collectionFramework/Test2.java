package collectionFramework;

import java.util.ArrayList;

public class Test2 
{
      public static void main(String[] args)
    {
    	  ArrayList al = new ArrayList();
          al.add(new Emp(111,"ratan"));
          al.add(new Student(1,"durga"));
          al.add("ratan");
          al.add(10);
          al.add(null);
          System.out.println(al.toString());
          
          for(Object o : al)
          {
        	  if(o instanceof Emp)//Typing Checking
        	  {Emp e = (Emp)o;
        	  System.out.println(e.eid+" "+e.ename);
        	  }
        	  if(o instanceof Student)//Typing Checking
        	  {Student s = (Student)o;
        	  System.out.println(s.sid+" "+s.sname);
        	  }
        	  if(o instanceof Integer) //Typing Checking
        	  {
        		  System.out.println(o);
        	  }
        	  if(o instanceof String)
        	  {
        		  System.out.println(o);
        	  }
        	  if(o==null)
        	  {
        		  System.out.println(o);
        	  }
          }
    }

}
