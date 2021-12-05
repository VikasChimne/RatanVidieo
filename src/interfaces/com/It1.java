package interfaces.com;
//Declaring one interface inside another interface is called Nested Interface
//Declaring one interface inside abstract class is called Nested Interface
//Declaring one interface inside normal class is called Nested Interface
interface It1 //by default abstract
{
   void m1();//by default public abstract
   //int a= 10;Interface variable by default public static final
   interface It2  //Nested Interface
   {
	   void m2();
   }
}
class Kittu implements It1,It1.It2
{@Override
	public void m2() 
    {
      System.out.println("m1 method implements");
	}
 @Override
	public void m1() 
    {
		System.out.println("m2 method implements");
	}
	public static void main(String[] args)
	{
		Kittu t = new Kittu();
		t.m1();
		t.m2();
	}
}

