package methods;

public class Test1_Overloading_typecasting 
{
   void m1(int a,long l)
   {
	   System.out.println("int long method");
   }
   void m1(float f)
   {
	   System.out.println("Float arg method");
   }
   public static void main(String[] args)
   {
	   Test1_Overloading_typecasting t = new Test1_Overloading_typecasting();
	   t.m1(10, 20l);
	   t.m1(10.5f);
	   t.m1(100, 200);
	   t.m1('a','b');
	   t.m1((byte)10,(short)20);
	   t.m1('a');
	   //t.m1(10.5);//error
   }
}
// Type promotion/type casting/upcasting/implicit type casting
//byte-->short-->int-->long-->float-->double
//       char-->int-->long-->