package mapEx;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

//HashMap->It store object in key value format.#Allow Heterogeneous data.#Allow null values#Nonsynchronized
//cursor are not allow#Underline data structure is HashTable 
//keys must unique, values are duplicate
public class Test1
{
      public static void main(String[] args) 
    {
		HashMap<Integer,String>h= new HashMap<Integer,String>();
		h.put(111, "ratan");
		h.put(222, "durga");
		h.put(6, "anu");
		h.put(4, "surya");//insertion order not preserved in HashMap
		h.put(5, "surya");
		System.out.println(h);//{4=surya, 5=surya, 6=anu, 222=durga, 111=ratan}
		
		Set<Integer>s=h.keySet();
		System.out.println(s);//[4, 5, 6, 222, 111]
		Collection<String>c=h.values();
		System.out.println(c);//[surya, surya, anu, durga, ratan]
		
		Set<Entry<Integer,String>>s1=h.entrySet();
		for(Entry<Integer,String>e:s1)
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}

}
