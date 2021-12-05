package collectionFramework;
//Conversion Process
import java.util.ArrayList;
import java.util.Arrays;

public class Test9 
{
     public static void main(String[] args) 
    {//Conversion of Arrays to Collection
    	 String[] s = {"aaa","bbb","ccc"};
    	 ArrayList<String>a1 = new ArrayList<String>(Arrays.asList(s));
		a1.add("ratan");
		a1.add("durga");
		System.out.println(a1);

	//Conversion of Normal Collection to Array
		ArrayList a2 = new ArrayList();
		   a2.add("ratan");//Heterogeneous data thats why we cant create string array
		   a2.add(10);
		   Object[] o = a2.toArray();//we can hold the object by using object class
		   for(Object oo : o)
		   {
			   System.out.println(oo);
		   }
	//Conversion of generic Collection to arrays
		   ArrayList<String>a3 = new ArrayList<String>();
		   a3.add("ratan");
		   a3.add("durga");
		   String[] s1 = new String[a2.size()];
		   a3.toArray(s1);
		   for(String ss : s1)
		   {
			   System.out.println(ss);
		   }
		
	}

}
