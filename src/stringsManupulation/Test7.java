package stringsManupulation;

public class Test7 
{
     public static void main(String[] args) 
     {
		StringBuffer sb1 = new StringBuffer("ratanit");
		System.out.println(sb1.delete(2, 4));
        System.out.println(sb1.deleteCharAt(3));
        
        StringBuffer sb2 = new StringBuffer("durgasoft");
        System.out.println(sb2.reverse());
        
        StringBuffer sb3 = new StringBuffer("ratan");
        sb3.append("soft");
        System.out.println(sb3);
        
        StringBuffer sb4 = new StringBuffer("ratanit");
        sb4.insert(0, "hi");
        System.out.println(sb4);
        
        StringBuffer sb5 = new StringBuffer("hi durga soft");
        sb5.replace(3, 9, "ratan");
        System.out.println(sb5);
	 }

}
