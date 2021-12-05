package interfaces.com;

interface It3 
{
   default void m1()
   {
	   System.out.println("It3 m1 method implement");
   }
}
interface It4
{
	default void m1()
	{
		System.out.println("It4 m1 method implements");
	}
}
class Deep implements It3,It4
{
	public void m1()
	{
		System.out.println("Common method");
	}
	public static void main(String[] args)
	{
		Deep d = new Deep();
		d.m1();
	}
}
//Output==Common method