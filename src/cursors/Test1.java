package cursors;

import java.util.Enumeration;
import java.util.Vector;
//Enumeration Cursor:java 1.0 version.Applicable for legacy class only2)not for universal class 
//To read the data from collection Classes we have three way1)for each loop 2)get() 3)cursor
//Types of Cursor:1)Enumerator cursor.2)Iterator cursor.3)ListIterator cursor
//you get the Enumeration object by using element()
//Two Method contains:1)hasMoreelement()-Check data is available or not 2)nextElement()-just to read the data
//only support only read operation in forward direction only
//it support Normal and generic enumeration
//Enumerator is Interface
public class Test1
{
    public static void main(String[] args) 
    {
		Vector<String>v = new Vector<String>();
		v.add("ratan");
        v.add("anu");
        v.add("durga");
        v.add("surya");
        
   //Read the data by using Enumeration:normal version
        Enumeration e = v.elements();
        while(e.hasMoreElements())
        {
        	String s = (String)e.nextElement();
        	System.out.println(s);
        }
   //Read the Data by using Enumeration:generic
        Enumeration<String>e1 = v.elements();
        while(e1.hasMoreElements())
        {
        	String s = e1.nextElement();
        	System.out.println(s);
        }
     }

}
