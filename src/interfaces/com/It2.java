package interfaces.com;
//upto java 1.7->Interface allow only abstract method
//java 1.8-> Interface allow Abstract,static,default method,*inside interface main method allowed*
public interface It2 
{
   void m1();
   default void m2()
   {
	   System.out.println("default method implements");
   }
   static void m3()
   {
	   System.out.println("static method implements");
   }
}
class Raj implements It2
{
	public void m1()
	{
		System.out.println("m1 method implements");
	}
	public static void main(String[] args)
	{
		Raj r = new Raj();
		r.m1();
		r.m2();
		It2.m3();//static method call using class name
	}
}
