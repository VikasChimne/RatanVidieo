package interfaces.com;
//One interface can have one implementation class or more than one implementation class
//Every class contain there own implementation
//Interface method have any return type and any no.of Arguments
//overloading is possible
interface Message1 
{
  void wish1();
  void wish2();
}
abstract class Ratan implements Message1
{@Override
	public void wish1() 
    {
		System.out.println("Hi friends");
//If implementation class unable to implement all abstract methods then declare particular class as Abstract
//Complete the implementation in two child classes.1)first child class abstract 2)next child class Normal
	}
}
class Anu extends Ratan
{@Override
	public void wish2() 
    {
		System.out.println("Good Morning");
	}
	public static void main(String[] args)
	{
		Anu a = new Anu();
	     a.wish1();
	     a.wish2();
		Message1 m2 = new Anu();
		m2.wish2();
	}
}
