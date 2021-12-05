package arrayListSerializationDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test
{
    public static void main(String[] args) throws IOException, ClassNotFoundException 
    {
      ArrayList<Emp>al=new ArrayList<Emp>();
      al.add(new Emp(111,"ratan"));
      al.add(new Emp(222,"durga"));
      al.add(new Emp(333,"anu"));
 //Serialization of ArrayList:Writing the object
      FileOutputStream fos = new FileOutputStream("abc.text");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(al);
      oos.close();
      System.out.println("Serialization process completed");
//Desrialization process:Reading the object
      FileInputStream fis = new FileInputStream("abc.text");
      ObjectInputStream ois = new ObjectInputStream(fis);
      ArrayList<Emp>newal = (ArrayList<Emp>)ois.readObject();
      for(Emp e:newal)
      {
    	  System.out.println(e.eid+" "+e.ename);
      }
      ois.close();
	}
}//#Note1-In Collection to do the Serialization->every object collection must be serializable
//class Emp implements Serializable{}
//class Customer implements Serializable{}
//class Student implements Serializable{}
//ArrayList al = new ArrayList();
//al.add(new Emp());
//al.add(new Student());
//al.add(new Customer());

//#Note2-In which order we done serialization same order we have to do in desrialization
//new Emp();
//new Student();
//new Customer();