package vector;

import java.util.ArrayList;
import java.util.Vector;

//ArrayList vs Vector
public class test1 
{
    public static void main(String[] args)
    {
		Vector<String>v = new Vector<String>(2,6);
		System.out.println(v.capacity());
        v.add("ratan");
        v.add("anu");
        v.add("durga");
        System.out.println(v);
        System.out.println(v.capacity());
        
        ArrayList<String>al=new ArrayList<String>();
   	 al.add("aaa");
        al.add("bbb");
        Vector<String>v1 = new Vector<String>(al);
        v1.add("ratan");
        v1.add("anu");
        System.out.println(v1);
	}

}
