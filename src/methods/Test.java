package methods;

public class Test 
{
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	static void login(String username,String password)
	{
		if(username.equals("vicky") && password.equals("vikas123"))
		{
			System.out.println("Login is Successful");
		}
		else
		{
			System.out.println("Login is failed");
		}
	}
    public static void main(String[] args)
    {
    	Test t=new Test();
    	t.add(23, 12);
    	
    	Test.login("vicky", "vikas123");
    	
    	
    }
}
