package methods;

public class TestClient1
{
	public static void main(String[] args)
	{
		Services s = new Services();//Object Creation
		s.wish();//instance method Call by object name
		s.add(10, 20);//instance method Call object name
		
		Services.courseInfo("CoreJava");//Static method call by class name
		Services.disp(10, 'y', 10.5f, false);
	}
}
