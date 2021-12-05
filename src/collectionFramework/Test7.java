package collectionFramework;

import java.util.ArrayList;

//Adding one Collection Data to Another Collection
//add()-used to add one object;  addAll()-used to add collection data
public class Test7
{
     public static void main(String[] args) 
    {//Approach 1:constructor add.only one constructor into another
    	 ArrayList<Integer>a1 = new ArrayList<Integer>();//Generic for type safety
         a1.add(10);
         ArrayList<Integer>a2 = new ArrayList<Integer>(a1);//Generic for type safety
         a2.add(100);
         System.out.println(a2);
         
     //Approach 2:addAll():to add more than one collection into another
         ArrayList<Integer>b1 = new ArrayList<Integer>();//Generic for type safety
         b1.add(100);
         ArrayList<Integer>b2 = new ArrayList<Integer>();//Generic for type safety
         b2.add(200);
         ArrayList<Integer>b3 = new ArrayList<Integer>();//Generic for type safety
         b3.addAll(b1); b3.addAll(b2);
         b3.add(300);
         System.out.println(b3);
	}

}
