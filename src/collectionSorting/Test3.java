package collectionSorting;

import java.util.ArrayList;
import java.util.Collections;

public class Test3 
{   public static void main(String[] args)
	{
	ArrayList<Emp1>al=new ArrayList<Emp1>();
	al.add(new Emp1(111,"ratan"));
	al.add(new Emp1(444,"anu"));
	al.add(new Emp1(333,"durga"));
	al.add(new Emp1(222,"surya"));
	Collections.sort(al,new EnameComp());//EidComp->id in ascending order//EnameComp--> name in alphabetical order
	for(Emp1 e:al)
	{System.out.println(e.eid+" "+e.ename);}

	}

}
