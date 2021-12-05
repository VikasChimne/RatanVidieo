package treeMapEx;

import java.util.TreeMap;

//2)Constructor ->Adding one map data into another map
//Two Way :1)Constructor Approach:only one data add at time.2)putAll():All data add in single time
public class Test2 
{
    public static void main(String[] args)
    {//Constructor Approach:only one data add at time.
		TreeMap<String,Integer>t1=new TreeMap<String,Integer>();
		t1.put("ratan", 111);
		TreeMap<String,Integer>t2=new TreeMap<String,Integer>(t1);
		t2.put("anu", 222);
		System.out.println(t2);//{anu=222, ratan=111}
		
    //putAll():All data add in single time
		TreeMap<String,Integer>m1=new TreeMap<String,Integer>();
		m1.put("aaa", 1);
		m1.put("a", 2);
		TreeMap<String,Integer>m2=new TreeMap<String,Integer>();
		m2.put("bbb", 1);
		m2.put("b", 2);
		TreeMap<String,Integer>m3=new TreeMap<String,Integer>();
		m3.putAll(m1);
		m3.putAll(m2);
		m3.put("ccc", 3);
		System.out.println(m3);//{a=2, aaa=1, b=2, bbb=1, ccc=3}
	}

}
