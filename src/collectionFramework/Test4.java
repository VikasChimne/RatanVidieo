package collectionFramework;

import java.util.ArrayList;

public class Test4 
{
    public static void main(String[] args) 
    {   //Arrays are type safe
    	int[] a = {10,20,30};
    	for(int aa:a)
    	{
    		System.out.println(aa);
    	}
		//Collections are not type safe
    	//to provide type safe to collection by providing Generic
        ArrayList al = new ArrayList();
        al.add(new Emp(111,"ratan"));
        al.add(new Student(1,"durga"));
        for(Object o :al)
        {
        	if(o instanceof Emp)
        	{
        		Emp e = (Emp)o;
        		System.out.println(e.eid+" "+e.ename);
        	}
        	if(o instanceof Student)
        	{
        		Student s = (Student)o;
        		System.out.println(s.sid+" "+s.sname);
        	}
        	Object oo = al.get(1);
        	if(oo instanceof Emp)
        	{
        		Emp e = (Emp)oo;
        		System.out.println(e.eid+" "+e.ename);
        	}
        	if(oo instanceof Student)
        	{
        		Student s = (Student)oo;
        		System.out.println(s.sid+" "+s.sname);
        	}
        	//provide the type safety to the Collection using generic
        	ArrayList<Emp>a2 = new ArrayList<Emp>();
        	a2.add(new Emp(111,"ratan"));
            a2.add(new Emp(222,"durga"));
            for(Emp e : a2)//Reading data
            {
            	System.out.println(e.eid+" "+e.ename);
            }
            Emp e = a2.get(1);//getting data
            System.out.println(e.eid+" "+e.ename);
        }
	}

}
