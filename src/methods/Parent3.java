package methods;  //only Using same variable then We Can use 'this' and 'super' keyword

public class Parent3
{
   int a=10,b=20;
}
class Child3 extends Parent3
{
	int a=100, b=200;
	void add(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);//'this'keyword represent current class
		System.out.println(super.a+super.b);//'super'keyword represent parent class
	}
	public static void main(String[] args)
	{
		Child3 c= new Child3();
		c.add(1000, 2000);
	}
}
//Output:3000
//        300
//         30