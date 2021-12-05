package interfaces.com;

public interface Bank 
{
  void deposit();
  void withdraw();
}
abstract class Helper implements Bank
{
	public void deposit()
	{
		System.out.println("This is deposit implementation");
	}
}
class Key extends Helper
{@Override
	public void withdraw() 
    {
	 System.out.println("withdraw implements");	
	}
}
class TestClient
{
	public static void main(String[] args)
	{
		Key k = new Key();
		k.deposit();
		k.withdraw();
	}
}
//Output=This is deposit implementation
//        withdraw implements