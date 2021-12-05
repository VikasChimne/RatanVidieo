package cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test6
{
     public static void main(String[] args) 
    {
    	 ArrayList<String>al=new ArrayList<String>();
    	 al.add("ratan");
         al.add("anu");
         al.add("durga");
         ListIterator<String>lstr=al.listIterator();
         lstr.add("surya");
         while(lstr.hasNext())
         {
        	 String s =lstr.next();
        	 if(s.equals("durga"))
        		 lstr.remove();
        	 if(s.equals("anu"))
        		 lstr.set("anushka");
         }
         System.out.println(al);
	}

}
