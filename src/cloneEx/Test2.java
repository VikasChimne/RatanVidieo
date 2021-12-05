package cloneEx;

import java.util.ArrayList;

//All collection classes implements cloneable & Serializable & RandomAccess
public class Test2 
{
     public static void main(String[] args)
    {
	   ArrayList<String>al=new ArrayList<String>();
	   al.add("ratan");
       al.add("durga");
       al.add("anu");
       ArrayList<String>copy=(ArrayList<String>)al.clone();
	}

}
