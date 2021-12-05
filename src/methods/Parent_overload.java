package methods;

public class Parent_overload 
{
    void m1(int a)
    {
    	System.out.println("parent int arg method");
    }
}
class Child6 extends Parent_overload
{
	void m1(int a,int b)
	{
		System.out.println("Child int,int arg method");
	}
	public static void main(String[] args)
	{
		Child6 c=new Child6();
		c.m1(10);
		c.m1(10,20);
	}
}

