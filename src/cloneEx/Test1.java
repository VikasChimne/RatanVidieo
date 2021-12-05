package cloneEx;

public class Test1 implements Cloneable//initially class doesn't support Clonening process
{     int a =10;
      int b =20;
	public static void main(String[] args) throws CloneNotSupportedException
    {
		Test1 t1 = new Test1();
        System.out.println(t1.a);
        System.out.println(t1.b);
        Test1 t2 = (Test1)t1.clone();//typecasting(Test1)
        System.out.println(t2.a);
        System.out.println(t2.b);
     }
}//If you want to clonening process your class must implements cloneable interface
//Clone->The Process of creating exactly duplicate object.clone() return type is Object Class
//Clone()-doesn't load the class,directly it clone the data from heap memory
//Cloneable is marker interface

//Marker Interface->Doesn't contain any method
//when some class implementing marker interface your class acquring clonening capabilities that is called marker interface capabilities
//#Every Collection class implementing two Interfaces->1)cloneable 2)Serializable
