package methods;

abstract class Base2 
{
     abstract void m1();//abstract method declaration
     abstract void m2();
     abstract void m3();
     void m4()//method declaration
     {
    	 System.out.println("m4 method implement");//method implementation
     }
}
abstract class Base3 extends Base2
{
	void m1()
	{
		System.out.println("m1 method implement");//method implementation
	}//m2 & m3 method unimplemented
}//so again abstract class
abstract class Base4 extends Base3//so again abstract class
{
	void m2()
	{
		System.out.println("m2 method implement");//method implementation
	}//m3 method unimplemented
}//so again extends
class Base5 extends Base4
{
	void m3()
	{
		System.out.println("m3 method implement");
	}
	public static void main(String[] args)
	{
		Base2 b=new Base5();//parent class can hold the object class
		b.m1();b.m2();b.m3();
	}
}















