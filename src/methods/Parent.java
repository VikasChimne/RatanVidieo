package methods;

public class Parent
{
   void properties() 
   {
	   System.out.println("Money+Gold");
   }
}
class Child extends Parent
{
	void eat()
	{
		System.out.println("Samosa..");
	}

public static void main(String[] args)
{
	Parent p = new Parent();//no need to create Parent class object when we Inherit it
	p.properties();//output=Money+Gold
	
	Child c =new Child();//Child class object recommend to achieve Inheritance
	c.properties();//Output=Money+Gold
	c.eat();//Output=Samosa
}
}