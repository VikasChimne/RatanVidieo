package cursors;
//Removing Data from ArrayList using Iterator
import java.util.ArrayList;
import java.util.Iterator;

public class Test4 
{
    public static void main(String[] args) 
    {
	ArrayList<String>al=new ArrayList<String>();
        al.add("ratan");
        al.add("anu");
        al.add("durga");
        al.add("surya");
    //Iterator cursor-remove the data
        Iterator<String>itr=al.iterator();
        while(itr.hasNext())//to check the data is available or not
        {
        	String s = itr.next();//read the data
        	if(s.equals("surya"))
        	
        	  itr.remove();
        }
        System.out.println(al);
        		
        	
        
    }
}


