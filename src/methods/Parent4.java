package methods;

public class Parent4 //Without using this and super keyword
{
   void m1()
   {
	   System.out.println("parent m1()");
   }
}
   class Child4 extends Parent4
   {
	   void m1()
	   {
		   System.out.println("Child m1()");
	   }
	   void m2()
	   {
		   m1();
		   m1();
	   }
	   public static void main(String[] args)
	   {
		   Child4 c = new Child4();
		   c.m2();//priority goes to child class
	   }
   }

//Output:Child m1()
//       Child m1()
