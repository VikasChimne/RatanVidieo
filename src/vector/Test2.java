package vector;

import java.util.Iterator;
import java.util.Vector;

public class Test2 
{
    public static void main(String[] args)
    {
    	Vector<Integer>v = new Vector<Integer>();
    	for(int i=1;i<=30;i++)
    	{
    		v.add(i);
    		System.out.println(v);
    	}
    	//Remove the odd elements by using iterator cursor
    	 Iterator<Integer>itr=v.iterator();
    	 while(itr.hasNext())//to check the data is available or not
         {
         	Integer i= itr.next();
         	if(i%2==0)
         		System.out.println(i);//even printed
         	else
         		itr.remove();
	}
    	 System.out.println(v);
    }

}
