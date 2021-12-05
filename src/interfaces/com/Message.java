package interfaces.com;

interface Message 
{
  void wish();
}
class Vicky implements Message
{@Override
	public void wish() 
    {
	  System.out.println("Hi Friends");		
	}	
}
class Nishu implements Message
{@Override
	public void wish() 
    {
		System.out.println("Hi Uncle Good Morning");
	}
	public static void main(String[] args)
	{
		Message m1=new Vicky();
		m1.wish();
		Message m2=new Nishu();
		m2.wish();
	}
}