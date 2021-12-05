package methods;

public class Services 
{
	//instance methods: Access the instance methods using object Name
	void wish()
	{
		System.out.println("Good Morning Students...");
	}
	void add(int num1,int num2)
	{
		System.out.println(num1+num2);
	}
	//static methods: Access the static method using class name
	static void courseInfo(String name)
	{
		if(name.equals("CoreJava"))
		{
			System.out.println("Core java new batch date 19th nov fee 3000");
		}
		else if (name.equals("AdvJava"))
		{
			System.out.println("Advjava new batch date 19th nov fee 300");
		}
		else
		{
			System.out.println("The cource is not avilable");
		}
	}
	static void disp(int a,char ch,float f,boolean b)
	{
		System.out.println(a+" "+ch+" "+f+" "+b);
	}
}




	 
		

	


