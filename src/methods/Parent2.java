package methods;  //Using same Variable Name then Priority goes to Local variable

public class Parent2 
{
   int a=10,b=20;
}
class Child2 extends Parent2
{
	int a=100,b=200;
	void add(int a,int b)//Local variable
	{
		System.out.println(a+b);
		System.out.println(a+b);
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		Child2 c = new Child2();
		c.add(1000, 2000);
	}
}//Priority goes to Local variable
//Output:3000    
//       3000
//       3000