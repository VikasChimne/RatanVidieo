package stringsManupulation;
//length-is a Variable to find length of array
//length()-is a Method to find out the length of String
//Method Chaining-String trim().subString().length()

public class Test6 
{
      public static void main(String[] args)
      {
		String s1= "ratan";
        System.out.println(s1.charAt(2));
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.lastIndexOf('a'));
        System.out.println(s1.length());
         
        String s2 = "hi sir how r u";
        System.out.println(s2.startsWith("hi"));
        System.out.println(s2.startsWith("u"));
        System.out.println(s2.endsWith("u"));
        System.out.println(s2.contains("sir"));
//Method Chaining        
        String s3 = "   ratan   ";
        System.out.println(s3.length());
        System.out.println(s3.trim().length());
        System.out.println(s3.trim().substring(2).length());
        System.out.println(s3.trim().substring(1, 3).length());
        System.out.println(s3.trim().substring(1, 4));
//length variable vs length() method
        int[] a = {10,20,30};
        System.out.println(a.length);
        String str = "ratan";
        System.out.println(str.length());
        
	  }

}
