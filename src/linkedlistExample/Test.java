package linkedlistExample;//1.2 version

import java.util.LinkedList;

//Heterogeneous data allow#Null Value allow#Duplicates are allow#insertion order  preserved#Non synchronized
//Two Cursor apply1)Iterator2)ListIterator

public class Test 
{    public static void main(String[] args)
    {
		LinkedList<String>ll = new LinkedList<String>();
		ll.add("ratan");
		ll.add("anu");
		ll.add("durga");
		ll.add(null);
        System.out.println(ll);//[ratan, anu, durga, null]
        ll.addFirst("aaa");
        ll.addFirst("zzz");
        System.out.println(ll);//[zzz, aaa, ratan, anu, durga, null]
        System.out.println(ll.size());//6
        ll.add(2,"surya");
        System.out.println(ll);//[zzz, aaa, surya, ratan, anu, durga, null]
        ll.set(1,"anushka");
        ll.remove(2);
        System.out.println(ll);//[zzz, anushka, ratan, anu, durga, null]
        ll.remove("durga");
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);//[anushka, ratan, anu]
        System.out.println(ll.isEmpty());//false
        ll.clear();
        System.out.println(ll.isEmpty());//true
    }

}
