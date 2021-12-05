package cursors;

import java.util.ArrayList;
import java.util.Iterator;

//Iterator Cursor:1.2 version not legacy\
//you can read the data from all classes
//universal cursor
//get the Iterator object by using iterator() method
//Read and Remove operation possible
//It contains 4 method:1)hasNext()-just check data is available or not2)Next()-to read the data3)Remove().4)forEachREmaining
//supporting normal and    generic iterator
//Iterator is interface
public class Test2
{
    public static void main(String[] args) 
    {
		ArrayList<String>a1 = new ArrayList<String>();
		a1.add("ratan");
        a1.add("anu");
        a1.add("durga");
        a1.add("surya");
  //Read the data by using iterator:normal version
        Iterator itr = a1.iterator();
        while(itr.hasNext())
        {
        	String s = (String)itr.next();
        	System.out.println(s);
        }
   //read the data by using iterator:generic version
        Iterator<String>itr1 = a1.iterator();
        while(itr1.hasNext())
        {
        	String s = itr1.next();
        	System.out.println(s);
        }
    }

}
