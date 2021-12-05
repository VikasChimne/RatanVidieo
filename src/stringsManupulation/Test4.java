package stringsManupulation;

//equals()method belong to Object class-perform Reference Comparison
//Object class contain equals() & it return type of equals() is boolean
//pointing to same object then output --true
//String class is overriding equals(),internally check -Content comparison
//StringBuffer class not overriding equals()-->Then it uses object class & object class perform Reference comparison

//== operator perform Reference comparison
public class Test4 
{   Test4(String str)//constructor
	{   }
    public static void main(String[] args) 
    {
//object:equals();perform reference comparison
    	Test4 t1 = new Test4("Vicky");
    	Test4 t2 = new Test4("Vicky");
    	System.out.println(t1.equals(t2));//false
    	System.out.println(t1==t2);//false
//String:overriding equals()-perform content comparison
    	String s1 = "Nishu";
    	String s2 = "Nishu";
    	System.out.println(s1.equals(s2));//true
    	System.out.println(s1==s2);//true
    	
    	String str1 = new String("Raj");
    	String str2 = new String("Raj");
    	System.out.println(str1.equals(str2));//true
    	System.out.println(str1==str2);//false
    	
//StringBuffer:not overriding equals()-it uses object class to perform ref comparison    	
    	StringBuffer sb1 = new StringBuffer("Shiv");
    	StringBuffer sb2 = new StringBuffer("Shiv");
    	System.out.println(sb1.equals(sb2));//false
    	System.out.println(sb1==sb2);//false
	}

}
