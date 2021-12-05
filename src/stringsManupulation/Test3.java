package stringsManupulation;
//String is Immutable once you create object it doesn't allow any modification in existing object
//String buffer is Mutable and it allow modification

public class Test3 
{
     public static void main(String[] args)
	{
		String s = "Vicky";//Immutable-modification are not allowed
		s.concat("Developer");
		System.out.println(s);//Vicky
		
		StringBuffer sb = new StringBuffer("Nishu");//mutable-modification allowed
		sb.append("angel");
		System.out.println(sb);//Nishuangel
		
		String str1 = "Vicky";//concat() used to combine the two string object.and return new string object.
		String str2 = str1.concat("Developer");
		System.out.println(str2);//VickyDevloper
		
		String s1 = "Vicky";
		s1 = s1.concat("Developer");//Reassigning reference variable
		System.out.println(s1);//VickyDevloper
    }

}
