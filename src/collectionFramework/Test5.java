package collectionFramework;

import java.util.ArrayList;
//Remove the Data-2 ways :1)by giving index no.2)by giving object also
//if object is not available,value just ignored,no any error
//if index is not available the IndexOutOfBoundException occur
public class Test5
{       public static void main(String[] args) 
    {
		ArrayList al = new ArrayList();
       al.add(10);
       al.add(10.5);
       al.add("durga");
       al.add("ratan");
       al.add(10);
       al.add(null);
       System.out.println(al);
       System.out.println(al.size());
       al.add(3,"anu");//3 is index position.anu is element added
       System.out.println(al);
       al.remove(2);//int value by default index
       al.remove("durga");//Already removed so ignored that value
       System.out.println(al);
       //al.remove(20);//by default index value/java lang.IndexOutOfBoundException
       al.remove("ccc");//value just ignored
       
       //Replace the data by using set method
       al.set(1, "xxx");//first index position replace by xxx
       System.out.println(al);
       System.out.println(al.isEmpty());//false
       al.clear();
       System.out.println(al.isEmpty());//true
       
       ArrayList a2 = new ArrayList();
       a2.add(10);
      // a2.remove(10);//by default index value/java lang.IndexOutOfBoundException
       System.out.println(a2);
	}

}
