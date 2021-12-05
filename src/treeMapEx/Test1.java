package treeMapEx;
import java.util.TreeMap;//1)usung Default constructor
//To perform sorting1)data must be homogeneous 2)data must implements comparable interface
//The sorting is done on one method-compareTo()
//Sorting alwyas performed based on keys but not values#Null value is not allow
public class Test1 {

	public static void main(String[] args) {
		TreeMap<String,Integer>t=new TreeMap<String,Integer>();
		t.put("ratan", 111);
		t.put("anu", 222);
		t.put("durga", 333);
		t.put("surya", 444);
		System.out.println(t);//{anu=222, durga=333, ratan=111, surya=444}
		
		TreeMap<Integer,String>t1=new TreeMap<Integer,String>();
		t1.put(2, "durga");
		t1.put(3, "surya");
		t1.put(5, "anu");
		t1.put(8, "ratan");
		System.out.println(t1);//{2=durga, 3=surya, 5=anu, 8=ratan}

	}

}
