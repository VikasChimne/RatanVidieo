package methods; 
//Abstract class-The class contain atleast one abstract method.abstract classes may contain abstarct method or not,
//but for abstract class object creation is not possible
abstract class Base 
{
     abstract void m1();//abstract method have only method declaration
     abstract void m2();
      void m3()//normal method have method declaration and method implementation
      {
    	  System.out.println("m3 method");//method implementation
      }
}
class Base1 extends Base
{
	void m1()
	{
		System.out.println("m1 Method");
	}
	void m2()
	{
		System.out.println("m2 Method");
	}
	static public void  main(String[] args)
	{
		//Base b=new Base();error:Base is abstract,cannot be instantiated
		Base b=new Base1();//parent class can hold the object of child
		b.m1();b.m2();b.m3();
	}
}
