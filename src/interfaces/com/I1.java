package interfaces.com;

//Interface is the place where we declare only functionality of the project
//Abstract class is a place where you can declare both Abstract methods as wel as normal methods
//not possible to create object of interface
//class extends class *interface extends interface *class implements interface
//one class can implements multiple interface
interface I1 //by default abstract
{
  void m1();//interface methods are by default public abstract
  void m2();
}
class Test implements I1
{   @Override
	public void m1() //Interface implements method are always public 
	{
      System.out.println("m1 method implements");
	}
    @Override
	public void m2() //Interface implements method are always public
    {
		System.out.println("m2 method implements");
	}
	public static void main(String[] arhgs)
	{
		Test t = new Test();
		t.m1();
		t.m2();
     I1 i = new Test();//interface can hold the implementation class object
	   i.m1();        //WebDriver driver = new ChromeDriver();
	   i.m2();
	}
}
