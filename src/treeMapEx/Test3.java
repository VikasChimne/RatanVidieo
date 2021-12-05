package treeMapEx;
import java.util.SortedMap;
import java.util.TreeMap;
//SubMap,tailMap,headMap->Return type is sortedMap and with that SortedMap we have to create treeMap constructor
//Data must be homogeneous

public class Test3 
{
     public static void main(String[] args) 
    {
    	 TreeMap<Integer,String>t1=new TreeMap<Integer,String>();
    	 t1.put(1, "ratan");
    	 t1.put(20, "anu");
    	 t1.put(40, "durga");
    	 t1.put(10, "surya");
    	 t1.put(2, "ratan");
    	 t1.put(30, "ratan");//sorting based on key
    	 System.out.println(t1);//{1=ratan, 2=ratan, 10=surya, 20=anu, 30=ratan, 40=durga}
    	 
    	 SortedMap<Integer,String>sm1=t1.subMap(2, 30);//include 2 and exclude 30
    	 TreeMap<Integer,String>t2=new TreeMap<Integer,String>(sm1);//treeMap constructor

    	 System.out.println(t2);//{2=ratan, 10=surya, 20=anu}
    	 
    	 SortedMap<Integer,String>sm2=t1.tailMap(10);//from 10 key will printed
    	 TreeMap<Integer,String>t3=new TreeMap<Integer,String>(sm2);//treeMap constructor

    	 System.out.println(t3);//{10=surya, 20=anu, 30=ratan, 40=durga}

    	 SortedMap<Integer,String>sm3=t1.headMap(40);//below key printed
    	 TreeMap<Integer,String>t4=new TreeMap<Integer,String>(sm3);//treeMap constructor
         System.out.println(t4);//{1=ratan, 2=ratan, 10=surya, 20=anu, 30=ratan}

	}

}
