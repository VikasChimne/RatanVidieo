package collectionFramework;
//Array List Constructor
import java.util.ArrayList;

public class Test6 
{
     public static void main(String[] args) 
     {
		ArrayList<Integer>a1 = new ArrayList<Integer>();//Generic for type safety
        a1.add(10);
        a1.add(20);
        a1.add(30);
        ArrayList<Integer>a2 = new ArrayList<Integer>(a1);
        a2.add(100);
        a2.add(200);
        System.out.println(a2);
	 }
}
//public ArrayList()-Constructors an empty list with an initial capacity of ten
//Total 3 types of constructors1)default constructors 2)initial capacity constructors 
//3)Collection data constructors-to add one collection data into another collection
//ArrayList a1 = new ArrayList();
//a1.add(10);a2.add(20);a3.add(30);
//ArrayList a2 = new ArrayList (a1);
//a2.add(100); a2.add(300);


