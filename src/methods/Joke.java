package methods;

abstract class Joke 
{
	{
		System.out.println("abstract class instance block");
	}
	static 
	{
		System.out.println("abstract class static block");
	}
	Joke()
	{
		System.out.println("abstract class constructor");
	}
}
class Joke1 extends Joke
{
	Joke1()
	{
		super();
		System.out.println("normal class constructor");
	}
	public static void main(String[] args)
	{
		new Joke1();
	}
}//output:
//abstract class static block
//abstract class instance block
//abstract class constructor
//normal class constructor