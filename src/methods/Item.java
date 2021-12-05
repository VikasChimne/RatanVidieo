package methods;
//Abstract methods can have any return type and any number of argument
//Inside abstract class constructor declaration possible.abstarct class constructor executed only when we declare child class
//where constructor are executed but object not created of abstract class
//Inside abstract class main method possible but object creation is not possible
abstract class Item 
{
   Item()
   {
	   System.out.println("abstract class constructor");
   }
}
class Item1 extends Item
{
	Item1()
	{
		super();//no need to declare by default compiler create--call the super class constructor
		System.out.println("normal class constructor");
	}
	public static void main()
	{
		new Item1();
	}
}
