package stringsManupulation;
//Object creation of String by two ways 

//1)By using new operator->object goes in Heap memory2)without using new operator->object goes in string constant pool
public class Test1 {

	public static void main(String[] args)
{//SCP-->Before creating new object it always check previous object is similar or not if similar then doesn't create new object
		//without Using new operator object goes in String constant pool(SCP)
		String s1 = "Vicky";
		String s2 = "Nishu";
		String s3 = "Vicky";
		String s4 = new String("Vicky");
		//==operator use for Reference comparison
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//true//because both refer to same instance 
		System.out.println(s2==s3);//false
		System.out.println(s3==s4);//false.Becos s4 refers to instance created in Nonpool
//Heap Memory-->Doesn't check previous object,directly object will created.it allow duplicate	
		//Using new operator,object goes in heap memory
		String str1 = new String("Vicky");
		String str2 = new String("Nishu");
		String str3 = new String("Vicky");//new operator create separate object
		
		System.out.println(str1==str2);//false
		System.out.println(str1==str2);//false
		System.out.println(str3==str2);//false
		
//StringBuffer->Object creation is possible by only one way using new operator.object goes to heap memory
		
		StringBuffer sb1 = new StringBuffer("Vicky");
		StringBuffer sb2 = new StringBuffer("Nishu");
		StringBuffer sb3 = new StringBuffer("Vicky");
		
		System.out.println(sb1==sb2);//false
		System.out.println(sb1==sb3);//false
		System.out.println(sb2==sb3);//false
    }

}
