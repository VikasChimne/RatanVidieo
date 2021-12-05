package methods;

public  class Parent5 
{
   void m1()
   {
	   System.out.println("Parent m1()");
   }
}
   class Child5 extends Parent5
   {
	    void m1()
	   {
		   System.out.println("Child m1()");
	   }
	   void m2()
	   {
		   this.m1();
		   super.m1();
	   }
	   public static void main(String[] args)
	   {
		   Child5 c = new Child5();
		   c.m2();
	   }
   }
   //Output:Child5 m1()
   //       Parent m1()
