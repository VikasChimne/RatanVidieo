package cursors;

import java.util.ArrayList;
import java.util.ListIterator;
//ListIterator cursor(1.2 version)-read the data Only for list classes#not Universal cursor#it contains 9 method
//All operation carried out.#Bidirectional#Interface
//It support both Normal version and generic
public class Test3
{
       public static void main(String[] args) 
    {
		ArrayList<String> al = new ArrayList<String>();
		al.add("ratan");
		al.add("anu");
		al.add("durga");
		
	//ListIterator cursor:with normal version.print the data forward and backward direction
		ListIterator lstr1 = al.listIterator();
		while(lstr1.hasNext())
		{
			String s = (String)lstr1.next();
			System.out.println(s);
	    }
		while(lstr1.hasPrevious())
		{
			String s = (String)lstr1.previous();
			System.out.println(s);
		}
	//ListIterator cursor:with generic version.print the data forward and backward direction
		ListIterator<String>lstr2 = al.listIterator();
		while(lstr2.hasNext())
		{
			String s = lstr2.next();
			System.out.println(s);
		}	
	    while(lstr2.hasPrevious())
		{
			String s = lstr2.previous();
			System.out.println(s);
		}
			
			while(lstr2.hasPrevious())
			{
				String s = lstr2.previous();
				System.out.println(s);
			}
				
		}
		
	}


