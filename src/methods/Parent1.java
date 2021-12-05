package methods;//Using Different Variable name

public class Parent1 
{
    int a=10,b=20;
}
class Child1 extends Parent1
{
	int x=100,y=200;
	void add(int i,int j)
	{
		System.out.println(i+j);
		System.out.println(x+y);
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		Child1 c = new Child1();
		c.add(1000, 2000);
	}
}
//output:3000
//       300
 //      30