package collectionFramework;
//Swapping the Data
import java.util.ArrayList;
import java.util.Collections;

public class Test10 
{
     public static void main(String[] args)
	{
		ArrayList<String>a1 = new ArrayList<String>();
		a1.add("Ratan");
		a1.add("anu");
        a1.add("durga");
        a1.add("surya");
        System.out.println("before Swaping:"+a1);
        Collections.swap(a1, 1, 3);
        System.out.println("After Swaping:"+a1);
        ArrayList<String>a2= new ArrayList<String>(a1.subList(1, 4));
        a2.add("aaa");
        System.out.println(a2);
	}

}
