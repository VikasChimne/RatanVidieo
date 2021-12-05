package stringsManupulation;
//String is to represent one character or group of Character enclosed within double quote.
//String & String Buffer both are final classes we can't extended.Both are Present in java.lang package
//Default value of String is null
public class Test 
{
     public static void main(String[] args) 
	{
		String s1 = "Vicky";
		System.out.println(s1);
		
		String s2 = new String("Vicky");
		System.out.println(s2);
		
		char[] ch = {'a','b','c','d','e','f'};
		String s3 = new String(ch);
		System.out.println(s3);
		
		String s4 = new String(ch,1,2);//index position
		System.out.println(s4);
		
		byte[] b = {65,66,67,68,69,70};
		String s5 = new String(b);
		System.out.println(s5);
		String s6 = new String(b,3,3);
		System.out.println(s6);
	}

}
