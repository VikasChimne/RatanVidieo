package serializationEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test 
{
	   void serializationDemo() throws IOException
	   {
		 Emp e=new Emp (111,"ratan");  
		 FileOutputStream fos = new FileOutputStream("abc.text");
		 ObjectOutputStream oos = new ObjectOutputStream(fos);
		 oos.writeObject(e);
		 oos.close();
		 System.out.println("serialization process completed...");
	   }
        void desrialization() throws IOException, ClassNotFoundException 
        {
         FileInputStream fis = new FileInputStream("abc.text");
   		 ObjectInputStream ois = new ObjectInputStream(fis);
   		 Emp e = (Emp)ois.readObject();
   		 System.out.println(e.eid+" "+e.ename);
   		 ois.close();
        }
        public static void main(String[] args) throws IOException, ClassNotFoundException 
        {Test t = new Test();
        t.serializationDemo();
        t.desrialization();}
}
// Serialization->The process of writing the object to the file OR the process of saving the object to the file 
//to write the object-1)FileOutputStream (fos) 2)ObjectOutputStream (oos)
//For two different module public modifier not sufficient then serialization and desrialization is required
//desrialization->The process of reading the object from the file
//to write the object-1)FileInputStream (fis) 2)ObjectInputStream (ois)
////Initially a class Serialization is not supported but after implements Serialization of particular class
//Marker Interface does not contains any method
