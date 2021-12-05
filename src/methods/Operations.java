package methods;

public class Operations 
{
	//String username="Vicky";
	//String password="vikas123";
	
      void loginStatus(String username, String password)//instance method
    {
    	
    	if(username.equals("Vicky") && password.equals("vikas123"))
    	{
    		System.out.println("login success");
    	}
    	else
    	{
    		System.out.println("login failed");
    	}
    }
    	public static void main(String[] ar)
    	{
    	Operations t =new Operations();
    	t.loginStatus("Vicky","vikas123");
    	}
    
}

   
