package collectionFramework;

import java.util.ArrayList;

public class Test1 
{
     public static void main(String[] args)
     {//AutoBoxing directly can add the data
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.5);
		al.add("ratan");
		al.add("a");
		al.add(null);
		al.add(10);
		System.out.println(al);

	 }
}
//Collection are type safe-->problem faced while reading the data->1)type casting 2)type checking
//to provide type safe to collection by providing Generic
//Automatic conversion of  primitive to wrapper object format is called AutoBoxing 
//java 1.5:AutoBoxing directly can add the data
//Arrays are type safe means int[] can hold only int data,float[] can hold only float data