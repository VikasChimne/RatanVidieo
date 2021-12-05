package mapEx;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

//LinkedHashMap-Insertion order preserved.& all like HashMap
public class Test2
{
     public static void main(String[] args) 
    {
		LinkedHashMap<Emp,Student>h=new LinkedHashMap<Emp,Student>();
        h.put(new Emp(111,"ratan"),new Student(1,"durga"));
        h.put(new Emp(222,"anu"),new Student(2,"surya"));
        
        Set<Emp>s=h.keySet();
        for(Emp e:s) 
        {
        	System.out.println(e.eid+" "+e.ename);
        }
        for(Emp ee: h.keySet())
        {
        	System.out.println(ee.eid+" "+ee.ename);
        }
        //Print the values
        for(Student s1:h.values())
        {
        	System.out.println(s1.sid+" "+s1.sname);
        }
        Set<Entry<Emp,Student>>ss=h.entrySet();
        Iterator<Entry<Emp,Student>>itr=ss.iterator();
        while(itr.hasNext())
        {
        	Entry<Emp,Student>e=itr.next();
        	Emp ee=e.getKey();
        	System.out.println(ee.eid+" "+ee.ename);
        	Student stu=e.getValue();
        	System.out.println(stu.sid+" "+stu.sname);
        }
        
	}

}
